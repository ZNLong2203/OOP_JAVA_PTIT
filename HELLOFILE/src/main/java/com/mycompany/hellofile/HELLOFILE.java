/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hellofile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author nlong
 */
public class HELLOFILE {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
