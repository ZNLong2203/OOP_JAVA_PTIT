/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class HW2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        char tmp = s.isEmpty() ? ' ' : s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (tmp == ' ' && s.charAt(i) == ' ') {
                continue;
            }
            ans += s.charAt(i);
            tmp = s.charAt(i);
        }
        System.out.println(ans);
    }
}