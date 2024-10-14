/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javak3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class mangdoixung {
    public static int kt(int[] s , int n){
        for(int i =0;i < n/2;i++){
            if(s[i] != s[n-i-1]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            if(kt(a , n) ==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
                
    }
            
}
