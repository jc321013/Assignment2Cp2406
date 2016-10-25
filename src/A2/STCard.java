package A2;

import java.util.ArrayList;

/**
 * Created by jmarc on 25/10/2016.
 */
public class STCard{

    private int id;
    private String title;
    private String[] categories;
    private String chemicalFormula;
    private String classification;
    private String crystalSystem;
    private String[] occurrence = new String[]{};
    private float hardness;
    private float specificGravity;
    private String cleavage;
    private String crustalAbundance;
    private String economicValue;

    private static final ArrayList<STCard> cards = new ArrayList<>();

    public String toString()
    {
        return this.title + "\n  Hardness= " + this.hardness + "  |  Gravity= " + this.specificGravity + "  |  Cleavage= " + this.cleavage + "  |  Abundance= " + this.crustalAbundance + "  |  Value= " + this.economicValue + " ";
    }


    public STCard(int id, String title, String[] categories, String chemicalFormula, String classification, String crystalSystem, String[] occurrence, String hardness, String specificGravity, String cleavage, String crustalAbundance, String economicValue) {
        this.id = id;
        this.title = title;
        this.categories = categories;
        this.chemicalFormula = chemicalFormula;
        this.classification = classification;
        this.crystalSystem = crystalSystem;
        this.occurrence = occurrence;
        this.hardness = Float.parseFloat(String.valueOf(hardness));
        this.specificGravity = Float.parseFloat(String.valueOf(specificGravity));
        this.cleavage = cleavage;
        this.crustalAbundance = crustalAbundance;
        this.economicValue = economicValue;
    }


//public class A2.STCard {
//    private int id;
//
//
//    public A2.STCard(int id) {
//        this.id = id;
//    }





//    public String toString(){
//        return "ID= " + id;
//    }

}
