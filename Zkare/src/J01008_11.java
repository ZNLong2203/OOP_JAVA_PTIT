/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author nlong
 */
public class J01008_11 {

    /**
     * @param args the command line arguments
     */
    static void check(long num, long t) {
        System.out.printf("Test " + t + ": ");
        for(int i=2;i*i<=num;i++) {
            long cnt = 0;
            while(num%i==0) {
                num/=i;
                cnt++;
            }                  
            if(cnt>0) System.out.printf(i +"(" + cnt + ") ");
        }
        if(num>1) System.out.printf(num +"(1)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long c = 0;
        while(t-->0) {
            c++;
            long n = sc.nextLong();
            check(n,c);
            System.out.println();
        }
    }
}
