public class MyClass {
    int a=3;
    {
        System.out.println(a);
    }
    static{
        System.out.print(4);
    }
    MyClass(){
        System.out.println(a+2);
    }
    MyClass(int y){
        this();
        this.a=y;
        System.out.println(a+3);

    }
}
