public class Fibonacci {
    public static void main(String[] args) {
        int previousNumber = 0;
        int currentNumber = 1;
        int sum = 0;
        int count = 0;

        System.out.println("Deretan bilangan Fibonacci Genap Dari 10 - 4500 :");
        for (int i = 0; currentNumber <= 4500; i++) {
            if (currentNumber >= 10 && currentNumber % 2 == 0) {
                System.out.println(currentNumber);
                sum += currentNumber;
                count++;
            }

            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        System.out.println("Jumlah Deret Bilangan Fibonacci: " + count);
        System.out.println("Jumlah Total Seluruh Bilangan Genap Fibonacci: " + sum);
    }
}
