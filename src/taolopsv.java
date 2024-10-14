
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
class Sinhvien {
    String msv;
    String ten;
    boolean gt;
    String gioitinh;
    double diem;
    String trangthai;
    void input(){
        Scanner sc = new Scanner(System.in);
        msv = sc.next().toUpperCase();
        sc.nextLine();
        ten = sc.nextLine();
        gt = sc.nextBoolean();
        diem = sc.nextDouble();
        if(gt == true){
            gioitinh = "nam";
        }else{
            gioitinh = "nu";
        }
        if(diem < 5){
            trangthai = "hoc lai";
        }else{
            trangthai = "dat";
        }
    }
    void out(){
        System.out.print(msv +" " +ten+" "+gioitinh+" "+trangthai );
    }
}
public class taolopsv {
    public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}
  