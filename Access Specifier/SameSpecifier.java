// Same Access Specifier eg of public.
/*
 public     |  sabse strong
 protected  |  tab ye
 default    |  tab ye
 private    |  tab ye
 */

class Base{
   public void show(){  // Agar parent ka method public hai or usse override karna hai to child ka bhi method public karna padega or koi uppay nahi hai(No other way) Because public se higher privilege kisi ka hota nahi ya to privilege same ho child wala ya child wala strong ho.
    System.out.println("Base Show");
   }
}

class Child extends Base{
    public void show(){
        System.out.println("child show");
    }
}

class SameSpecifier{
    public static void main(String[] args) {
    Child c = new Child();
    c.show();
    }
}

// issi tarah 
// agar dono class ka method protected ho ya default ho ya public ho tab bhi program chalega. (bas child se strong nahi hona chahiye)