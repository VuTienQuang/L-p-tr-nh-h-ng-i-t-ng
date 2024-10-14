/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javak3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class hop2dayso {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int[] a = new int[n];
        int[] dd = new int[100000];

        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
            dd[a[i]] += 1;
        }
        

        for (int i = 1; i <= 1000; i++) {
            if (dd[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
    }

