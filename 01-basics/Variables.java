/* Variables in Java 
    * A variable is a named memory that stores a value.
    * The type, name should be defined before using it. This is called declearing a variable.
    * The value of a variable can be changed during the execution of a program.
    * The value of a variable can be accessed using its name.

*/




public class Variables {
    public static void main(String[] args) {
        //declearation only
        int oderCount;
        // initialization only after declearing
        oderCount = 10;
        System.out.println("Order Count: " + oderCount);


        // Variable declaration and initialization
        int age = 25; // integer variable
        double height = 5.9; // double variable
        String name = "John"; // string variable
        boolean isStudent = true; // boolean variable

        // Printing the variables
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);

        // Data types in Java
        // Primitive data types but they are not objects.
        // 1. int: to store integer values. form -2,147,483,648 to 2,147,483,647
        System.out.println("\nPrimitive Data Types in Java:");
        int deliveryTime = 35;
        System.out.println("Delivery Time: " + deliveryTime + " minutes");
        // 2. double: to store decimal values. form 4.9E-324 to 1.7976931348623157E308
        double itemPrice = 19.99;
        System.out.println("Item Price: ₹" + itemPrice);
        // 3. char: to store a single character. form '\u0000'
        char symbol = 'A';
        System.out.println("Symbol: " + symbol);
        // 4. boolean: to store true or false values.
        boolean isAvailable = true;
        System.out.println("Is Available: " + isAvailable);
        // 5. byte: to store integer values. form -128 to 127
        byte discount = 10;
        System.out.println("Discount: " + discount + "%");
        // 6. short: to store integer values. form -32,768 to 32,767
        short stockCount = 500;
        System.out.println("Stock Count: " + stockCount);
        // 7. long: to store integer values. form -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long population = 7800000000L; // L is used to indicate long data type
        System.out.println("Population: " + population);
        // 8. float: to store decimal values. form 1.4E-45 to 3.4028235E38
        float temperature = 36.6f; // f is used to indicate float data type
        System.out.println("Temperature: " + temperature + "°C");


        // Non-primitive data types but they are objects.
        // 1. String: Ot store a string. It is a class in java.
        String Name = "Utsav";
        String city = "Jammu";
        String language = "I am learning Java";
        System.out.println("\nName: " + Name);
        System.out.println("City: " + city);
        System.out.println("Language: " + language);


    }
}
