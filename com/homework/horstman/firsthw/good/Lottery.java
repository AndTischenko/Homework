package com.homework.horstman.firsthw.good;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Напишите программу, выбирающую и выводящую лотерейную комбинацию
из шести отдельных чисел в пределах от 1 до 49.
Чтобы выбрать шесть отдельных чисел, начните со списочного массива,
заполняемого числами от 1 до 49.
Выберите произвольный индекс и удалите элемент массива. Повторите эти
действия шесть раз подряд. Выведите полученный результат в отсортированном порядке.
 */
public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();
        for(int i = 1;i<=49;i++){
            lottery.add(i);
        }
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=5;i++){
            int randomIndex = random.nextInt(45);
            result.add(i,lottery.get(randomIndex));
            lottery.remove(randomIndex);
        }
        System.out.println(result);
        Collections.sort(result);
        System.out.println(result);
    }
}
