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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
           
            
            
    public static void main(String[] args) throws InterruptedException {
        ServerSocket serverSocket = null;
            int porta = 3500;
            Socket socket;
            int c = 0;
            System.out.println("SERVER");
                Conteggio cont = new Conteggio();
        try {
            serverSocket = new ServerSocket(porta);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("in attesa di connessioni...");
                cont.start();
        try {
            socket = serverSocket.accept();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("connessione stabilita");
        try {
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("connessione chiusa");          
}