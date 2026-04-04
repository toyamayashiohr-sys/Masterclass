import java.util.Random;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        // circumference = 2 * pi * radius
        //area = Pi * Math.pow(radius,2)
        // volume = 4 / 3 * pi * math.pow(r,3)

        Scanner scanner = new Scanner(System.in);

        double r;
        double cir;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        r = scanner.nextDouble();

        cir = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(r,3);

        System.out.println("The circumference is " + cir);
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);


    }
}

