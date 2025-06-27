
/**
 * Décrivez votre classe Boutique ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

import java.util.ArrayList;
import java.util.List;

public class Boutique implements EntiteEconomique
{
    private String nom;
    private double chiffreAffaires = 0;
    private List<Article> inventaire = new ArrayList<>();
    private Pays paysOrigine;
    
    public Boutique(String nom)
    {
        this.nom = nom;
    }

    public Boutique(String nom, double chiffreAffaires)
    {
        this.nom = nom;
        this.chiffreAffaires = chiffreAffaires;
    }
    
    public Boutique(String nom, double chiffreAffaires, List<Article> inventaire)
    {
        this.nom = nom;
        this.chiffreAffaires = chiffreAffaires;
        this.inventaire = inventaire;
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
    
    public List<Article> getInventaire()
    {
        return new ArrayList <> (inventaire);
    }
    
    public boolean contientArticle(Article article) 
    {
        return inventaire.contains(article);
    }
    
    public void ajouterArticle (Article article)
    {
        if (!inventaire.contains(article)){
            inventaire.add(article);
            if (article.getBoutique() != this){
                article.setBoutique(this);
            }
        }
    }
    
    public void retirerArticle(Article article) 
    {
        if (inventaire.contains(article)) {
            inventaire.remove(article);
            if (article.getBoutique() == this) {
                article.setBoutique(null);
            }
        }
    }

    public double evaluerInventaire() 
    {
        double valeurTotale = 0.0;
        for (Article article : inventaire) {
            valeurTotale += article.getPrix();
        }
        return valeurTotale;
    }

    
    public void realiserTransac(double chiffre){
        this.chiffreAffaires += chiffre;
    }
    
    public void setPaysOrigine(Pays pays) { this.paysOrigine = pays; } // MODIFICATION 2
    public Pays getPaysOrigine() { return paysOrigine; }

    @Override
    public double getValeurTotale() {
        return chiffreAffaires + evaluerInventaire();
    }

    @Override
    public String getDescription() {
        String origine = (paysOrigine != null) ? " (Pays: " + paysOrigine.getName() + ")" : "";
        return "Boutique: " + nom + origine + " - " + inventaire.size() + " articles";
    }
}
