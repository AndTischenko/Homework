package com.homework.horstman.firsthw.medium;

import java.util.Scanner;

/*
Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки
 */
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for(int i=0;i<str.length();i++){
            for(int j = i;j<str.length()+1;j++){
                String substr = str.substring(i,j);
                System.out.println(substr);
            }
        }
    }
}
