package com.choongang;

public class L_GetMaxNumberFromString {
    public int getMaxNumberFromString(String str) {
        // TODO:
        int maxNumber = 0;
        for ( int i=0; i <str.length(); i++){
            char currentChar = str.charAt(i);
            int currentInteger =Character.getNumericValue(currentChar); // 따로따로 가져오는 코드
            if(maxNumber<currentInteger);   //값의 value 를 가져오는 거
                maxNumber=currentInteger;

                //Integer.max_value
            //Integer.min_value   아예 쓸 수 있는 게 있으니 찾아보기
            //
        }
        return maxNumber;
    }
}
