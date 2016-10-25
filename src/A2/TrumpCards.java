package A2;

/**
 * Created by jmarc on 25/10/2016.
 */
public class TrumpCards extends STCard {
    private String description;

    public TrumpCards (int id, String title, String[] categories, String description) {
        super(id, "Quartz", new String[]{""}, "SiO_2", "tectosilicate", "hexagonal", new String[]{"igneous", "metamorphic", "sedimentary"}, "7.0", "2.65", "poor/none", "high", "moderate");
        this.description = description;
    }

}
