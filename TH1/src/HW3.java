/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String parts[] = s.split("\\.");
        StringBuilder ans = new StringBuilder();
        for(int i=parts.length-1; i>=0; i--) {
            ans.append(parts[i]);
            ans.append(".");
        }
        System.out.println(ans);
    }
}
