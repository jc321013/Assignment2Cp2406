package A1;

import java.util.ArrayList;

/**
 * Created by jmarc on 25/10/2016.
 */
public class STDeckBuilder {
    protected ArrayList<STCard> cards;

    public ArrayList<STCard> STCard(){

        cards.add(new STCard(1, "Quartz", new String [] {""}, "SiO_2", "tectosilicate", "hexagonal", new String[] {"igneous", "metamorphic", "sedimentary"}, "7.0", "2.65", "poor/none", "high", "moderate"));
        cards.add(new STCard(2, "Plagioclase", new String[] {""}, "Na Al Si_2 O_8 - Ca Al_2 Si_2 O_8", "tectosilicate", "triclinic", new String[] {"igneous", "metamorphic", "sedimentary"}, "6.5", "2.8", "1 perfect, 1 good", "very high", "moderate"));
        cards.add(new STCard(3, "Orthoclase", new String[] {""}, "K Al Si_3 O_3", "tectosilicate", "monoclinic", new String[] {"igneous", "metamorphic", "sedimentary"}, "6.5", "2.6", "1 perfect, 1 good", "high", "moderate"));
        cards.add(new STCard(4, "Biotite", new String[] {""}, "K(Fe, Mg)_3 Al Si_3 O_10 (OH)_2", "phyllosilicate", "monoclinic", new String[] {"igneous", "metamorphic"}, "3.0", "3.3", "1 perfect", "moderate", "low"));
        cards.add(new STCard(5, "Muscovite", new String[] {""}, "K Al_3 Si_3 O_10 (O H)_2", "phyllosilicate", "monoclinic", new String[] {"igneous", "metamorphic"}, "3.0", "2.9", "1 perfect", "moderate", "moderate"));
        cards.add(new STCard(6, "Hornblende", new String[] {""}, "Ca_2 (Mg, Fe)_4 Al_2 Si_7 O_22 (OH)_2", "inosilicate", "monoclinic", new String[] {"igneous", "metamorphic"}, "6.0", "3.5", "2 good", "moderate", "trivial"));
        cards.add(new STCard(7, "Actinolite", new String[] {""}, "Ca_2 (Mg, Fe)_5 Si_8 O_22 (OH)_2", "inosilicate", "monoclinic", new String[] {"metamorphic"}, "6.0", "3.5", "2 good", "low", "low"));
        cards.add(new STCard(8, "Glaucophane", new String[] {""}, "Na_2 (Mg, Fe)_3 Al_2 Si_8 O_22 (OH)_2", "inosilicate", "monoclinic", new String[] {"metamorphic"}, "6.0", "3.2", "2 good", "low", "trivial"));
        cards.add(new STCard(9, "Olivine", new String[] {""}, "(Mg, Fe)_2 Si O_4", "nesosilicate", "orthorhombic", new String[] {"igneous", "metamorphic", "mantle"}, "7.0", "4.4", "2 poor", "high", "low"));
        cards.add(new STCard(10, "Garnet", new String[] {""}, "(Fe, Mg, Ca, Mn)_3 (Al, Fe)_2 Si_3 O_12", "nesosilicate", "isometric", new String[] {"igneous", "metamorphic", "mantle"}, "7.5", "4.3", "none", "moderate", "moderate"));
        cards.add(new STCard(11, "Titanite", new String[] {""}, "Ca Ti Si O_5", "nesosilicate", "monoclinic", new String[] {"igneous", "metamorphic"}, "5.5", "3.6", "3 good", "low", "low"));
        cards.add(new STCard(12, "Zircon", new String[] {""}, "Zr Si O_4", "nesosilicate", "tetragonal", new String[] {"igneous", "metamorphic", "sedimentary"}, "7.5", "4.7", "2 poor", "trace", "moderate"));
        cards.add(new STCard(13, "Augite", new String[] {""}, "Ca (Mg, Fe) Si_2 O_6", "inosilicate", "monoclinic", new String[] {"igneous", "metamorphic"}, "6.5", "3.6", "2 good", "high", "trivial"));
        cards.add(new STCard(14, "Orthopyroxene", new String[] {""}, "(Mg, Fe)_2 Si_2 O_6", "inosilicate", "orthorhombic", new String[] {"igneous", "metamorphic", "mantle"}, "6.0", "3.9", "2 good", "high", "trivial"));
        cards.add(new STCard(15, "Chlorite", new String[] {""}, "(Mg, Fe)_5 Al_2 Si_3 O_10 (OH)_8", "phyllosilicate", "monoclinic", new String[] {"metamorphic"}, "3.0", "3.3", "1 perfect", "moderate", "low"));
        cards.add(new STCard(16, "Antigorite", new String[] {""}, "(Mg, Fe)_3 Si_2 O_5 (OH)_4", "phyllosilicate", "monoclinic", new String[] {"metamorphic", "mantle"}, "4.0", "2.6", "1 perfect", "low", "low"));
        cards.add(new STCard(17, "Talc", new String[] {""}, "Mg_3 Si_4 O_10 (OH)_2", "phyllosilicate", "monoclinic", new String[] {"metamorphic"}, "1.0", "2.8", "1 perfect", "low", "moderate"));
        cards.add(new STCard(18, "Kaolinite", new String[] {""}, "Al_2 Si_2 O_5 (OH)_4", "phyllosilicate", "triclinic", new String[] {"sedimentary"}, "2.5", "2.7", "1 perfect", "moderate", "high"));
        cards.add(new STCard(19, "Andalusite", new String[] {""}, "Al_2 Si O_5", "nesosilicate", "orthorhombic", new String[] {"metamorphic"}, "7.0", "3.15", "2 good", "low", "moderate"));
        cards.add(new STCard(20, "Kyanite", new String[] {""}, "Al_2 Si O_5", "nesosilicate", "triclinic", new String[] {"metamorphic"}, "7.0", "3.7", "1 perfect, 1 good", "trace", "moderate"));
        cards.add(new STCard(21, "Sillimanite", new String[] {""}, "Al_2 Si O_5", "nesosilicate", "orthorhombic", new String[] {"igneous", "metamorphic"}, "7.5", "3.25", "1 perfect, 1 good", "low", "low"));
        cards.add(new STCard(22, "Staurolite", new String[] {""}, "(Fe, Mg)_2 Al_9 Si_4 O_22 (OH)_2", "nesosilicate", "monoclinic", new String[] {"metamorphic"}, "7.0", "3.8", "1 good", "trace", "low"));
        cards.add(new STCard(23, "Epidote", new String[] {""}, "Ca_2 (Al, Fe)_3 Si_3 O_12 (OH)", "sorosilicate", "monoclinic", new String[] {"igneous", "metamorphic"}, "6.5", "3.5", "1 perfect", "moderate", "trivial"));
        cards.add(new STCard(24, "Tourmaline", new String[] {""}, "Na (Mg, Fe)_3 Al_6 B_3 Si_6 O_27 (OH)_4", "cyclosilicate", "hexagonal", new String[] {"metamorphic"}, "7.5", "3.2", "2 poor", "trace", "moderate"));
        cards.add(new STCard(25, "Topaz", new String[] {""}, "Al_2 Si O_4 (F, OH)_2", "nesosilicate", "orthorhombic", new String[] {"metamorphic", "sedimentary"}, "8.0", "3.6", "1 perfect", "ultratrace", "low"));
        cards.add(new STCard(26, "Beryl", new String[] {""}, "Be_3 Al_2 Si_6 O_18", "cyclosilicate", "hexagonal", new String[] {"igneous", "metamorphic"}, "8.0", "2.9", "1 poor", "trace", "moderate"));
        cards.add(new STCard(27, "Pyrite", new String[] {""}, "Fe S_2", "sulfide", "isometric", new String[] {"igneous", "metamorphic"}, "6.5", "5.0", "2 poor", "low", "moderate"));
        cards.add(new STCard(28, "Pyrrhotite", new String[] {""}, "Fe_{1-x} S", "sulfide", "monoclinic", new String[] {"igneous", "metamorphic"}, "4.5", "4.6", "none", "low", "moderate"));
        cards.add(new STCard(29, "Chalcopyrite", new String[] {""}, "Cu Fe S_2", "sulfide", "tetragonal", new String[] {"igneous", "metamorphic"}, "4.0", "4.3", "2 poor", "low", "very high"));
        cards.add(new STCard(30, "Galena", new String[] {""}, "Pb S", "sulfide", "isometric", new String[] {"metamorphic"}, "2.5", "7.6", "3 perfect", "trace", "high"));
        cards.add(new STCard(31, "Sphalerite", new String[] {""}, "(Zn, Fe) S", "sulfide", "isometric", new String[] {"metamorphic"}, "4.0", "4.1", "6 perfect", "trace", "high"));
        cards.add(new STCard(32, "Molybdenite", new String[] {""}, "Mo S_2", "sulfide", "hexagonal", new String[] {"igneous", "metamorphic"}, "1.5", "4.7", "1 perfect", "trace", "high"));
        cards.add(new STCard(33, "Gold", new String[] {""}, "Au", "native element", "isometric", new String[] {"metamorphic", "sedimentary"}, "3.0", "19.3", "none", "ultratrace", "I'm rich!"));
        cards.add(new STCard(34, "Diamond", new String[] {""}, "C", "native element", "isometric", new String[] {"igneous", "metamorphic", "sedimentary"}, "10.0", "3.5", "4 perfect", "ultratrace", "I'm rich!"));
        cards.add(new STCard(35, "Graphite", new String[] {""}, "C", "native element", "hexagonal", new String[] {"meatmorphic", "sedimentary"}, "2.0", "2.2", "1 perfect", "trace", "moderate"));
        cards.add(new STCard(36, "Halite", new String[] {""}, "Na Cl", "halide", "isometric", new String[] {"sedimentary"}, "2.5", "2.2", "3 perfect", "trace", "moderate"));
        cards.add(new STCard(37, "Fluorite", new String[] {""}, "Ca F_2", "halide", "isometric", new String[] {"metamorphic"}, "4.0", "3.2", "4 perfect", "trace", "moderate"));
        cards.add(new STCard(38, "Gypsum", new String[] {""}, "Ca S O_4 (H_2 O)_2", "sulfate", "monoclinic", new String[] {"metamorphic", "sedimentary"}, "2.0", "2.3", "1 perfect, 2 good", "trace", "high"));
        cards.add(new STCard(39, "Barite", new String[] {""}, "Ba S O_4", "sulfate", "orthorhombic", new String[] {"metamorphic", "sedimentary"}, "3.5", "4.5", "2 perfect, 1 good", "trace", "moderate"));
        cards.add(new STCard(40, "Apatite", new String[] {""}, "Ca_5 (P O_4)_3 (OH, F, Cl)", "phosphate", "hexagonal", new String[] {"igneous", "metamorphic", "sedimentary"}, "5.0", "3.2", "2 poor", "low", "high"));
        cards.add(new STCard(41, "Monazite", new String[] {""}, "(La, Ce, Nd) P O_4", "phosphate", "monoclinic", new String[] {"igneous", "metamorphic", "sedimentary"}, "5.0", "5.3", "1 good, 1 poor", "trace", "moderate"));
        cards.add(new STCard(42, "Calcite", new String[] {""}, "Ca C O_3", "carbonate", "hexagonal", new String[] {"igneous", "metamorphic", "sedimentary"}, "3.0", "2.7", "3 perfect", "moderate", "high"));
        cards.add(new STCard(43, "Dolomite", new String[] {""}, "Ca Mg (C O_3)_2", "carbonate", "hexagonal", new String[] {"metamorphic", "sedimentary"}, "4.0", "2.9", "3 perfect", "low", "low"));
        cards.add(new STCard(44, "Magnesite", new String[] {""}, "Mg C O_3", "carbonate", "hexagonal", new String[] {"metamorphic", "sedimentary"}, "4.0", "3.0", "3 perfect", "low", "moderate"));
        cards.add(new STCard(45, "Siderite", new String[] {""}, "Fe C O_3", "carbonate", "hexagonal", new String[] {"metamorphic", "sedimentary"}, "4.5", "4.0", "3 perfect", "trace", "moderate"));
        cards.add(new STCard(46, "Magnetite", new String[] {""}, "Fe_3 O_4", "oxide (spinel)", "isometric", new String[] {"igneous", "metamorphic", "sedimentary"}, "6.0", "5.2", "none", "moderate", "very high"));
        cards.add(new STCard(47, "Hematite", new String[] {""}, "Fe_2 O_3", "oxide", "hexagonal", new String[] {"metamorphic", "sedimentary"}, "6.0", "5.3", "none", "trace", "high"));
        cards.add(new STCard(48, "Chromite", new String[] {""}, "(Fe, Mg) Cr_2 O_4", "oxide (spinel)", "isometric", new String[] {"igneous", "sedimentary"}, "5.5", "5.1", "none", "low", "high"));
        cards.add(new STCard(49, "Ilmenite", new String[] {""}, "Ti Fe O_3", "oxide", "hexagonal", new String[] {"igneous", "metamorphic", "sedimentary"}, "6.0", "4.8", "none", "low", "moderate"));
        cards.add(new STCard(50, "Rutile", new String[] {""}, "Ti O_2", "oxide", "tetragonal", new String[] {"metamorphic", "sedimentary"}, "6.5", "4.3", "2 good", "low", "high"));
        cards.add(new STCard(51, "Corundum", new String[] {""}, "Al_2 O_3", "oxide", "hexagonal", new String[] {"metamorphic", "sedimentary"}, "9.0", "4.0", "none", "trace", "moderate"));
        cards.add(new STCard(52, "Cassiterite", new String[] {""}, "Sn O_2", "oxide", "tetragonal", new String[] {"igneous", "metamorphic", "sedimentary"}, "7.0", "7.1", "1 good, 1 perfect", "trace", "high"));
        cards.add(new STCard(53, "Gibbsite", new String[] {""}, "Al (O H)_3", "hydroxide", "monoclinic", new String[] {"metamorphic", "sedimentary"}, "3.5", "2.4", "1 perfect", "low", "high"));
        cards.add(new STCard(54, "Goethite", new String[] {""}, "Fe O (OH)", "hydroxide", "orthorhombic", new String[] {"sedimentary"}, "5.5", "4.3", "1 perfect, 1 good", "moderate", "moderate"));


        cards.add(new TrumpCards(55, "The Miner", new String[] {""}, "Change to trumps category to Economic value"));
        cards.add(new TrumpCards(56, "The Petrologist", new String[] {""}, "Change to trumps category to Crustal Abundance"));
        cards.add(new TrumpCards(57, "The Gemmologist", new String[] {""}, "Change to trumps category to Hardness"));
        cards.add(new TrumpCards(58, "The Mineralogist", new String[] {""}, "Change to trumps category to Cleavage"));
        cards.add(new TrumpCards(59, "The Geophysicist", new String[] {""}, "Change to trumps category to Specific Gravity"));
        cards.add(new TrumpCards(60, "The Geologist", new String[] {""}, "Change to trumps category of your choice"));

        return cards;
    }


}
