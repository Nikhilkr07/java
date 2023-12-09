// We can overload main mehtod in java

public class MainMethodOverload {
    // Overloaded main method 1
    // According to us this overloaded method
    // Should be executed when int value is passed
    public static void main(int args)
    {
        System.out.println("main() overloaded"+ " method 1 Executing");
    }
  
    // Overloaded main method 2
    // According to us this overloaded method
    // Should be executed when character is passed
    public static void main(char args)
    {
        System.out.println("main() overloaded"+ " method 2 Executing");
    }
  
    // Overloaded main method 3
    // According to us this overloaded method
    // Should be executed when double value is passed
    public static void main(double[] args)
    {
        System.out.println("main() overloaded"+ " method 3 Executing");
    }
  
    // Original main()
    public static void main(String[] args)
    {
        System.out.println("Original main()"+ " Executing");
        MainMethodOverload.main(10);
        MainMethodOverload.main('a');
        double d[] = {10.5};
        MainMethodOverload.main(d);

    }
}
