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
public class souuthe {
     public static int check(String s) {
        int n = s.length();
        if (s.charAt(0) == '0')
            return -1;
        int sc = 0, sl = 0;
        for (int i = 0; i < n; i++) {
            int k = s.charAt(i) - '0';
            if (k >= 0 && k <= 9) {
                if(k %2 ==0)
                    sc++;
                else
                    sl++;
            } else
                return -1;
        }
        if (sc > sl && n % 2 == 0)
            return 1;
        if (sl > sc && n % 2 != 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = check(s);
            if (k == 0)
                System.out.println("NO");
            else if (k == 1)
                System.out.println("YES");
            else
                System.out.println("INVALID");
        }
        sc.close();
    }
}
