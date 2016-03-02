/**
 * Created by shibik on 29/02/16.
 */

class Dog{
    public void bark(){
        System.out.println("woof");
    }
}

class Basenji extends Dog{
    public void bark(){}
}
public class Bark {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog o = new Basenji();
        d.bark();
        o.bark();
    }
}
