/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreaded;

import java.net.InetAddress;

/**
 *
 * @author franc
 */
public class AvvioClient {
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        Client cli = new Client(InetAddress.getLocalHost(),2000);
    }
}
