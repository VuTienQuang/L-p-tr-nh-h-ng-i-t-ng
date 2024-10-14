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
public class rutgonxau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder a =  new StringBuilder(s);
        int ok = 1;
        int l = 0;
        while( l < a.length()-1){
            if(a.charAt(l) == a.charAt(l+1)){
               a.deleteCharAt(l);
               a.deleteCharAt(l);
               l = 0;
            }else{
                l++;
            }
        }
        
        if(a.length()!=0){
            System.out.println(a);
        }else{
            System.out.println("Empty String");
        }
    }
}
