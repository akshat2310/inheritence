public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int whight;

    public Animal(String name, int brain, int body, int size, int whight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.whight = whight;
    }

    public void move(){

    }

    public void eat(){
        System.out.println("Animal eat called");

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWhight() {
        return whight;
    }
}
