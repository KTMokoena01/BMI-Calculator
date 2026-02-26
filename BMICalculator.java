import java.util.Scanner; 

public class BMICalculator {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Your weight in Kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Please enter height in Centimeters: ");
        double height = input.nextDouble();
        final double 

    }BMI = weight / Math.pow(height/100, 2);
        System.out.printf("Your BMI is: %.2f", BMI);
        input.close();
    }
}
