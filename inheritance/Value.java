//Use of super & this (keyword) in inheritance

public class Value extends Value1{
    int a = 20;

    void show(){
        int a = 30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Value v = new Value();
        v.show();
    }
}


class Value1 {
    int a = 40;
    Value1(){
        System.out.println(a);
    }
}