package flowers;

import enams.Color;
import enams.Country;

import java.math.BigDecimal;

public class Roz extends Flower{
    public Roz(Country manufacturerCountry, byte shelfLifeInDays, Color color, BigDecimal price) {
        super(manufacturerCountry, shelfLifeInDays, color, price);
    }

}
