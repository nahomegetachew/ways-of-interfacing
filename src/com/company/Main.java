package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {


        sharedMemory();
        messagePassing();
        proceduralInterfacing();

    }

    public static void sharedMemory(){
        int[] sharedArray = new int[100] ;
        setSharedMemory(sharedArray);
        getSharedMemory(sharedArray);
    }

    public static void setSharedMemory(int[] array){

        Random rand = new Random();
        for(int i = 0; i < array.length ; i++){
            array[i] = rand.nextInt(100);
            System.out.println(array[i] + " has been added to the index " + i + " of the array");
        }
    }

    public static void getSharedMemory(int[] array){
        //Access and print
        for(int i = 0; i < array.length ; i++){
            System.out.println("Value at index " + i + " of the array is: " + array[i]);
        }
    }

    public static void messagePassing(){
        messagePasser();
    }

    public static void messagePasser(){
        //Pass a message whenever its counting reaches or passes the value 10
        String message = "hello";

        for(int i = 0; ;i++){
            if(i == 10){
                messageReciever(message);
                break;
            }
        }
    }

    public static void messageReciever(String message){

        if(messagerecieved){
            System.out.println("Value of Message from messagePasser is: " + message);
        }
    }



    public static void proceduralInterfacing(){
        System.out.println("ProceduralInterfacing: Call procedure");
        System.out.println("ProceduralInterfacing: A random number generated in the range of 100 is :" + procedure());
        System.out.println("Procedural Interfacing: Control returned to Main");
    }

    public static int procedure(){
        System.out.println("Procedure: The call method is called from the running part of the code(proceduralInterfacing) and giving it control till it finish's execution");
        Random rand = new Random();
        int number = rand.nextInt(100);
        return number;
    }
}
