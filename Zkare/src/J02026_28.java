/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author nlong
 */
public class J02026_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int a[] = new int[1005]; int b[] = new int[1005];
        int checka[] = new int[1005]; int checkb[] = new int[1005];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            checka[a[i]] = 1;
        }
        for(int i=0;i<m;i++) {
            b[i] = sc.nextInt();
            checkb[b[i]] = 1;
        }
         for(int i=1;i<=1000;i++) {
            if(checka[i]==1 || checkb[i]==1) {
                System.out.printf(i + " ");
            }
        }
    }
}
