package fruits;

public class Main {
  public static void main(String[] args) {
    Apple apple = makeGreen($pinkLady());
    Fruit banana = makeGreen($blueFuit());
    
    AppleBuilder $greenDelicious = greenify(new AppleBuilder().withVariety("Red Delicious"));
    
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
  
  public static <B extends IFruitBuilder<P>, P extends Fruit> B greenify(B builder) {
    builder.withColour("green");
    return builder;
  }
}
