/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19_j01016;
import java.util.*;
/**
 *
 * @author nlong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static long check(String s) {
        long n = s.length();
        for(int i=1;i<n;i++) {
            if(Math.abs(s.charAt(i) - s.charAt(i-1))!=1) return 0;
        }
        return 1;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
           String s = sc.next();
           if(check(s)==1) System.out.println("YES");
           else System.out.println("NO");
        }
    }   
}
