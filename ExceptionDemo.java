public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        ed.divTwoNums(10, 0);
    }

    public void divTwoNums(int x, int y) {
        System.out.println("Begin");

        int z = x / y;  // Division by zero still causes an ArithmeticException

        try {
            System.out.print(" 1 ");
        } finally {
            System.out.print(" 3 ");
        }
        System.out.print(" End ");
    }
}
