/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javak3;
import java.util.Scanner;
/**
 *
 * @author laptop hoangkhuong
 */
public class usntmax {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long kq = 0;
            for(int i = 2;i<= Math.sqrt(n);i++){
                while(n % i ==0){
                    n/=i;
                    kq = i;
                }
            }
            if(n > 1){
                kq = n;
            }
            System.out.println(kq);
        }
    }
}
