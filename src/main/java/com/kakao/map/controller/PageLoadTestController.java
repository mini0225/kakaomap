package com.kakao.map.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
 * @RequestMapping 에서 요청받은 메세지 판별
 * controller - 메세지의 호출을 받을수 있다. annotation 필수
 * String (호출, 요청)- return(응답)
 * return 에는 html 파일명이 들어옴.
 * 데이터 이동시에 텍스트 or binary(이진법 0,1) 사용됨.
 * html 파일이 텍스트로 전환되어 들어옴.
 * */


@Controller
public class PageLoadTestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public String test1(){
        System.out.println("t1요청 들어옴?");
        return "test1"; //<-Thymeleaf 가 html파일을 (확장자떼고) 들고올수있게한다.
    }

    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String test2(){
        System.out.println("t2요청 들어옴?");
        return "test1";
    }

    @RequestMapping(value = "/test/page", method = RequestMethod.GET)
    public String a(){
        System.out.println("t3요청 들어옴?");
        return "test/test2"; // 폴더명/파일명
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public String map(){
        return "map";
    }

}
