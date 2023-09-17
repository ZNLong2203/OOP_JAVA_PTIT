/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class TH116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int n = sc.nextInt(); int m = sc.nextInt();
        int a[] = new int[1005]; int b[] = new int[1005];
        for(int i=0;i<n;i++) {
            x = sc.nextInt();
            a[x] = 1;
        }
        for(int i=0;i<m;i++) {
            x = sc.nextInt();
            b[x] = 1;
        }
        for(int i=1;i<1000;i++) {
            if(a[i]==1 || b[i]==1) {
                System.out.printf(i + " ");
            }
        }
    }
}
