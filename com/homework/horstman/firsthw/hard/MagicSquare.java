package com.homework.horstman.firsthw.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
Напишите программу, вводящую двумерный массив целочисленных значений
и определяющую, содержится ли в нем магический квадрат (т.е. одинаковая
сумма значений во всех строках, столбцах и диагоналях). Принимая строки
вводимых данных, разбивайте их на отдельные целочисленные значения,
прекратив этот процесс, когда пользователь введет пустую строку.
 */
/* Не понял как организовать ввод, чтоб при пустой строке выкидывало
при организации двумерного массива через ArrayList взорвался мозг немножко
 */
public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList<ArrayList<Integer>> square1 = new ArrayList<ArrayList<Integer>>();
        //ArrayList<Integer> string = new ArrayList<>();
        int[][] square = new int[5][5];
        System.out.println("Insert numbers into matrix:");
       for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square[i][j]=in.nextInt();
            }
        }
        int[] sumOfString= new int[5];
        int[] sumOfColumn=new int[5];
        int[] sumOfDiag=new int[2];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                sumOfString[i]+=square[i][j];
                sumOfColumn[j]+=square[i][j];
                if(i==j){
                    sumOfDiag[0]+=square[i][j];
                }
                if(i==(i-j)){
                    sumOfDiag[1]+=square[i][j];
                }
            }
        }
        int avgString = 0;
        int avgColumn = 0;
        int flag=0;
        int flag1=0;
        for(int i = 0;i<5;i++){
            avgString+=sumOfString[i];
            avgColumn+=sumOfColumn[i];
            if((avgString/(i+1))==sumOfString[i]){
                flag++;
            }
            if((avgColumn/(i+1))==sumOfColumn[i]){
                flag1++;
            }
        }
        if((flag1==5)&&(flag==5)&&(sumOfDiag[0]==sumOfDiag[1])){
            System.out.println("MagicSquare");
        }
        }
    }


