// Abstract class example of Big car (lion , tiger, cheetah, lapad, panther)

class Lion extends Bigcat{
    void hunting(){
        System.out.println("Lions - 25% successful kills. ...");
    }

    void weight(){
        System.out.println("A big lion weight lies between 130 kg to 190 kg");
    }

    void biteforce(){
        System.out.println("Lion Bite Force: 650 PSI");
    }

    void status(){
        System.out.println("He is the King of forest");
    }
}


class Tiger extends Bigcat{
    void hunting(){
        System.out.println("Tiger - 5% successful kills.");
    }

    void weight(){
        System.out.println("A big Tiger weight lies between 90 kg to 310 kg");
    }

    void biteforce(){
        System.out.println("Tiger Bite Force: 1,050 PSI");
    }

    void status(){
        System.out.println("National animal of india");
    }
}


class Cheetah extends Bigcat{
    void hunting(){
        System.out.println("Tiger - 58% successful kills.");
    }

    void weight(){
        System.out.println("A big cheetah weight lies between 34 kg to 64 kg");
    }

    void biteforce(){
        System.out.println("cheetah Bite Force:  400 to 500 PSI.");
    }

    void status(){
        System.out.println("Cheeta is fasted running animal in the world");
    }
}


class Leopard extends Bigcat{
    void hunting(){
        System.out.println("Leopard - 38% successful kills. ..");
    }

    void weight(){
        System.out.println("A big Leopard weight lies between 50 to 90 kg");
    }

    void biteforce(){
        System.out.println("Leopard Bite Force:   300 PSI ");
    }

    void status(){
        System.out.println("Leopards are Solitary Animals. .");
    }
}


abstract class Bigcat {
    String behaviour = "dangerous!";

    void common(){
        System.out.println("Big cat is most dangerous hunter");
    }
    abstract void hunting();
    abstract void weight();
    abstract void biteforce();
    abstract void status();
}
public class Abstract1{


    public static void main(String[] args) {
        // Bigcat b = new Lion(); // upcasting
        // Bigcat b = new Tiger();
        // Bigcat b = new Cheetah();
        Bigcat b = new Leopard();
        
        b.hunting();
        b.weight();
        b.biteforce();
        b.status();
        b.common();
        System.out.println(b.behaviour);
    }
}
