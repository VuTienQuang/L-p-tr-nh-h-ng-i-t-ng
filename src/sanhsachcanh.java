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
public class sanhsachcanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t+1][t+1];
        for(int i = 1;i <= t;i++){
            for(int j = 1;j <= t;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1;i <= t;i++){
            System.out.print("List(" + i + ") = ");
            for(int j = 1;j <= t;j++){
                if( a[i][j] == 1){
                    System.out.print(j + " ");
                }

            }
            System.out.println("");
    }
 }
}

