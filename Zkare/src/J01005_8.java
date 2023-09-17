/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author nlong
 */
public class J01005_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            double n = sc.nextFloat();
            double h = sc.nextFloat();
            for(int i = 1;i < n;i++) {
                double ans = Math.sqrt(i/n)*h;
                System.out.printf("%.6f ", ans);
//                System.out.println("\n");
            }
            System.out.println();
        }
    }
    
}
