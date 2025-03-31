/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class User {
    boolean isExist(String u, String p){
        File f = new File("D:/csdl.txt");
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String tdn = sc.next();
                String mk = sc.next();
                if(tdn.equalsIgnoreCase(u)&& mk.equals(p))
                    return true;
            }
        }catch(Exception e){
            
        }
        return false;   
    }
    
    boolean them(String u, String p){
        File f = new File("D:/csdl.txt");
        try{
            String data = "";
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
                data += sc.nextLine() +"\n";
            sc.close();
            
            PrintStream printS = new PrintStream(f);
            printS.print(data);
            printS.print(u +"\t"+ p);
        }catch(Exception e){
            return false; 
        }
        return true;
    }
}
