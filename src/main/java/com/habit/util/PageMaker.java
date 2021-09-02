package com.habit.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class PageMaker<T> {
    private Page<T> result;

    private Pageable prevPage;
    private Pageable nextPage;

    private int currentPageNum;
    private int totalPageNum;

    private Pageable currentPage;
    private List<Pageable> pageList;

    public PageMaker(Page<T> result){
        this.result=result;
        this.currentPage = result.getPageable();
        this.totalPageNum=result.getTotalPages();
        this.pageList=new ArrayList<>();
        calcPages();
    }

    private void calcPages(){
        // 페이징에 대한 계산 처리.
        int tempEndNum = (int) (Math.ceil(this.currentPageNum / 10.0) * 10);
        // 임시 끝번호 = 현재 페이징 게산이 실수 값으로 나온다면 정수값으로 변환.
        // Math.ceil은 올림 처리를 해줌.
        int startNum = tempEndNum - 9;

        Pageable startPage = this.currentPage;

        for (int i = startNum; i < this.currentPageNum; i++) {
            startPage = startPage.previousOrFirst();
            //이전 페이지로 가거나 처음 페이지로 이동하라
            // 총 10페이지가 있을 때, 5페이지를 보고 있으면
            // 1,2,3,4 (현재 페이지의 이전 내용들을 표시.)
        }

        this.prePage = startPage.getPageNumber() <= 0 ? null : startPage.previousOrFirst();
        //페이징은 시작 페이지를 계산하는 이유는
        //게시물의 숫자가 늘어나면 시작 페이지 번호로 달라지기 때문.

        log.info("tempEndNum: " + tempEndNum);
        log.info("total : " + totalPageNum);

        if (this.totalPageNum < tempEndNum) {
            tempEndNum = this.totalPageNum;
            this.nextPage = null;
            //페이징 다음 처리.
            // 최대값을 초과한다면 null을 리턴하고
            // 그렇지 않다면, 최대 페이지를 리턴.
        }
        for (int i = startNum; i <= tempEndNum; i++) {
            // startNum은 게시물의 페이징 시작 번호.
            // tempEndNum은 게시물의 페이징 끝 번호.
            pageList.add(startPage);
            //페이지 단위로 리스트에 저장.
            startPage = startPage.next();
            //다음값 가리켜서 게시물 페이징의 시작번호로 이용.

        }
        this.nextPage = startPage.getPageNumber() + 1 < totalPageNum ? startPage : null;
    }
}
