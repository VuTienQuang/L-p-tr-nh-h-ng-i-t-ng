
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class sodep4 {
   public static int kt(String s){
        int n = s.length();
        String x = "";
        for (int i = 0; i < n; i++) {
            x = s.charAt(i) + x;
            int k = s.charAt(i) - '0';
            if (k != 6 && k != 8)
                return 0;
        }
        if (s.compareTo(x) == 0)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s =sc.next();
            if(kt(s)==1){
                
                    System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
              
    }
}
