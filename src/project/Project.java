/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Pavithra D A
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
    }
    
    
}
class Node {
    String usn;
    int addr;
    Node next;

    public Node(String usn, int addr, Node next) {
        this.usn = usn;
        this.addr = addr;
        this.next = next;
    }

    public Node(String usn, int addr) {
        this.usn = usn;
        this.addr = addr;
        this.next = null;
    }
}
