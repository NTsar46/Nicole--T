package calc_bmi;

import java.util.Scanner;

public class Calc_BMI {

    public static void main(String[] args) {

        System.out.println("What is your weight in kg?");
        Scanner wg = new Scanner(System.in);
        float weight = wg.nextFloat();

        System.out.println("What is your height in m?");
        Scanner ht = new Scanner(System.in);
        float height = ht.nextFloat();

        float BMI = weight / (height * height);
//        System.out.println("Your BMI is: " + BMI);

        if ((BMI) <= 18.5) {
            System.out.println("Your BMI is : " + BMI + " you are underweight");
        } else if ((BMI) > 18.5 && (BMI) <= 24.9) {
            System.out.println("Your BMI is : " + BMI + " your weight is normal");
        } else if ((BMI) >= 25 && (BMI) <= 29.9) {
            System.out.println("Your BMI is : " + BMI + " you are overweight");
        } else if ((BMI) > 29.9) {
            System.out.println("Your BMI is : " + BMI + " you are obese");
        }

    }

}
