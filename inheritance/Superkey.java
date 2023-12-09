// Super keyword in java used in constructor

public class Superkey {
    public static void main(String[] args) {
        S s = new S(100);
        s.show();
    }
}

/*class S extends P{     This is simple example

    S(){
        super(100,200);
    }

    // S(){
    //     super(100);
    // }
}

class P{
    P(int x, int y){

    }

    P(int x){

    }
} */


class S extends P{
    S(int x){
        super(x);
    }
    void show(){
        System.out.println(x); // ye wala x hai P ka instance x
    }
}

class P{
    int x;
    P(int x){
        this.x = x;
    }
}