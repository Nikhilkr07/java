// Use of Super keyword super keyword for variables

public class Val {
    public static void main(String[] args) {
        Val1 v1 = new Val1();
        v1.show();
    }
}

class Val1 extends Val2{
    int a = 20;
    void show(){
        // System.out.println(a);
        System.out.println(super.a); // Excess val2 ka (a) using super keyword
    }
}

class Val2{
    int a = 30;
}
