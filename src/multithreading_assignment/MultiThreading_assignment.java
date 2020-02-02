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
    public static void main(String[] args)  {
//        // TODO code application logic here
//        TimerAlarm obj[] = new TimerAlarm[3];
//        obj[0] = new TimerAlarm(10,"get up!");
//         
//        obj[1] = new TimerAlarm(10, "wake up !");
//         
//        obj[2] = new TimerAlarm(10,"time is up !");
//         
//        for (int i = 0; i < obj.length; i++){
//            obj[i].start();
//            try {
//                obj[i].join();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(MultiThreading_assignment.class.getName()).log(Level.SEVERE, null, ex);
//            }
//             
//        }
////        for (int i = 0; i < obj.length; i++){
////            try {
////                obj[i].join();
////            } catch (InterruptedException ex) {
////                Logger.getLogger(MultiThreading_assignment.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
    TimerAlarm o1 = new TimerAlarm(10,"get up!");
    o1.start();
    TimerAlarm o2 = new TimerAlarm(10,"wake up!");
    o2.start();
    TimerAlarm o3 = new TimerAlarm(10,"time up!");
    o3.start();
    
    }
    
}
