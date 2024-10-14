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

public class giaithua {
    public static long giaithua(long a){
        if(a == 0){
            return 1;
        }else{
            return a*(giaithua(a-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        while(n > 0){
            sum = sum + giaithua(n);
            n--;
        }
        System.out.println(sum);
    }
}
