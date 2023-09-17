/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26_j02004;
import java.util.*;
/**
 *
 * @author nlong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            int ok = 1;
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextLong();
            }
            for(int i=0;i<=(n-1)/2;i++) {
                if(a[i]!=a[n-i-1]) {
                    ok = 0;
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
