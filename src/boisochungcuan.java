/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javak3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class boisochungcuan {
      public static Scanner ip = new Scanner(System.in);

    public static long gcd(long a, long b) {
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-- > 0){
            int n = ip.nextInt();
            long res = 1;
            for (int i = 2; i <= n; i++) {
                 res = lcm(res, i);
             }
             System.out.println(res);
        }
    }
}
