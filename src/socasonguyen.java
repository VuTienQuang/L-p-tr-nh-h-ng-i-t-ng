
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class socasonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dem = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '3' || s.charAt(i) == '5' ){
                dem++;
            }
        }
        if(dem ==3 || dem ==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
