
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class tapturieng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String[] s = sc.nextLine().split("\\s+");
             String b = sc.nextLine();
        HashSet<String> c = new HashSet<>();
        for(String i : s){
            if(!b.contains(i)){
                c.add(i);
            }
        }
        for(String i : c){
            System.out.print(i + " ");
        }
        System.out.println();
        }
    }
            
}
