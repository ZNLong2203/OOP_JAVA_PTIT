/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author MY PC
 */
public class J01012_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int s = 0;
            for(int i=1; i*i<=n; i++) {
                if(n%i==0) {
                    if(i%2 == 0) s++;
                    if((n/i)%2 == 0) s++;
                    if(i == (n/i) && i%2 == 0) s--;
                }
            }
            System.out.println(s);
        }
    }
}
