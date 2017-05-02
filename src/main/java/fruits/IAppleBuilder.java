package fruits;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public interface IAppleBuilder<P extends Apple> extends IFruitBuilder<P> {
  
  /**
   * Sets the default value for the {@link Fruit#colour} property.
   *
   * @param value the default value
   * @return this builder
   */
  public IAppleBuilder<P> withColour(String value);
  
  /**
   * Sets the default value for the {@link Apple#variety} property.
   *
   * @param value the default value
   * @return this builder
   */
  public IAppleBuilder<P> withVariety(String value);

}
