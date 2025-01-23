public class Main {
    public static void main(String[] args) {
        // Good identifier
        int minutesPerHour = 60;
        System.out.println(minutesPerHour);
        //multiple variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        //One Value to Multiple Variables
        int a,b,c;
        a = b = c =50;
        System.out.println(a + b + c);

        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        char myVar1 = 97, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 10.3f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + currency + costPerItem);
        System.out.println("Total cost = " + currency + totalCost);

    }
}
