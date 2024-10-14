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
public class chuso4va7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            String s = sc.next();
            int cnt = 0;
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == '4' || s.charAt(i)=='7') cnt++;
            }
            if(cnt == 4 || cnt == 7){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            }
            
        }

