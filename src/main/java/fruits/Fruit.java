package fruits;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class Fruit {
  public String colour;
}

@GeneratePojoBuilder(withBaseclass=FruitBuilder.class)
class Apple extends Fruit {
  public String variety;
}
