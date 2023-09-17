/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author MY PC
 */
public class J01011_14 {

    public static long gcd(long a, long b) {
        while(a!=0) {
            long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = gcd(a, b);
            System.out.println(a * b / c + " " + c);
        }
    }
}
