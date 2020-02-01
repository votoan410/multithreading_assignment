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

    TimerAlarm(int t) {
        this.t = t;
        alarmAction(t);
    }

    public static void alarmAction(int time) {
        if (time >= 1) {
            for (int t = 0; t < time; t++) {
                System.out.println("time is up ! ");
            }
        }

    }

}
