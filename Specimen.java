import java.util.Arrays;
import java.util.LinkedList;

public class Specimen {
    private String name;
    private int cageNumber;
    private Species animaltype;

    public Specimen(String a, int c, Species s) {
        setName(a);
        setCage(c);
        setTOA(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCage() {
        return cageNumber;
    }

    public void setCage(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public Species getType() {
        return animaltype;
    }

    public void setTOA(Species toa) {
        this.animaltype = animaltype;
    }

    public static int countSpecimens (Specimen[] animals, Species s) {
        int count = 0;
        for (Specimen a : animals) {
            if (a.getType().getSpeciesName().equals(s.getSpeciesName()))
                count++;
        }
        return count;
    }

    public static LinkedList<Specimen> makeList(Specimen[] animals) {
        return new LinkedList<Specimen>(Arrays.asList(animals));
    }
}