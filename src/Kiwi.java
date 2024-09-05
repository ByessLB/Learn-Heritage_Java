
public class Kiwi extends Fruit implements PeelFruit {

    private boolean peeled = false;

    public Kiwi() {
        super("Kiwi");
    }

    @Override
    public void taste() {
        System.out.println("Le kiwi est un peu acide !");
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
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "doux";
    }
}
