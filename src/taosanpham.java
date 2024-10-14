
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
class SanPham{
    public int ma = 0;
    private String ten;
    private int soLuong;
    private String nhaSX;
    private double gia;
    public SanPham(){};
    public SanPham(String ten ,int soLuong, double gia, String nhaSX ){
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
        this.nhaSX = nhaSX.toUpperCase();
        ma+=1;
    }

    public String getMa() {
        if(this.ma < 10){
            return nhaSX +"-00"+Integer.toString(this.ma);
        }else{
            return nhaSX +"-0"+Integer.toString(this.ma);
        }
    }
    public double getThanhTien(){
        if(this.soLuong < 20){
            return this.soLuong * this.gia;
        }else{
            return this.soLuong * this.gia *0.9;
        }
    }
    public String toString(){
        return getMa()+" "+ten+" "+Integer.toString(soLuong)+" "+Double.toString(gia)+" "+getThanhTien();
    }
}

public class taosanpham {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while(n-->0){
            ten=sc.nextLine();
            nhaSX=sc.nextLine();
            soLuong=Integer.parseInt(sc.nextLine());
            gia=Double.parseDouble(sc.nextLine());
            SanPham p=new SanPham(ten, soLuong, gia, nhaSX);
            System.out.println(p);
            
        }
    }
}
