public class FizzBuzzImpl implements FizzBuzz {

    private int[] numbers = new int[100];

    public FizzBuzzImpl() {
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
    }

    @Override
    public boolean testNumber(int number, int modulo) {
        return number % modulo == 0;
    }

    @Override
    public boolean isFizz(int number) {
        return testNumber(number, 3);
    }

    @Override
    public boolean isBuzz(int number) {
        return testNumber(number, 5);
    }

    @Override
    public boolean isFizzBuzz(int number) {
        return testNumber(number, 15);
    }

    public void main() {
        for (int n : numbers) {
            if (isFizzBuzz(n)) {
                System.out.println("fizzbuzz");
            } else if (isBuzz(n)) {
                System.out.println("buzz");
            } else if (isFizz(n)) {
                System.out.println("fizz");
            } else {
                System.out.println(n + "");
            }
        }
    }
}
