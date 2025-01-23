public class Kamal implements Student{

    public void eat() {
        System.out.println("Eat");
    }


    public void sleep() {
        System.out.println("sleep");
    }


    public void walk() {
        System.out.println("walk");
    }
    public static void main(String[] args) {
        Student x = new Kamal();
        System.out.println(Student.num);

    }
}
