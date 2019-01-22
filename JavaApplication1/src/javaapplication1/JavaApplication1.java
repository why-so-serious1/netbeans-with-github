/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chanpreet
 */
public class JavaApplication1 implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        String xl;
        System.out.println("hello");
        JavaApplication1 obj1=new JavaApplication1();
        Thread t=new Thread(obj1);
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread t1=new Thread(obj1);
        t1.start();
        Thread t2=new Thread(obj1);
        t2.start();
        JavaApplication1 obj2=new JavaApplication1();
        Thread t3=new Thread(obj2);
                
    }    
public void run(){
            System.out.println("Thread name"+Thread.currentThread().getName());
            for(int i=0;i<3;i++)
                System.out.println(i);
   }
}
