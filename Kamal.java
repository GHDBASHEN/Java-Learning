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
    int num1 =330;
    public static void main(String[] args) {
        Student x = new Kamal();
        Kamal y = new Kamal();//for num1
        System.out.println(y.num1);
        y.eat();
        System.out.println(Student.num);
    }
}
