public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        ed.divTwoNums(10, 0);
    }

    public void divTwoNums(int x, int y) {
        System.out.println("Begin");

        // int z = x / y;  // This line is now commented out

        try {
            System.out.print(" 1 ");
        } catch (Exception e) {
            System.out.print(" 2 ");
        }
        System.out.print(" End ");
    }

}
