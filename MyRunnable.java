public interface MyRunnable {
    default void print(int x) { // Default method provides a body
        System.out.println(x);
    }
}
