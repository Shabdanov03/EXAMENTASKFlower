package flowers;

import enams.Color;
import enams.Country;

import java.math.BigDecimal;

public class Tulyp extends Flower{
    public Tulyp(Country manufacturerCountry, byte shelfLifeInDays, Color color, BigDecimal price) {
        super(manufacturerCountry, shelfLifeInDays, color, price);
    }
}
