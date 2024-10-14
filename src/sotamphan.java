
package javak3;
import java.util.Scanner;
public class sotamphan {
    public static int kt(String s){
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1'&& s.charAt(i) != '2'){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(kt(s)==1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
             
    }
}
