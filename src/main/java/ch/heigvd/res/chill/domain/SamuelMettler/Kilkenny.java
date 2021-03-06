package ch.heigvd.res.chill.domain.SamuelMettler;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kilkenny implements IProduct {

  public final static String NAME = "Kilkenny";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
