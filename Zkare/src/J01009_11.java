/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_j01009;
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
        long n = sc.nextLong();
        long sum = 1;
        long xet = 1;
        for(int i=2;i<=n;i++) {
            xet*=i;
            sum+=xet;
        }
        System.out.println(sum);
    }
}
