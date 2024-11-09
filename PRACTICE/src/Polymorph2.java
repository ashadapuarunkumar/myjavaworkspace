class amar{
    public  void study() {
        System.out.println("Medicine");
    }
}
class ajay extends amar{
    //Method Hiding
    public  void study () {
        System.out.println("Acting");
    }
}
public class Polymorph2 {
    public static void main(String[] args) {
       amar p2 = new ajay();
        p2.study();
        
        //Child c2 = (Child) new Parent();
    }
}