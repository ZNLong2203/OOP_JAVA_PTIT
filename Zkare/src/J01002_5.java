/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_j01002;
import java.util.Scanner;
/**
 *
 * @author nlong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0) {
            long a = sc.nextLong();
            System.out.println(a*(a+1)/2);   
        }
    }
}
