/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author 84353
 */
public class StudentList {
    SinhVien[] s;
    StudentList(){
        s=new SinhVien[0];
    }
public void DocFile(){
    SinhVien[] tam=new SinhVien[10];
    int i=0;
    File f = new File("D:/abc.txt");
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                SinhVien s = new SinhVien();
                s.setId(sc.nextLine());
                s.setHoten(sc.nextLine());
                s.setNgaysinh(sc.nextLine());
                s.setDiachi(sc.nextLine());
                s.setStd(sc.nextLine());
                s.setEmail(sc.nextLine());
                s.setAvg(Double.parseDouble(sc.nextLine()));
                sc.nextLine(); 
                tam[i]=s; i++;
            }
            s=new SinhVien[i];
            for (int index=0;index<i;index++){
                s[index]=tam[index];
            }
        }catch(Exception e){
            System.err.println("Lỗi");
        }// TODO add your handling code here:
    }                            
}
