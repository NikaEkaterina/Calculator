package com.example.HelloWorld;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        int[] masForTask4 = new int[20];
        int maxN = -10;
        int minP = 10;
        for (int i = 0; i<masForTask4.length; i++){
            masForTask4[i] = (int) Math.round((Math.random()*21-10));
            if (masForTask4[i]<0&&maxN<masForTask4[i] ){
                maxN=masForTask4[i];
            }
            if (masForTask4[i]>0&&minP>masForTask4[i] ){
                minP=masForTask4[i];

            }

        }
        int[] masForTask4ChMinMax = new int[20];
        for (int i = 0; i<masForTask4ChMinMax.length; i++){
            if (maxN==masForTask4[i]||minP==masForTask4[i]){
                if (maxN==masForTask4[i]){
                    masForTask4ChMinMax[i]=minP;
                }
                if (minP==masForTask4[i]){
                    masForTask4ChMinMax[i]=maxN;
                }
            }
            else {
                masForTask4ChMinMax[i]=masForTask4[i];
            }
        }
        System.out.println(Arrays.toString(masForTask4));
        System.out.println("максимальный отрицательный элемент:" +maxN);
        System.out.println("минимальный положительный элемент:" +minP);
        System.out.println(Arrays.toString(masForTask4ChMinMax));

    }
}
