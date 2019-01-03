package com.company;

public class Main {

    public static int factorial(int number){
        System.out.println("num="+number);

        if(number == 1){
            return 1;
        } else {
            int result = number*factorial(number-1);
            return result;
        }
    }

    public static void main(String[] args) {
        int num = 3;
	System.out.println("n="+3+" 3!="+factorial(3));
    }
}
