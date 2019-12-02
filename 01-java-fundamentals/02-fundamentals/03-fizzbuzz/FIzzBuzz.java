public class FizzBuzz {
    public static String method(int num) {
        String result;
        if (num%15 == 0) {
            result = "FizzBuzz";
        } else if (num % 5 ==0) {
            result = "Buzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else {
            result = String.valueOf(num);
        }
        return result;
    }
}