package fruits;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class AppleBuilder
    implements IAppleBuilder<Apple>, Cloneable {
  protected AppleBuilder self;
  protected String value$variety$java$lang$String;
  protected boolean isSet$variety$java$lang$String;
  protected String value$colour$java$lang$String;
  protected boolean isSet$colour$java$lang$String;

  /**
   * Creates a new {@link AppleBuilder}.
   */
  public AppleBuilder() {
    self = (AppleBuilder)this;
  }

  /**
   * Sets the default value for the {@link Apple#variety} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AppleBuilder withVariety(String value) {
    this.value$variety$java$lang$String = value;
    this.isSet$variety$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Apple#colour} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AppleBuilder withColour(String value) {
    this.value$colour$java$lang$String = value;
    this.isSet$colour$java$lang$String = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      AppleBuilder result = (AppleBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public AppleBuilder but() {
    return (AppleBuilder)clone();
  }

  /**
   * Creates a new {@link Apple} based on this builder's settings.
   *
   * @return the created Apple
   */
  @Override
  public Apple build() {
    try {
      Apple result = new Apple();
      if (isSet$variety$java$lang$String) {
        result.variety = value$variety$java$lang$String;
      }
      if (isSet$colour$java$lang$String) {
        result.colour = value$colour$java$lang$String;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
