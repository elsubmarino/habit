package com.habit.util;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString(exclude = "pageList")
public class PageMaker<T> {
    private Page<T> result;

    private Pageable prevPage;
    private Pageable nextPage;

    private int currentPageNum;
    private int totalPageNum;

    private Pageable currentPage;
    private List<Pageable> pageList;

    private int perPageNum = 10;

    public PageMaker(Page<T> result){
        this.result=result;
        this.currentPage = result.getPageable();
        this.totalPageNum=result.getTotalPages();
        this.pageList=new ArrayList<>();
        calcPages();
}

    private void calcPages(){
        int tempEndNum = (int) (Math.ceil(this.currentPageNum / (double)perPageNum) * perPageNum);
        int startNum = tempEndNum - perPageNum - 1;

        Pageable startPage = this.currentPage;

        for (int i = startNum; i < this.currentPageNum; i++) {
            startPage = startPage.previousOrFirst();
        }

        this.prevPage = startPage.getPageNumber() <= 0 ? null : startPage.previousOrFirst();

        if (this.totalPageNum < tempEndNum) {
            tempEndNum = this.totalPageNum;
            this.nextPage = null;
        }
        for (int i = startNum; i <= tempEndNum; i++) {
            pageList.add(startPage);
            startPage = startPage.next();
        }
        this.nextPage = startPage.getPageNumber() + 1 < totalPageNum ? startPage : null;
    }
}
