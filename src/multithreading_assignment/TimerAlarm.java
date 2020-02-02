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
    private static String message;
    

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        TimerAlarm.message = message;
    }

    TimerAlarm(int t, String message) {
        this.t = t;
        this.message = message;
    }
    
    
    public void alarmAction(){
         System.out.println(this.message);
    }

    public void run() {
    
        try {
            for (int i = 1; i <= t; i++) {
                alarmAction();
                Thread.sleep(1);
            }
        } catch (InterruptedException exception) {
            System.out.println("Interupting..");
        }
        System.out.println("Exiting...");
    }
}




