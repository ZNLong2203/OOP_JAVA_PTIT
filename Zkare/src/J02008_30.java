/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author nlong
 */
public class J02008_30 {
    public static long GCD(long a, long b) {
        BigInteger m = BigInteger.valueOf(a);
        BigInteger n = BigInteger.valueOf(b);
        BigInteger gcd = m.gcd(n);
        return gcd.longValue();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            long s = 1;
            long n = sc.nextLong();
            for(int i=2;i<=n;i++) {
                s = (s*i)/GCD(s,i);
            }
            System.out.println(s);
        }
    }   
}
