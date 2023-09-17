/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author nlong
 */
public class J01026_25 {

    static int check(long n) {
        double a = Math.sqrt(n);
        long b = Math.round(a);
        if(b*b==n) return 1;
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
