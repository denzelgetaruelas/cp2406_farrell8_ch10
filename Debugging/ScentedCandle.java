public class ScentedCandle extends Candle {
    public ScentedCandle(String color, int height) {
        super(color, height);
    }
    @Override
    public double getPrice() {
        return height * 3;
    }
}
