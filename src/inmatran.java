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
public class inmatran {
    public static Scanner ip = new Scanner(System.in);

    public static void testCase() {
        int n = ip.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ip.nextInt();
            }
        }
        int i = 0, j = 0, xuoi = 1;
        while (true) {
            System.out.print(a[i][j] + " ");
            if (xuoi == 1) {
                j++;
                if (j == n) {
                    i++;
                    j = n - 1;
                    xuoi = 0;
                }
            } else {
                j--;
                if (j < 0) {
                    i++;
                    j = 0;
                    xuoi = 1;
                }
            }
            if (i == n) {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int T = ip.nextInt();
        while (T-- > 0) {
            testCase();
        }
    }
}
