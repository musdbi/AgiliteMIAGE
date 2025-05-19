
/**
 * Décrivez votre classe Personne ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Personne
{
    private String nom;
    private int age;

    /**
     * Constructeur d'objets de classe Personne
     */
    public Personne(String nom, int age)
    {
        this.nom = nom;
        this.age = age;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String getNom()
    {
        return nom;
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public boolean isGerant (Boutique boutique) {
        if (boutique.getGerant().equals(this)){
            return true;
        }
        return false;
    }
}
