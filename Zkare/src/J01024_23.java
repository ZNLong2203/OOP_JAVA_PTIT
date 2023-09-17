/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_j01024;
import java.util.*;
/**
 *
 * @author nlong
 */
public class Main {

    static int check(String s) {
        for(int i=0; i<s.length(); i++) {
           if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2') {
               return 0;
           }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            String s = sc.next();
            if(check(s)==1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    
}
