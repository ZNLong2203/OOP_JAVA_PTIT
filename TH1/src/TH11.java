/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th1.pkg1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TH11 {
    public static void main(String[] args) {
        // Đường dẫn đến file "Hello.txt"
        String filePath = "Hello.txt";
        
        try {
            // Mở file để đọc
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            
            String line;
            while ((line = reader.readLine()) != null) {
                // In từng dòng ra màn hình
                System.out.println(line);
            }
            
            // Đóng file sau khi đọc xong
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}