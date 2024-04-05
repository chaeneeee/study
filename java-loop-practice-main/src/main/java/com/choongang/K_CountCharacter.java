package com.choongang;

public class K_CountCharacter {
    public int countCharacter(String str, char letter) {
        // TODO:
        int count = 0;
        for(int i= 0 ; i <str.length(); i++ ){
            if(str.charAt(i) == letter){   //입력값과 letter 값이 겹치는 부분이어야하므로
            count++;
        }

    }
        return count;
    }}
