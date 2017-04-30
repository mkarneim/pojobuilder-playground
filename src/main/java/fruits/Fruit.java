package fruits;

import net.karneim.pojobuilder.GenerateBuilderInterface;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@GenerateBuilderInterface(withName = "I*Builder")
@GeneratePojoBuilder(withBuilderInterface = IFruitBuilder.class)
public class Fruit {
  public String colour;
}
