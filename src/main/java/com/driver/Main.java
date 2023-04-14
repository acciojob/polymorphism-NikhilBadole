public class Main {

    public static void main(String[] args) {

        Product p = new Product();

        // Task 3: call product method with two integer parameters
        int result1 = p.product(5, 6);
        System.out.println("Result 1: " + result1);

        // Task 4: call product method with three integer parameters
        int result2 = p.product(5, 6, 7);
        System.out.println("Result 2: " + result2);

        // Task 5: call product method with two double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }

    public static class Product {

        // Task 3: method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }
}