package Hello;

public class hello {
    public static void main(String args[]){
     Bankacc b1= new Bankacc();
     b1.name = "Vinayak";
     System.out.println(b1.name);
    }
}
class Bankacc{
    String name;
    Bankacc(){
        System.out.println("this is a constructor");
    }
}
