// Character in java

class B{
    char c = '\u0000'; // Unicode character
    //char c;
}

public \u0063lass A {
    public static void main(String[] args) {
        //char c = 'a';
        //System.out.println((int)c);//printf ascii value
        B b = new B();
        System.out.println((int)b.c); // 0

        int a = 64;
        System.out.println(Integer.toBinaryString(a)); //1000000
        System.out.println(Integer.toHexString(a));  //40

        char c1 = '\u0061';
        System.out.println(c1);
        char c2 = '\u0062';
        System.out.println(c2);

        ch\u0061r \u0063 = '\u0062';
        // char      c   =     b
        System.out.println(c);

    }
}
