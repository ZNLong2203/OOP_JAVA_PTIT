/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class J02011_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 1, tmp = 1;
        int n = sc.nextInt();
        int a[] = new int[1005];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++) {
            tmp = a[i];
            for(int j=i+1; j<n; j++) {
                if(a[j] < tmp) {
                    tmp = a[j];
                    idx = j;
                }
            }
            int d = a[i];
            a[i] = tmp;
            a[idx] = d;
            System.out.printf("Buoc %d: ", i+1);
            for(int j=0; j<n ;j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }   
    }
}
