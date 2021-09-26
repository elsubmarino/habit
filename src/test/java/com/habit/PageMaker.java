package com.habit;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class PageMaker<T> {
    Pageable prevPage;
    Pageable nextPage;
    List<Pageable> pageList;
    Page<T>result;
    int totalPage;
    int currentPageNum;
    Pageable currentPage;
    public PageMaker(Page<T> result){
        this.result=result;
        currentPage = result.getPageable();
        currentPageNum=currentPage.getPageNumber()+1;
        totalPage=result.getTotalPages();
        pageList=new ArrayList<>();
    }

    public void calcPages(){
        int tempEndPageNum = (int)(Math.ceil(currentPageNum/(double)10)*10);
        int startPageNum = tempEndPageNum-9;
        Pageable startPage = currentPage;
        for(int i=startPageNum;i<currentPageNum;i++){
            startPage = startPage.previousOrFirst();
        }
        prevPage = startPage.getPageNumber()<=0?null:startPage.previousOrFirst();
        if(tempEndPageNum > totalPage){
            tempEndPageNum=totalPage;
            nextPage=null;
        }
        for(int i=currentPageNum;i<=tempEndPageNum;i++){
            startPage=startPage.next();
            pageList.add(startPage);
        }
        nextPage=startPage.getPageNumber()+1<totalPage?startPage:null;
    }

}
