/*
Names: Alberto, I'munique, Toan
Class: COSC2353
Professor: Dr. Melissa Carlton
Date: 2/3/2020

*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading_assignment;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author timmy
 */
public class MultiThreading_assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimerAlarm obj[] = new TimerAlarm[3];
        obj[0] = new TimerAlarm(10,"get up!");
         
        obj[1] = new TimerAlarm(10, "wake up !");
         
        obj[2] = new TimerAlarm(10,"time is up !");
         
        for (int i = 0; i < obj.length; i++){
             obj[i].start();
        }

//        TimerAlarm o1 = new TimerAlarm(10, "get up!");
//         
//        TimerAlarm o2 = new TimerAlarm(10, "wake up!");
//         
//        TimerAlarm o3 = new TimerAlarm(10, "time is up!");
//         
//        o1.start();
//        o2.start();
//        o3.start();

    }

}
