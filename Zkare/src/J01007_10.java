/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10_j01007;
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
        long a[] = new long[95];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<=93;i++) {
            a[i] = a[i-1] + a[i-2];
        }
        long t = sc.nextLong();
        while(t-->0) {
            int check = 0;
            long n = sc.nextLong();
            for(int i=0;i<94;i++) {
                if(a[i]==n) {
                    check = 1;
                    break;
                } 
            }
            if(check==0)System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
