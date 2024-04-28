package org.example.Project;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        String str="abracadabra";
        int index=-1;
        char c=' ';
        for (char i:str.toCharArray()) {
            if(str.indexOf(i) == str.lastIndexOf(i)){
                c=i;
                break;
            }else{
                index +=1;
            }
        }
        if(index==1){
            System.out.println("all characters are repeating");
        }else{
            System.out.println("first non-repeated character is "+c);
        }

    }
    }


