package fruits;

import net.karneim.pojobuilder.GenerateBuilderInterface;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@GenerateBuilderInterface(withName = "I*Builder")
@GeneratePojoBuilder(withBuilderInterface = IFruitBuilder.class)
public class Fruit {
  public String colour;
}


@GenerateBuilderInterface(withName = "I*Builder")
@GeneratePojoBuilder(withBuilderInterface = IAppleBuilder.class)
class Apple extends Fruit {
  public String variety;
}
