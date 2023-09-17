/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th1.pkg2;
import java.util.*;
/**
 *
 * @author MY PC
 */
public class TH12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a<=0 || b<=0) {
            System.out.println(0);
        }
        else {
            System.out.println((a+b)*2 + " " + a*b);
        }
    }
    
}
