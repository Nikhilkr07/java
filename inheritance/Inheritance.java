// basic of inheritance


class Par{
    void par(){
        System.out.println("i am parent");
        System.out.println("yes");
    }
}

class Chi extends Par{
    void chi(){
        System.out.println("i am your child");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Chi c = new Chi();
        c.chi();
        System.out.println("i calling you parent");
        c.par();
        
    }
}
