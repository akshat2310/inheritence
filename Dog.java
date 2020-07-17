public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int whight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, whight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;

    }
    private void chwes(){
        System.out.println("dog chews");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat call");
        chwes();
        super.eat();
    }
}
