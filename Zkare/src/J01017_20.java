/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20_j01017;
import java.util.*;
/**
 *
 * @author nlong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static long check(long n) {
        long sum = 0;
        while(n>0) {
            long a = n%10;
            n/=10;
            if(Math.abs(a - (n%10))!=2 && (n%10!=0)) return 0;
            sum+=a;
        }
        if(sum%10==0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            long n = sc.nextLong();
            if(check(n)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
