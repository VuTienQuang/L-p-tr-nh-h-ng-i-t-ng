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
public class uocsochia2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            int cnt = 0;
           for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                if (i % 2 == 0) {
                    cnt++;
                }
                if ((a / i) % 2 == 0 && i != Math.sqrt(a)) {
                    cnt++;
                }
            }
        }
            System.out.println(cnt);
        }
    }
         
}
