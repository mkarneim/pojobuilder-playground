package fruits;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public interface IFruitBuilder<P extends Fruit>
    extends Builder<P> {

  /**
   * Sets the default value for the {@link Fruit#colour} property.
   *
   * @param value the default value
   * @return this builder
   */
  public IFruitBuilder<P> withColour(String value);

}
