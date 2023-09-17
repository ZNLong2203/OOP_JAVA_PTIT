/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author MY PC
 */
public class TH118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            BigInteger x = new BigInteger("11");
            BigInteger k = n.divide(x);
            if (k.multiply(x).compareTo(n) == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
