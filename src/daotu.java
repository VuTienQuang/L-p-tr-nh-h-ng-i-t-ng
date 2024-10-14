
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String[] a = sc.nextLine().split("\\s+");
            for(String i:a){
                StringBuilder s = new StringBuilder(i);
                System.out.print(s.reverse() + " ");
            }
            System.out.println("");
        }

      
    }
}
