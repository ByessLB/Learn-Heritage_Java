
public class Strawberry extends Fruit {

    public Strawberry() {
        super("Fraise");
    }

    @Override
    public void taste() {
        System.out.println("La fraise est sucrée !");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
