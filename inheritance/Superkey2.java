// Super keyword used in constructor

public class Superkey2 {
    public static void main(String[] args) {
        M m = new M(100);
        M m1 = new M(300,200);
        m.show();
        m1.show();
    }
}

class M extends N{
    int m;
    M(int x){
        super(500);
    }

    M(int x, int y){
        super(100,200);
    }

}

class N{
    int m;

    N(int x){
        m = x;
    }

    N(int x,int y){
        m = x+y;
    }

    void show(){
        System.out.println(m);
    }
}



