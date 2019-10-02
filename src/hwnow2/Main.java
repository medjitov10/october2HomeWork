package hwnow2;

public class Main {

    public static void main(String[] args) {
        Animal elephant = new Animal(4, 25, true, "Elephant");
        Animal lion = new Animal(4, 40, true, "Lion");
        System.out.println(elephant.getNumLegs());
        System.out.println(elephant.infoSpeed());

        System.out.println(lion.infoSpeed());
    }
}
