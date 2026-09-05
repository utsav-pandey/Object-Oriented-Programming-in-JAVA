/*
    * Java is a platform-independent, object-oriented programming language.
    * It is strongly typed, compiled and then interpreted.
    * it is multithreaded, secure and robust programming language.
*/
/*
    * Java is a high-level programming language developed by Sun Microsystems.
    * It was originally designed for interactive television, but it was too advanced for the digital cable television industry at the time.
    * The language was initially called Oak after an oak tree that stood outside Gosling's office.
    * Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.
    * It offers long term support.
*/

/*
    * JDK:- it stands for java development kit. It has java (compiler)(java --version) to compile the code to byte code.
    * it also has JRE (java runtime environment) to run the byte code i.e (javac) (javac -version)
    * We can use any integrated development environment (IDE) to write java code like eclipse, netbeans, intellij etc. but we prefer intellij or vscode.
*/

public class Main { 
    // class name of main class should be same as file name.
    // it should start with capital letter.
    public static void main(String[] args) { 
        System.out.println("Hello, World!\n"); 
        //system is a built in class and out is the meathod if that class which prints the string "Hello, World!".
    } // public emplise that this method can be accessed from anywhere, //
      // static means we can call this method without creating an object of the class,
      // void means it does not return any value,
      // main is the name of the method and //
      // String[] args is an array of strings which stores command line arguments.
}
