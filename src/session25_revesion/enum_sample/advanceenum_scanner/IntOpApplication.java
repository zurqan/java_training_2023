package session25_revesion.enum_sample.advanceenum_scanner;

import java.util.Scanner;

public class IntOpApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber =scanner.nextInt();
        System.out.println("Enter Second Number:");
        int secondNumber = scanner.nextInt();

        for (IntBinaryOpera op : IntBinaryOpera.values()) {

            System.out.printf("%d %s %d = %d\n",firstNumber,op.getSymbol(),secondNumber
                    ,op.doOperation(firstNumber,secondNumber));
        }
    }
}
