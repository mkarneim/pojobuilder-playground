package fruits;

import net.karneim.pojobuilder.GenerateBuilderInterface;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@GenerateBuilderInterface(withName = "I*Builder", extending = IFruitBuilder.class)
@GeneratePojoBuilder(withBuilderInterface = IAppleBuilder.class)
public class Apple extends Fruit {
  public String variety;
}
