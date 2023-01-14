package spring_introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat beat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
