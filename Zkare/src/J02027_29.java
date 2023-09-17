/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author nlong
 */
public class J02027_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long num = 1;
        while(t-->0) {
            System.out.println("Test " + num + ":");
            num++;
            int n = sc.nextInt();
            int a[] = new int[100005];
            int map[] = new int[100005];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
                map[a[i]]++;
            }
            for(int i=0;i<n;i++) {
                if(map[a[i]]!=0) {
                    System.out.println(a[i] + " xuat hien " + map[a[i]] + " lan");
                    map[a[i]] = 0;
                }
            }
        }
    }
}
