package fruits;

public class Main {
  public static void main(String[] args) {
    Apple apple = makeGreen($pinkLady());
    Fruit banana = makeGreen($blueFuit());
  }

  static AppleBuilder $pinkLady() {
    return new AppleBuilder().withColour("red-green").withVariety("Pink Lady");
  }

  static FruitBuilder $blueFuit() {
    return new FruitBuilder().withColour("blue");
  }

  public static <B extends IFruitBuilder<P>, P extends Fruit> P makeGreen(B builder) {
    builder.withColour("green");
    return builder.build();
  }
}
