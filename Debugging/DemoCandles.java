public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle("green", 12);
        ScentedCandle scentedCandle = new ScentedCandle("purple", 9);
        System.out.println("Candle colour: " + candle.getColour() + ", Height: "
                + candle.getHeight() + ", Total price: $" + String.format("%.2f", candle.getPrice()));
        System.out.println("Scented candle colour: " + scentedCandle.getColour() + ", Height: " + scentedCandle.getHeight()
                + ", Total price: $" + String.format("%.2f", scentedCandle.getPrice()));
        candle.setHeight(20);
        candle.setColour("red");
        scentedCandle.setHeight(13);
        scentedCandle.setColour("blue");
        System.out.println("Candle colour: " + candle.getColour() + ", Height: "
                + candle.getHeight() + ", Total price: $" + String.format("%.2f", candle.getPrice()));
        System.out.println("Scented candle colour: " + scentedCandle.getColour() + ", Height: " + scentedCandle.getHeight()
                + ", Total price: $" + String.format("%.2f", scentedCandle.getPrice()));
    }
}
