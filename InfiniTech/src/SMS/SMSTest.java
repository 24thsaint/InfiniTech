/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMS;

import java.util.Scanner;

/**
 *
 * @author Rave
 */
public class SMSTest {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Sender sender = new Sender("+639486258359", "Hello Quim");
        //sender.send();
        while (true) {
            System.out.println("Recipient: ");
            String num = scanner.nextLine();
            System.out.println("Message: ");
            String msg = scanner.nextLine();
            Sender sender = new Sender(num, msg);
            sender.send();            
        }
    }
}
