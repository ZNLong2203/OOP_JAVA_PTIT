/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;

/**
 *
 * @author MY PC
 */
public class TH112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int a = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '4' || s.charAt(i) == '7') a++;
        if (a == 4 || a == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
