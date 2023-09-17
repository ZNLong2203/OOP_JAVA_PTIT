/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author nlong
 */
public class J01021_21 {
    
    static Long mod = 1000000007L;
    
    public static long Pow(long n, long k) {
        if(k==0) return 1;
        long x = Pow(n, k/2);
        x = (x * x) % mod;
        if(k%2==0) return x;
        else return (x*n) % mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n==0 && k==0) return;
            System.out.println(Pow(n, k));
        }
    }
}
