
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class chuanhoahoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String k = sc.nextLine().trim();
            String[] s = k.split("\\s+");
            for(int i = 0;i < s.length ;i++){
                s[i] = s[i].toLowerCase();
            } 
            int l = s.length;
            s[0] = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
            s[l-1] = s[l-1].substring(0, 1).toUpperCase() + s[l-1].substring(1);
            for(String i:s){
                System.out.print(i +" ");
            }
            System.out.println("");
            
            
            
        }
        
    }
}
