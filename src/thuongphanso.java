
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
class Rutgon{
    private long a, b;
    Rutgon(){
        a = 0;
        b =1;
    }
    Rutgon(long a, long b){
        this.a = a;
        this.b = b;
        
    }
    private long gcd(long x ,long y){
        while(y !=0){
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }
    @Override
    public String toString(){
        long g = gcd(this.a , this.b);
        if((a/g) % (b/g) ==0){
            String s = Long.toString((a/g) / (b/g));
            return s;
        }
        else{
            return a/g +"/"+b/g;
        }
    }
        
}
public class thuongphanso {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = a * d;
        long f = b * c;
        Rutgon k = new Rutgon(e, f);
        System.out.println(k);
    }
}
