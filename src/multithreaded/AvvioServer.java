/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreaded;

/**
 *
 * @author franc
 */
public class AvvioServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Server svr = new Server(2000);
    svr.ascolto();
    //svr.leggi();
   
    
    }
    
}
