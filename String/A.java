// This is a concept to clear it equals method ovveriden karna hai sayad(sayad kyon likha hai baad me mere ko dekhna hai or mark karenge agar clear ho jayega to [ NO ]); isse yes karna hai clear hone per

class B{
    String m;
    B(String s){
        m = s;
    }

    public boolean equals(Object o){
        B x = (B)o; // down cast 
        // System.out.println(this.m);
        // System.out.println(x.m);

        if(this.m.equals(x.m))
        return true;
        else
        return false;
    } 

}

public class A {
    public static void main(String[] args) {
        B b = new B("cbc"); //
        B c = new B("abc"); // 
        System.out.println(b.equals(c));//false aayega kyonko value same per address alag hai kyonki new se memory allocation hui hai

       /*String s = "Nikhil";
        String s1 = "Nikhil";

        System.out.println(s.equals(s1)); */ // true because literal se memory allocation hua hai or dono same value hai to dond ko jvm ek address me hi point karwayega.
        
    }
}
