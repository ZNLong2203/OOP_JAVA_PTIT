/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author nlong
 */
public class J01015_18 {

    /**
     * @param args the command line arguments
     */
    static long check(long n) {
        long cnt4 = 0;
        long cnt7 = 0;
        while(n>0) {
            if(n%10==4) {
                cnt4++;
            }
            if(n%10==7) {
                cnt7++;
            }
            n/=10;
        }
        long ans = cnt4 + cnt7;
        if(ans==4 || ans==7) return 1;
        else return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n)==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
