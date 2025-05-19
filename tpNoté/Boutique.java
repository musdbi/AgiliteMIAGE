
/**
 * Décrivez votre classe Boutique ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Boutique
{
    private String nom;
    private double chiffreAffaires;
    private Personne gerant;

    /**
     * Constructeur d'objets de classe Boutique
     */
    public Boutique(String nom, double chiffreAffaires)
    {
        this.nom = nom;
        this.chiffreAffaires = chiffreAffaires;
    }

    public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public double getChiffresAffaires()
    {
        return chiffreAffaires;
    }
    
    public void setChiffresAffaires(double chiffreAffaires)
    {
        this.chiffreAffaires = chiffreAffaires;
    }
    
    public Personne getGerant (){
        return gerant;
    }
    
    public void setGerant (Personne gerant){
        this.gerant = gerant;
    }
    
    public void realiserTransac(double chiffre){
        this.chiffreAffaires += chiffre;
    }
    
}
