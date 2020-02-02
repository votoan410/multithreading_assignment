/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading_assignment;

/**
 *
 * @author timmy
 */
public class TimerAlarm extends Thread {

    private int t;//t is time in milliseconds
    private String message;
    

    

    TimerAlarm(int t, String Message) {
        this.t = t;
        this.message = Message;
        System.out.println("create " + this.message);
    }
    
    //alarmAction method 
    public void alarmAction(){
         System.out.println(this.message);
    }

    @Override
    public void run() {
         System.out.println("Running: " + this.message);
        try {
            for (int i = 1; i <= 100; i++) {
                //for every milisecond the alarmAction method is invoked as following
                alarmAction();
                Thread.sleep(1);
            }
        } catch (InterruptedException exception) {
            System.out.println("Interupting..");
        }
        System.out.println("Exiting...");
    }
    
     
}




