package fruits;

import net.karneim.pojobuilder.GenerateBuilderInterface;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@GenerateBuilderInterface(withName = "I*Builder", extending = Builder.class)
@GeneratePojoBuilder(withBuilderInterface = IFruitBuilder.class)
public class Fruit {
  public String colour;
}
