package stepdefinitions;

import io.cucumber.java.fr.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.example.Article;
import org.example.Boutique;

public class BoutiqueStepDefinitions {

    private Article article;
    private Boutique boutique;
    private boolean resultatPresence;
    private double nouveauPrix;
    private double chiffreFinal;

    @Étantdonné("un article {string} au prix de {double}")
    public void un_article_au_prix_de(String nom, double prix) {
        article = new Article(nom, prix);
    }

    @Étantdonné("une boutique {string}")
    public void une_boutique(String nom) {
        boutique = new Boutique(nom);
    }

    @Quand("l'article est associé à la boutique")
    public void associer_article() {
        boutique.ajouterArticle(article);
    }

    @Alors("la vérification de présence de l'article dans la boutique doit retourner {string}")
    public void verification_presence(String attendu) {
        boolean attenduBool = Boolean.parseBoolean(attendu);
        assertEquals(attenduBool, boutique.contientArticle(article));
    }

    @Étantdonné("un article {string} avec un prix initial de {double}")
    public void article_avec_prix_initial(String nom, double prix) {
        article = new Article(nom, prix);
    }

    @Quand("le vendeur modifie le prix à {double}")
    public void modifier_prix(double nouveau) {
        article.setPrix(nouveau);
        this.nouveauPrix = nouveau;
    }

    @Alors("le prix de l'article doit être {double}")
    public void verifier_prix(double attendu) {
        assertEquals(attendu, article.getPrix(), 0.01);
    }

    @Étantdonné("une boutique {string} avec un chiffre d'affaires initial de {double}")
    public void boutique_avec_chiffre_initial(String nom, double caInitial) {
        boutique = new Boutique(nom, caInitial);
    }

    @Quand("le gérant réalise une transaction de {double}")
    public void gerant_fait_transaction(double montant) {
        boutique.realiserTransac(montant);
    }

    @Alors("le nouveau chiffre d'affaires doit être de {double}")
    public void verifier_chiffre_affaires(double attendu) {
        assertEquals(attendu, boutique.getChiffresAffaires(), 0.01);
    }
}
