/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javak3;
import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuilder;


public class catdoi {
    public static StringBuilder kt(String s){
        StringBuilder a = new StringBuilder(s);
        for(int i = 0;i < a.length();i++){
            if(a.charAt(i) == '0' ){
                continue;
            }
            if(a.charAt(i) == '1' ){
                   continue;
            }
            if(a.charAt(i) == '8' ){
                a.setCharAt(i, '0');
                continue;
            }
            if(a.charAt(i) == '9' ){
                a.setCharAt(i, '0');
                continue;
            }
            return null;
            
        }
        while(a.length() > 0){
            int i = 0;
            if(a.charAt(i) =='0'){
                a.deleteCharAt(i);
            }else{
                return a;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            StringBuilder kt = kt(a);
            if(kt != null && kt.length()>0){
                System.out.println(kt);
            }
              else{
                        System.out.println("INVALID");
                        }
            }
    }
        
    }
