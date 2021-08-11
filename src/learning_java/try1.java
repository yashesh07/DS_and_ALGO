package learning_java;
import java.util.Scanner;
class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double printVolume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

    public Cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;

    }

}
public class try1 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cylinder gas = new Cylinder(8,7);
        System.out.println("Radius : " + gas.getRadius());
        System.out.println("Height : " + gas.getHeight());
        System.out.println("Area : " + gas.printVolume());
    }
}
