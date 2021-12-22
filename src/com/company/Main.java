package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var boxerWeight1 = 78.2F;
        var boxerWeight2 = 82.7F;
        var generalWeight = boxerWeight1 + boxerWeight2;
        System.out.println( "Общий вес двух бойцов " + generalWeight);
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println( "Разница веса между бойцами составляет " + differenceWeight);
    }
}
