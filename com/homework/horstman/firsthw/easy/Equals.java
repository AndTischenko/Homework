package com.homework.horstman.firsthw.easy;
/*
В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t
при вызове метода s . equals (t), но не с помощью операции s != t. Придумайте другой пример, в котором не применяется метод substring ().
 */
public class Equals {                            //не совсем понял это задание
    public static void main(String[] args) {
        String str = new String("lol");
        String str1 = "lol";
        if(str.equals(str1)){
            System.out.println("Верное сравнение");
        }
        if(str==str1){
            System.out.println("Никогда не сработает");
        }else{
            System.out.println("Неравны тк сравнинаваются данные из разных областей памяти");
        }
    }
}
