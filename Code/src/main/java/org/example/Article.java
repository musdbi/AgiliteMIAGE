package org.example;

public class Article
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

    public String getNom() {
        return nom;
    }

    public void setNom (String nom){
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Boutique getBoutique() {
        return this.boutique;
    }

    public void setBoutique(Boutique boutique) {
        if (this.boutique != null){
            this.boutique.retirerArticle(this);
        }

        this.boutique = boutique;

        if (boutique != null && !boutique.contientArticle(this)) {
            boutique.ajouterArticle(this);
        }
    }

    public boolean dansBoutique (Boutique boutique)
    {
        return this.boutique.contientArticle(this);
    }

}
