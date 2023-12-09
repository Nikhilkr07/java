// Super keyword using in (methods)

public class Superkey3 {
    public static void main(String[] args) {
       Q q = new Q();
       q.disp();
    }
}


class P {
    void show(){
        System.out.println("P");
    }
}

class Q extends P{
    void show(){
        System.out.println("Q");
    }

    void disp(){
        show();
        super.show();
    }
}

