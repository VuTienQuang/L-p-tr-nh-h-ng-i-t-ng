
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class boisochung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a =new BigInteger(sc.next());
            BigInteger b =new BigInteger(sc.next());
            BigInteger m = a.multiply(b);
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = m.divide(gcd);
            System.out.println(lcm);
            
        }
    }
    
}
