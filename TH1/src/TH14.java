/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th1.pkg4;
import java.util.*;

public class TH14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0)
            System.out.print("VSN");
        else if (a == 0 && b != 0)
            System.out.print("VN");
        else
            System.out.printf("%.2f", (float) -b / a);
    }
}
