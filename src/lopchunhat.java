
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laptop hoangkhuong
 */
class Rectange{
    private double w;
    private double h;
    private String color;
    public Rectange(){
        w = 1;
        h = 1;
    }
    public  Rectange(double w , double h , String color){
        this.w = w;
        this.h = h;
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double getW(){
        return this.w;
    }
    public void setW(double w){
        this.w = w;
    }
    public double getH(){
        return this.h;
    }
    public void setH(double h){
        this.h = h;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public double findArea(){
        return getH()*getW();
    }
    public double findPerimeter(){
        return (getH()+getW())*2;
    }
     @Override
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
    
}
public class lopchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        String c = sc.next();
        if (w > 0 && h > 0) {
            Rectange rect = new Rectange(w, h, c);
            System.out.println(rect);
        } else {
            System.out.println("INVALID");
        }
    }
}
