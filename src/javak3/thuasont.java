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
public class thuasont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.print("Test " + k +": ");
            k+=1;
            for(int i = 2;i <= Math.sqrt(n);i++){
                int cnt = 0;
                while(n % i ==0){
                    cnt++;
                    n/=i;
                }
                if(cnt !=0){
                    System.out.print(i +"(" + cnt+")" +" ");
                }
            }
            if(n > 1){
                System.out.println(n +"(" + "1" +")");
            }else{
                System.out.println("");
            }
            
            
            
        }
    }
}
