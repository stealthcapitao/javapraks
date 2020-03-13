/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Massivi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Задание 1");
//        Scanner input = new Scanner(System.in); 
//    System.out.println("Введите количество элементов массива: ");
//    int size = input.nextInt(); 
//    int array[] = new int[size]; 
//    System.out.println("Вводите элементы массива:");
//    for (int i = 0; i < size; i++) {
//        array[i] = input.nextInt(); 
//    }
//    System.out.print ("Ваш массив:");
//    for (int i = 0; i < size; i++) {
//        System.out.print (" " + array[i]); 
//    }
//    System.out.println();

        double[] myArray = {11, 5.6, 11.2, 10.9}; 
        double max = Double.MIN_VALUE;
        
        for(int i = 0; i < myArray.length; i++){
            max = Math.max(max, myArray[i]);
        }
        System.out.println("Максимальный элемент массива c помощью Math.max: " + max);
    
        double max2 = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max2){
                max2 = myArray[i];
            }
        }
        System.out.println("Максимальный элемент массива c помощью цикла: " + max2);
        
        System.out.println("Задание 2");
        try{
        Scanner input = new Scanner(System.in); 
    System.out.println("Введите количество элементов массива: ");
    int size = input.nextInt(); 
    int array[] = new int[size]; 
    System.out.println("Вводите элементы массива:");
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt(); 
    }
    System.out.print ("Ваш массив:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); 
    }
    System.out.println();
        double sum=0;
    for(int i=0; i < array.length; i++) {
        sum=sum+ array[i];
    }
    System.out.println("Сумма элементов массива: " + sum);
    
     for(int i=0; i < array.length; i++) {
         array[i] = array[i] * 2;
     }
     
     System.out.print ("Ваш массив, но каждый элемент вдвое больше:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); 
    }
    System.out.println();
        
        
    System.out.println("Задание 4");
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        double max3 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Наименьший элемент массива: " + min/2);
        System.out.println("Наибольший элемент массива: " + max2/2);
        int razn;
        razn = (int) (max2/2 - min/2);
        System.out.println("Разность наибольшенго и наименьшего элемента массива: " + razn);
    } 
        catch(Exception e){
            System.out.println("Допущена ошибка");
        }
    }
}
