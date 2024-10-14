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
public class ptbn {
    public static void main(String[] args) {
        float a , b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a == 0f) {
            if (b == 0f) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            System.out.println(String.format("%.2f", -b / a));
        }
        
    }
}
