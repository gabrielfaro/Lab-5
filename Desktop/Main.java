import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a hexadecimal number: ");
        String input = s.nextLine();
        if (input.startsWith("0x")){
            input = input.substring(2);
        }
        int counter = 0;
        long total = 0;

        while (counter < input.length()){
            char variable;
            int value = 0;
            input = input.toUpperCase();
            variable = input.charAt(counter);
            if(variable >= '0' && variable <= '9') {
                value = variable - '0';
            }
            if (variable >= 'A' && variable <= 'F'){
                value = variable - 'A' + 10;
            }

            //Math
            total += (long)Math.pow(16 , ((input.length() - 1) - counter)) * value;

            counter++;
        }
        System.out.println("Your number is " + total + " in decimal");
    }
    //Adding a coment for Git

    }
