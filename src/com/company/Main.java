package com.company;

public class Main {

    public static void main(String[] args) {
        int [] ar=new int[100];
        Array array = new Array(ar);
        array.fillEvenNumbers();
        array.fillRandomNumbers();
        array.average();
        array.devideThree();
        array.evenIndex();
        array.sumOfEvenIndex();
        array.bubleSort();
        array.minimum();
        array.maximum();
        array.printSigns();
    }
}
