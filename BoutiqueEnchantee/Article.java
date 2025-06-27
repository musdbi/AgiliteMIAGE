
/**
 * Décrivez votre classe Article ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Article implements EntiteEconomique
{
    private String nom;
    private double prix;
    private Boutique boutique = null;

    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Article(String nom, double prix, Boutique boutique) {
        this.nom = nom;
        this.prix = prix;
        this.boutique = boutique;
    }

    // Getters/Setters INCHANGÉS
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
    public Boutique getBoutique() { return this.boutique; }

    public void setBoutique(Boutique boutique) {
        if (this.boutique != null) {
            this.boutique.retirerArticle(this);
        }
        this.boutique = boutique;
        if (boutique != null && !boutique.contientArticle(this)) {
            boutique.ajouterArticle(this);
        }
    }

    public boolean dansBoutique(Boutique boutique) {
        return this.boutique != null && this.boutique.contientArticle(this);
    }

    @Override
    public double getValeurTotale() { return prix; }

    @Override
    public String getDescription() {
        String origine = "";
        if (boutique != null && boutique.getPaysOrigine() != null) {
            origine = " - Forgé au " + boutique.getPaysOrigine().getName();
            if (boutique.getPaysOrigine().getPresident() != null) {
                origine += " sous le mandat de " + boutique.getPaysOrigine().getPresident().getName();
            }
        }
        return "Article: " + nom + origine;
    }
}
