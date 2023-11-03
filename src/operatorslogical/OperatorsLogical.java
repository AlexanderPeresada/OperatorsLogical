package operatorslogical;

import java.util.Scanner;

public class OperatorsLogical {
    static double resultSumTax;
    static double lowTax = 0.025;
    static double midTax = 0.043;
    static double maxTax = 0.067;
    static int zeroSum = 0;
    static int lowSum = 10000;
    static int maxSum = 25000;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a salary sum: ");

        double salary = scan.nextDouble();

        if (salary > zeroSum && salary <= lowSum) {
            resultSumTax = salary * lowTax;
        } else if (salary > lowSum && salary <= maxSum) {
            resultSumTax = salary * midTax;
        } else {
            resultSumTax = salary * maxTax;
        }

        System.out.printf("Tax sum is: %.2f", resultSumTax);

    }
}
