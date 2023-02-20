package org.fasttrackit.code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ErrorMessageMain {
    public static void main(String[] args) throws IOException, NumberTooLargeException, PowerTooLargeException, NegativeNumberException {
        BufferedWriter errorWriter = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        Integer number = scanner.nextInt();
        System.out.println("Please enter a power");
        Integer power = scanner.nextInt();
        errorWriter = new BufferedWriter(new FileWriter("error.txt"));
        errorWriter.write("this is an error File");

        try {
            System.out.println(MathService.computePower(number, power));
        } catch (PowerTooLargeException | NegativeNumberException  exception) {
            errorWriter.newLine();
            errorWriter.write(exception.getMessage());
            System.out.println(exception.getMessage());
        } catch (NumberTooLargeException exception) {
            System.out.println(MathService.computePower(exception.getNumber() / 10, power));
        } finally {
            errorWriter.close();
        }
    }
}
