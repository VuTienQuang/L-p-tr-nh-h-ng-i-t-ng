
package javak3;
import java.util.Scanner;
public class songuyento {
    public static int nto(int a){
        if(a < 2){
            return 0;
        }
           for(int i = 2;i <= Math.sqrt(a);i++){
               if(a % i ==0){
                   return 0;
               }
           } 
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int a = sc.nextInt();
            if(nto(a) == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
