/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th1.pkg3;
import java.util.*;
/**
 *
 * @author MY PC
 */
public class TH13 {

    public static void zkare(long n) {
        System.out.println(((n+1)*n)/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            long n = sc.nextLong();
            zkare(n);
        }
    }
    
}
