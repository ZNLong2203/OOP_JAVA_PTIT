/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author nlong
 */
public class J01006_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a[] = new long[93];
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<93;i++) {
            a[i] = a[i-1] + a[i-2];
        }
        long t = sc.nextLong();
        while(t-->0) {
            int n = sc.nextInt();
            System.out.println(a[n-1]);
        }
    }
}
