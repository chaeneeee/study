//package com.choongang;
//
//import com.sun.jdi.IntegerType;
//
//public class E_MakeDigits {
//    public String makeDigits(int num) {
//        String str = "" ;
//        // TODO:
//        //문자열, 문자열 덧셈이 된다. "아" +"아"
//        //문자열과 다른 타입이 만나면 문자열이 세서 문자열로 받아들여짐
//        //false + "22" = 문자열 false 22 가 된다.
//        //"22"+2 > 문자열 222 가 된다 .
//        //num+"" ; 숫자 +"" 빈 문자열 더하면 숫자가 문자열로 바뀐다
//        //이거 많이 쓰임
//        for(int i =1; i<=num ; i ++ ) {
//            str = str + i;
////       이렇게도 가능     str =str + Integer.toString(i+1);
//        }
//        return  str;
//    }
//}
