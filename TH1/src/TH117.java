/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class TH117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long num = 1;
        while(t-->0) {
            System.out.printf("Test " + num + ":\n");
            num++;
            int a[] = new int[100005];
            int f[] = new int[100005];
            int n = sc.nextInt();
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
                f[a[i]]++;
            }
            for(int i=0;i<n;i++) {
                if(f[a[i]]!=0) {
                    System.out.println(a[i] + " xuat hien " + f[a[i]] + " lan");
                    f[a[i]] = 0;
                }
            }
        }
    }
}
