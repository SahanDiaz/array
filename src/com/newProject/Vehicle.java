package com.newProject;

import static com.newProject.Main.scanner;

public class Vehicle {


    int[] arr = new int[10];

    public void arFnc(){
        for (int x =0;x<arr.length;x++){
            arr[x] = x*4;
        }
        for (int itm :
                arr) {
            System.out.println("values : " + itm);
        }
    }
    public void setNum(int input){
        int[] arr2 = new int[input];
        int sum=0;
        System.out.println("please enter "+ input +"numbers to get sum \r");
        try {
            for (int x=0;x<arr2.length;x++){
                System.out.print("num " + x+" : ");
                arr2[x]= scanner.nextInt();
            }
        } catch (Exception InputMismatchException) {
            System.out.println(InputMismatchException);
        }
        try {
            for (int itm :
                    arr2) {
                System.out.println("values : " + itm);
                sum +=itm;

            }
        }catch (Exception InputMismatchException){
            System.out.println(InputMismatchException);
        }

        System.out.println("total : " + sum);
    }



}
