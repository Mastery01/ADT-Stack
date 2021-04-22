/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;
import java.util.EmptyStackException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * *CPS 350 Section 01
 * Assignment 1
 * Implementing Stack ADT using a Array and a Linked list while implementing stack for 
 * java double numbers.When you run the program the numbers/ values will be reversed. 
 * Amanda Bolden 
 * @author amanda
 */
public class Bolden_ArrayStack implements DStack{ // implements DStack interface
    private int Max;
    private double a[]; //size of stack
    private int counter;
    // Inserts element
    
    /**
    * constructor for ArrayStack
     */
    public Bolden_ArrayStack(){
        Max=10;
        a= new double [Max];
        counter=0;
    }
   
    /**
    * push method holds the data for the stack
    * @param double data from DStack.java
     */
    
    public void push (double x){
       //assign value to the index in the array thats next in numerical order
       a[counter]= x;
       counter = counter +1;
       
       if (counter == Max); {
        resize();
    }
       
    }
    /**
    * peek method  returns the last value that was pushed in the stack
     @returns the value that was last pushed in the stack 
     * @throws EmptyStackException if stack is empty
     */
    public double peek(){
        // return value thats one less than counter
        if (counter == 0){
            throw new EmptyStackException();
        }
        return a[counter -1];
    }
    
    /**
    * pop method  returns the last value that was pushed in the stack and removes it 
     @returns the value  that was last pushed in the stack 
     * @throws EmptyStackException if stack is empty
     */
    
    public double pop(){ // removes from array
        if (isEmpty()){
            throw new EmptyStackException(); // throws exception if its empty
        }
        double temp = a[counter - 0];
        counter--;
        return temp;
    }
    
    /**
    * resize method doubles the size of the array 
    * copies values from stack a into the new temp stack b 
    */
    
    public void resize(){ // resizes array
        double b[] = a; //new array created that copies first array
        a= new double [Max *2]; // doubles the size of array
        for(int i =0; i < Max;i++){
          b[i]=a[i]; //data from array b goes into array a  
        } 
         Max= Max*2; // Max value of array doubles from 10 to 20 with resize
    }
    
    /**
    * isEmpty method checks to see if the stack is empty
     @returns true if stack is empty and false if it's not 
     */
    
    public boolean isEmpty() {
      if (counter ==-1) // if the stack is empty 
          return true; // returns true
      return false;
    }
}
