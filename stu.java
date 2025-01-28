public class stu {
    protected int age;

    int getAge(){   //accessor
        return age;
    }
    void setAge(int age){  //mutator
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("Invalid age! Age must be greater than 0");
        }
    }
    public static void main(String[] args) {
        stu stu = new stu();
        stu.setAge(20);
        System.out.println("Student's Age: " + stu.getAge());
    }
}
