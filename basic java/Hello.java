class Hello{
    public static void main(String[] args) {
            // converts String value to character array type value  
    //   String str = " Java programming";
    //   char retval[] = str.toCharArray();    
      
    //   // displays the converted value     
    //   System.out.println("Converted value to character array = ");
    //   System.out.println(retval);
    //   System.out.println(str.length());
    //   System.out.println(retval.length);
        // Custom input string
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@");
 
        for (String a : arrOfStr)
            System.out.println(a);
    
    }
}