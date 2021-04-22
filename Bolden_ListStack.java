/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;
import java.util.NoSuchElementException;
/**
 * *CPS 350 Section 01
 * Assignment 1
 * Implementing Stack ADT using a Array and a Linked list while implementing stack for 
 * java double numbers.When you run the program the numbers/ values will be reversed. 
 * Amanda Bolden 
 * @author amanda
 */
public class Bolden_ListStack implements DStack{ //extends from Bolden_Node.java
    private Bolden_Node head; 
    private int size;
    
    /**
    * ListStack constructor
    */
    
    public Bolden_ListStack(){
    head = null; size= 0;
    }
    
    /**
    * isEmpty method checks to see if stack is empty
     @returns if the stack is empty or not
     */
    
    public boolean isEmpty()
    {
        return head == null;
    }
    
    /**
    * length method returns size of stack
     @returns size of length
     */
    
    public int length(){
        return size; 
    }
    
    /**
    * peek method returns the last value that was pushed in the stack
     @returns the value that was last pushed in the stack 
     * @throws NoSuchElementException if stack is empty
     */
    
    public double peek(){
        double item = 0.0;
        if(!isEmpty()){
            item = head.item; // pulls data from head (front of list) and returns value
        }
        else throw new NoSuchElementException();
        return item;
    }
    
    /**
    * push method holds the data for the stack
    * @param double data from DStack.java
     */
    
    public void push (double item){
        Bolden_Node oldhead = head; 
        head = new Bolden_Node();
        head.item = item;
        head.next = oldhead;
        size++;
    }
    
    /**
    * pop method  returns the last value that was pushed in the stack and removes it 
     @returns the value  that was last pushed in the stack 
     * @throws NoSuchElementException if stack is empty
     */
    
    public double pop(){
        double item = 0.0;
        if(!isEmpty()){
            item = head.item; 
            head=head.next;
            size--;
        }
        else throw new NoSuchElementException();
        return item;
    }
}
        