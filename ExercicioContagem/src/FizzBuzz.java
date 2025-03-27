public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Múltiplo de 3 e 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Múltiplo de 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Múltiplo de 5
            } else {
                System.out.println(i); // Número normal
            }
        }
    }
}

