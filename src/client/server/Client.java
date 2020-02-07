/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server;

/**
 *
 * @author Bayebane & Andi
 */ 
import java.net.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CLIENT");
        int connected = 0;
        Socket connessione = null;
        int porta = 3500; //Numero porta
        String server = "localhost"; //Nome host
        while (connected == 0) {
            try {
                System.out.println("in attesa di connessioni...");
                connessione = new Socket(server, porta);
                System.out.println("connessione aperta");
                //chat

                connected = 1;  //Il flag va a 1 nel caso la connessione sia stabilita

            } catch (IOException ex) { //Errore creazione socket.
                System.err.println("errore");
                break;
            } finally {
                try {
                    if (connessione != null) {
                        connessione.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("connessione chiusa");
            }

            TimeUnit.SECONDS.sleep(2);
        }
    }
}
