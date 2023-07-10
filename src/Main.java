public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setDread("Фарель");
        fish.setEag("4");
        System.out.println(fish.getName());
        System.out.println(fish.getDread());
        System.out.println(fish.getEag());
        Dog dog= new Dog();
        dog.setName("Rexs");
        dog.setDread("pitbull");
        dog.setEag("5");
        System.out.println(dog.getName());
        System.out.println(dog.getDread());
        System.out.println(dog.getEag());

        Parrot parrot= new Parrot();
        parrot.setName("Popugai");
        parrot.setDread("petux");
        parrot.setEag("3");
        System.out.println(parrot.getName());
        System.out.println(parrot.getDread());
        System.out.println(parrot.getEag());


        Cat cat = new Cat();
        cat.setName("garfild");
        cat.setDread("Cot");
        cat.setEag("5");
        System.out.println(cat.getName());
        System.out.println(cat.getDread());
        System.out.println(cat.getEag());
    }
}