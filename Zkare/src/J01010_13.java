/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
/**
 *
 * @author nlong
 */
public class J01010_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String x = sc.nextLine();
            long ans = 0;
            for(int i=0; i<x.length(); i++){
                if(x.charAt(i)!='0' || x.charAt(i)!='1' || x.charAt(i)!='8' || x.charAt(i)!='9'){
                    System.out.println("INVALID");
                    break;
                }
                else if(x.charAt(i)=='0' || x.charAt(i)=='8' || x.charAt(i)=='9'){
                    ans *= 10;
                }
            }
        }
    }
    
}
