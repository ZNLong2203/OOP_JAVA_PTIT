/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author MY PC
 */
public class HW4 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        if (isStrongPassword(password)) {
            System.out.println("Mật khẩu là mật khẩu tốt.");
        } else {
            System.out.println("Mật khẩu không đạt yêu cầu.");
        }
    }

    // Phương thức kiểm tra mật khẩu tốt
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) return false;
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else {
                hasSpecialChar = true;
            }
        }
        return hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar;
    }
}
