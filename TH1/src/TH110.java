/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class TH110 {

    /**
     * @param args the command line arguments
     */
    public static void check(long n) {
        long cnt = 0;
        for(int i=1;i*i<=n;i++) {
            if(n%i==0) {
                if(i%2==0) cnt++;
                if((n/i)%2==0) cnt++;
                if(i*i==n && i%2==0) cnt--;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            long n = sc.nextLong();
            check(n);
        }
    }
}
