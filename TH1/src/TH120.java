/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MY PC
 */
import java.util.*;

public class TH120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
                Triangle tr = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                System.out.println(tr);
        }
        sc.close();
    }
}

class Triangle {
    double x1, x2, x3, y1, y2, y3, a, b, c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        this.b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        this.c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    }

    public double getS() {
        return 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
    }

    @Override
    public String toString() {
        return (a + b > c && b + c > a && c + a > b) ? String.format("%.2f", getS()) : "INVALID";
    }
}
