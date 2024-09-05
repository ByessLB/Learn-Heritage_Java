
public abstract class Fruit {

    private String name;

    public String getName() {
        return name;
    }

    public Fruit(String name) {
        this.name = name;
    }

    public abstract void taste();

    public abstract int getSize();

    public abstract boolean hasSeed();

    public void miam() {
        System.out.println("Nom du fruit : " + getName());
        System.out.println("Miam, mangez 5 fruits et légumes par jour !");
    }
}
