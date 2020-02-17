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
    private String name;
    private int t;//t is time in milliseconds
    private String message;
    private volatile boolean  pause = false;

    

    TimerAlarm(String name, int t, String Message) {
        this.name = name;
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
         System.out.println("Running: " + this.name);
        try {
           for (int i = 0; i < t;i++) {
                //for every milisecond the alarmAction method is invoked as following
                if(pause == true){
                    try{
                    System.out.println(" pausing ... " + this.name);
                    Thread.sleep(100000);
                    } catch (InterruptedException exception) {
                        System.out.println(" continuing ... " + this.name);
                    }
                }
                alarmAction();
                Thread.sleep(1);
            }
        } catch (InterruptedException exception) {
            System.out.println("Interupting..");
        }
        System.out.println("Exiting...");
    }
    
    public boolean pause(){//pause method 
        return pause = true;
    }
   
    public void play(){//play method
        pause = false;
        this.interrupt();
    }
     
}




