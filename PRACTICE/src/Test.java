class GrandParent{
	int a=23;
	int b=44;
	int c=55;
}
class Parent {
    int a = 10;
    int b = 20;
    int x = 111;
}
class Child extends Parent {
    int a = 100;
    int b = 200;
    int y = 222;
    
    void add(int a, int b) {
        System.out.println(a + b);
        System.out.println(this.a + this.b);
        System.out.println(super.a + super.b);
        GrandParent gp=new GrandParent();
        System.out.println(gp.a+gp.b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class Test{
    public static void main(String[] args) {
        Child c = new Child();
        c.add(1000, 2000);
    }
}