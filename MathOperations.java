class MathOperations {
    int add(int a, int b) {  // Method 1
        return a + b;
    }

    double add(double a, double b) {  // Method 2 (different parameter types)
        return a + b;
    }

    int add(int a, int b, int c) {  // Method 3 (different number of parameters)
        return a + b + c;
    }


    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 3));       // Calls int add(int, int)
        System.out.println(obj.add(5.5, 2.5));   // Calls double add(double, double)
        System.out.println(obj.add(1, 2, 3));    // Calls int add(int, int, int)
    }
}
