package corejava;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultithreadingDemo implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

            ExecutorService executorService = Executors.newCachedThreadPool();

            ConcurrentHashMap<String,String> c =new ConcurrentHashMap<>();
            c.keys();


        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
class Multithreading
{
    public static void main(String[] args)
    {


        int n = 8; // Number of threads
        for (int i=0; i<n; i++)
        {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}