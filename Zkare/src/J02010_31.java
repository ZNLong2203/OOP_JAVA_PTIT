/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class J02010_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] > a[j]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
            System.out.printf("Buoc %d: ", i+1);
            for(int j=0; j<n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println("");
        }
    }
}
