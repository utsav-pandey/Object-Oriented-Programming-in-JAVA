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

        /* 
            * Constants in Java
            * A constant is a variable whose value cannot be changed once it is assigned.
            * We can declare a constant using the final keyword.
            * MOSTLY WE USE CAPITAL LETTERS FOR CONSTANT VARIABLES.
        */
        final double PI = 3.14159; // constant variable
        System.out.println("\nConstant Value of PI: " + PI);
        final int MAX_ORDERS = 100; // constant variable
        System.out.println("Maximum Orders: " + MAX_ORDERS);
        final String COMPANY_NAME = "Tech Solutions"; // constant variable
        System.out.println("Company Name: " + COMPANY_NAME);
        
        /*  
            * Variable name cannot be the keyword in java. 
            * For example, int, double, class, public, static, void etc.
        */


        /*
            * Type casting in Java
            * Type casting is the process of converting a variable from one data type to another.
            * There are two types of type casting in Java:
            * 1. Implicit type casting (widening): It is done automatically by the compiler when we assign a value of a smaller data type to a larger data type.
            * 2. Explicit type casting (narrowing): It is done manually by the programmer when we assign a value of a larger data type to a smaller data type.
        */

        // Implicit type casting
        int num1 = 10; // 10 integer literal is assigned to num1 variable of int data type.
        double num2 = num1; // int to double
        System.out.println("\nImplicit Type Casting:");
        System.out.println("Integer Value: " + num1);
        System.out.println("Double Value: " + num2);

        // Explicit type casting
        double num3 = 9.78;
        int num4 = (int) num3; // double to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + num3);
        System.out.println("Integer Value: " + num4);



        /*
            * OPERATORS IN JAVA
            * 1. Arithmetic Operators: +, -, *, /, %
            * 2. Relational Operators: ==, !=, >, <, >=, <=
            * 3. Logical Operators: &&, ||, !
            * 4. Assignment Operators: =, +=, -=, *=, /=, %=
            * 5. Unary Operators: +, -, ++, --
            * 6. Bitwise Operators: &, |, ^, ~, <<, >>, >>>
            * 7. Ternary Operator: ? :
        */

        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); 
        System.out.println("Modulus: " + (a % 3)); // 10 % 3 = 1


        // Relational Operators : Gives boolean value true or false
        System.out.println("\nRelational Operators:");
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        int twenty = 20;
        int ten = 10;
        int five = 5;
        System.out.println("Is twenty greater than ten AND five and ten less than five? " + (twenty > ten && five < ten));
        System.out.println("Is twenty greater than ten OR five and ten less than five? " + (twenty > ten || five < ten));
        System.out.println("Is twenty NOT greater than ten? " + !(twenty > ten));

        // Assignment Operators
        int c = 15;
        System.out.println("\nAssignment Operators:");
        System.out.println("Initial value of c: " + c);
        c += 5; // equivalent to c = c + 5
        System.out.println("After c += 5: " + c);
        c -= 3; // equivalent to c = c - 3
        System.out.println("After c -= 3: " + c);
        c *= 2; // equivalent to c = c * 2
        System.out.println("After c *= 2: " + c);
        c /= 4; // equivalent to c = c / 4
        System.out.println("After c /= 4: " + c);
        c %= 3; // equivalent to c = c % 3
        System.out.println("After c %= 3: " + c);

        // Unary Operators
        double profit = 1000.50;
        System.out.println("\nUnary Operators:");
        System.out.println("Profit: " + profit);
        System.out.println("Profit after increment: " + (++profit)); // increment by 1 : it firt increases the value of profit by 1 and then returns the value of profit.
        System.out.println("Profit after decrement: " + (--profit)); // decrement by 1 : it first decreases the value of profit by 1 and then returns the value of profit.
        System.out.println("Profit after decrement: " + (profit--)); // decrement by 1 : it first returns the value of profit and then decreases the value of profit by 1.  
        System.out.println("Profit after decrement: " + (profit++)); // increment by 1 : it first returns the value of profit and then increases the value of profit by 1.
        // Unary + 
        System.out.println("Unary + Profit: " + (+profit)); // unary plus: indicates that the variable is positive
        // Unary -
        System.out.println("Unary - Profit: " + (-profit)); // unary minus: changes the sign of the variable
        System.out.println("Unary (+(-500)): " + (+(-500))); // unary plus: indicates that the variable is positive
        System.out.println("Unary (-(-500)): " + (-(-500))); // unary minus: changes the sign of the variable

        // Bitwise Operators
        int x = 5; // binary: 0101
        int y = 3; // binary: 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("X: " + x + " (binary: " + Integer.toBinaryString(x) + ")");
        System.out.println("Y: " + y + " (binary: " + Integer.toBinaryString(y) + ")");
        System.out.println("Bitwise AND (x & y): " + (x & y)); // binary: 0001 = 1
        System.out.println("Bitwise OR (x | y): " + (x | y)); // binary: 0111 = 7
        System.out.println("Bitwise XOR (x ^ y): " + (x ^ y)); // binary: 0110 = 6
        System.out.println("Bitwise NOT (~x): " + (~x)); // binary: 1010 = -6
        System.out.println("Left Shift (x << 1): " + (x << 1)); // binary: 1010 = 10
        System.out.println("Right Shift (x >> 1): " + (x >> 1)); // binary: 0010 = 2

        // Ternary Operator
        int marks = 75;
        String result = (marks >= 50) ? "Pass" : "Fail"; // ternary operator: if marks is greater than or equal to 50, then result is "Pass", otherwise result is "Fail"
        System.out.println("\nTernary Operator:");
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result);
    }
}
