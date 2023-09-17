/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_j01004;
import java.util.Scanner;
/**
 *
 * @author nlong
 */
public class Main {

    static long check(long num) {
        if(num < 2) return 0;
        else {
            for(int i=2;i*i<=num;i++) {
                if(num%i==0) {
                    return 0;
                }   
            }
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            long a = sc.nextLong();
            if(check(a)==1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
