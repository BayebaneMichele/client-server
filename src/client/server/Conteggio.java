/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bayebane
 */
public class Conteggio extends Thread {

    private static boolean conn;

    @Override

    public void run() {

        if (!conn) {
            for (int i = 0; i < 5; i++) {
                try {
                    this.sleep(1000L);
                    System.out.println((i+1) + "Secondo Trascorso");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Conteggio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Conteggio() {
        Conteggio.conn = false;
    }

    public void setConn() {
        Conteggio.conn = true;

    }

}
