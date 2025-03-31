/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author 84353
 */
public class SinhVien {
    private String hoten;
    private String id;
    private String std;
    private String diachi;
    private String ngaysinh;
    private String gioitinh;
    private String email;
    private double Avg;
    public String getHoten() {
		return hoten;
	}
    public void setHoten(String hoten) {
		this.hoten = hoten;
	}
    public String getId() {
		return id;
	}
    public void setId(String id) {
		this.id = id;
	}
    public String getStd() {
		return std;
	}
    public void setStd(String std) {
		this.std = std;
	}
    public String getDiachi() {
		return diachi;
	}
    public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
    public String getNgaysinh() {
		return ngaysinh;
	}
    public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
    public String isGioitinh() {
		return gioitinh;
	}
    public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public double getAvg() {
		return Avg;
	}
    public String GetAvg(){
                return ""+Avg;
    }
    public void setAvg(double Avg) {
		this.Avg = Avg;
	}
    public SinhVien(){
        
    }
    public SinhVien(String hoten, String id, String std, String diachi, String ngaysinh, String gioitinh,
			String email,double Avg) {
		this.hoten = hoten;
		this.id = id;
		this.std = std;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.email = email;
                this.Avg=Avg;
	}
    void them(String hoten, String id, String sdt, String diachi, String ngaysinh, String gioitinh,
			String email,double Avg) {
        File f = new File("D:/abc.txt");
        try{
            String data = "";
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
                data += sc.nextLine() +"\n";
            sc.close();
            
            PrintStream printS = new PrintStream(f);
            printS.println(data);
            printS.println(id);
            printS.println(hoten);
            printS.println(ngaysinh);
            printS.println(diachi);
            printS.println(sdt);
            printS.println( email);
            printS.println(Avg);
		
        }catch(Exception e){
            
        }
        
    }
}
