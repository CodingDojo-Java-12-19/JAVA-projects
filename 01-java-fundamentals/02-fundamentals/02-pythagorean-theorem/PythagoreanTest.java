public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pyth = new Pythagorean();
        Double test = pyth.calculateHypotenuse(10, 5);
        Double newtest = pyth.calculateHypotenuse(40, 10);
        Double thirdtest = pyth.calculateHypotenuse(4, 30);
        System.out.println(thirdtest);
        System.out.println(newtest);
        System.out.println(test);
        test = pyth.calculateHypotenuse(5, 15);
        System.out.println(test);
    }
}