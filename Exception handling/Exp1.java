public class Exp1 {
    public static void main(String[] args) {
        try{
            System.out.println("First");
            int i = 6/Integer.parseInt(args[0]);// line no 5
            /*Iss case me last print nahi hoga kyonki jab line no 5 me Arithmetic execption milega to jvm corrosponding catch ko dhundhega agar ArithmeticException(ya koi bhi exception) mila to jvm catch me jagega or exception ko handle karwa dega or jahan pe exception mila uske baad sare line of code ko check nahi karega phir jvm catch ke baad wale line of codes ko execute karwayega*/
            System.out.println("last");
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
    
}
