
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
public class chiahet {
    public static boolean idDV(BigInteger n , BigInteger d){
        return n.mod(d).equals(BigInteger.ZERO);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = new BigInteger(sc.next());
            if(idDV(a, c) && idDV(b,c)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
        }
    }
}
