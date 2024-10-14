/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javak3;
import java.util.Scanner;
/**
 *
 * @author laptop hoangkhuong
 */
public class solienke {
     public static Scanner sc = new Scanner(System.in);
     public static int kt(String s){
         for(int i = 0;i < s.length()-1;i++){
             if(s.charAt(i) - s.charAt(i + 1) != 2 && s.charAt(i) - s.charAt(i + 1) != -2  ){
                 return 0;
             }
         }
         return 1;
     }
     public static int sum1(String s){
         int cnt = 0;
         for(int i = 0;i < s.length();i++){
             int a = s.charAt(i) - '0';
             cnt += a;
         }
         if( cnt % 10 ==0){
             return 1;
         }else{
             return 0;
         }
     }
     public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(kt(s) == 1){
                if(sum1(s) ==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
}
