// First program of jar file

/*class A{
    public static void main(String[] args) throws Exception {
        Runtime r = Runtime.getRuntime();
        r.exec("calc");
    }
}*/

class A{
    private A(){ // Visible constructor

    }

    static A show(){
        A x = new A();
        return x;
    }

    public static void main(String[] args) {
        A x = A.show();
    }
}