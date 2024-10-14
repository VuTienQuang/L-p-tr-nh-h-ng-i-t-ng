
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> kt = new HashSet<>();
        for(char c : s.toCharArray()){
            kt.add(c);
        }
        System.out.println(kt.size());
        
    }
}
