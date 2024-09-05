
public class Apple extends Fruit implements PeelFruit {

    public Apple() {
        super("Pomme");
    }

    @Override
    public void taste() {
        System.out.println("La pomme est plutôt sucrée !");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }

    @Override
    public boolean isPeeled() {
        return false;
    }

    @Override
    public String getSkinType() {
        return "lisse";
    }
}
