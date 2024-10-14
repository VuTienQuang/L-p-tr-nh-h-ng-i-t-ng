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
public class dienthoaicucgach {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };
        while (t-- > 0) {
            String s = sc.next().toLowerCase();
            String x = "", z = "";
            for (int i = 0; i < s.length(); i++) {
                String k = Integer.toString(a[s.charAt(i) - 'a']);
                x = x + k;
                z = k + z;
            }
            if (x.compareTo(z) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
