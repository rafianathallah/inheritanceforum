import java.util.LinkedList;

public class Species extends Genus {
    private String speciesName;

    public Species(String s, String g) {
        super(g);
        setSpeciesName(s);
    }

    public void setSpeciesName(String s) {
        speciesName = s;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String toString() {
        return "Species: " + getGenusName() + " " + speciesName;
    }

    public boolean equals(Species s) {
        return speciesName.equals(s.getSpeciesName());
    }

    public static LinkedList<Species> makeSpeciesList(LinkedList<Specimen> animals){
        LinkedList<Species> speciesList = new LinkedList<Species>();
        for(Specimen a : animals) {
            speciesList.add(a.getType());
        }
        return speciesList;
    }

    public static LinkedList<Species> makeSpeciesListUnique(LinkedList<Species> allSpecies){
        LinkedList<Species> speciesNew = new LinkedList<Species>();
        for(Species a : allSpecies) {
            if(!speciesNew.contains(a)){
                speciesNew.add(a);
            }
        }
        return speciesNew;
    }
}