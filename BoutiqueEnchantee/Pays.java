import java.util.ArrayList;
import java.util.List;

public class Pays implements EntiteEconomique {
    private String name;
    private int population;
    private President president;
    private List<Boutique> boutiques = new ArrayList<>();

    public Pays(String name, int population, President president) {
        if (name == null || population <= 0 || president == null)
            throw new IllegalArgumentException("Au moins l'un des attributs n'est pas correct.");
        this.name = name;
        this.population = population;
        this.president = president;
    }

    public Pays(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() { return name; }
    public int getPopulation() { return population; }
    public President getPresident() { return president; }
    
    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Le nom est null.");
        this.name = name;
    }
    
    public void setPopulation(int population) {
        if (population <= 0)
            throw new IllegalArgumentException("La population est négative ou nulle.");
        this.population = population;
    }
    
    public void setPresident(President president) {
        if (president == null)
            throw new IllegalArgumentException("Le président est null.");
        this.president = president;
    }

    public double getDensity(int area) {
        if (area <= 0)
            throw new IllegalArgumentException("La superficie est négative ou nulle.");
        double density = (double) this.population / area;
        return Math.round(density * 100.0) / 100.0;
    }

    public String getCountryDetail() {
        if (this.president == null)
            return "Il n'y a aucun président pour le pays " + this.name + ".";
        return "Le président de " + this.name + " est " + this.president.getName() +
                ", avec un mandat de " + this.president.getMandateLength() + " ans.";
    }
    
     public void ajouterBoutique(Boutique boutique) {
        if (!boutiques.contains(boutique)) {
            boutiques.add(boutique);
            boutique.setPaysOrigine(this);
        }
    }

    @Override
    public double getValeurTotale() {
        return boutiques.stream().mapToDouble(Boutique::getValeurTotale).sum();
    }

    @Override
    public String getDescription() {
        return "Pays: " + name + " (" + boutiques.size() + " boutiques)";
    }
}
