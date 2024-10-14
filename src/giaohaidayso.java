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
public class giaohaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        Set<Integer> set1 = new HashSet<>();
        for(int num : a){
            set1.add(num);
        }
        Set<Integer> fn = new HashSet<>();
        for(int num : b){
            if(set1.contains(num)){
                fn.add(num);
            }
        }
        for(int num : fn){
            System.out.print(num + "");
        }
        
       
    }
           
}
