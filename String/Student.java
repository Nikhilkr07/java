// Object toString method hashcode in java

class Student{
    public static void main(String[] args) {
        // Student s = new Student();
        // System.out.println(s);

        // One o = new One();
        // System.out.println(o);

        String s = new String("BCA");
        System.out.println(s);

        String1 s1 = new String1("ABC");
        System.out.println(s1);

    }
}

// class One{
//     public String toString(){
//         return getClass().getName()+"*"+Integer.toHexString(hashCode());
//     }
// }

// class One{
//     public String toString(){
//         return "Ram";
//     }
// }


class String1{
    String m;
    String1(String m){
        this.m = m;
    }

    public String toString(){
        return m;
    }
}

