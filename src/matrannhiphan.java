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
public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][3];
        int cnt = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < n;i++){
            int d0 = 0;
            int d1 = 0;
            for(int j = 0;j < 3;j++){
                if(a[i][j] ==1){
                    d1+=1;
                }else{
                    d0+=1;
            }
            }
            if(d1 > d0){
                    cnt+=1;
                }
        }
        System.out.println(cnt);
        
    }
}
