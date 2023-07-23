    
package com.sample.basics;

public class threadsexample extends Thread{

    public void run()
    {
        System.out.println("Running Thread...");
    }
    public static void main(String args[]) {
        System.out.println("Hello Threads");
        threadsexample t=new threadsexample();
        t.start();
        System.out.println("aaaaa");
         t.stop();
        // t.start(); // op will not run run method
    }

}