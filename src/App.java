public class App {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.taste();
        a.miam();

        PineApple pen = new PineApple();
        pen.taste();
        pen.miam();

        if (a instanceof PeelFruit) {
            PeelFruit fruit = pen;
            fruit.isPeeled();
        }
    }
}
