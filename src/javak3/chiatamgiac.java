
package javak3;

import java.util.Scanner;
public class chiatamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(double i = 1d;i < n;i++){
                System.out.print(String.format("%.6f ",Math.sqrt(i/n) * h));
            }
            System.out.println();
        }
    }
}
