

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import java.util.List;


/**
 * Classe-test RelationBoutiqueArticleTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class RelationBoutiqueArticleTest
{
    @Test
    public void testRelationBidirectionnelle() {
        // Préparation des objets magiques
        Boutique boutique1 = new Boutique("Antiquités Mystiques", 300.0);
        Boutique boutique2 = new Boutique("Emporio Magica", 500.0);
        Article miroir = new Article("Miroir des Âmes", 250.0);
        
        // Test de l'association initiale
        miroir.setBoutique(boutique1);
        assertTrue("L'article devrait être dans l'inventaire de la boutique 1", 
                  boutique1.contientArticle(miroir));
        assertEquals("La boutique de l'article devrait être boutique 1", 
                    boutique1, miroir.getBoutique());
        
        // Test du changement de boutique
        miroir.setBoutique(boutique2);
        assertFalse("L'article ne devrait plus être dans l'inventaire de la boutique 1", 
                   boutique1.contientArticle(miroir));
        assertTrue("L'article devrait maintenant être dans l'inventaire de la boutique 2", 
                  boutique2.contientArticle(miroir));
        assertEquals("La boutique de l'article devrait être boutique 2", 
                    boutique2, miroir.getBoutique());
        
        // Test de la suppression de l'association
        boutique2.retirerArticle(miroir);
        assertNull("L'article ne devrait plus avoir de boutique associée", 
                  miroir.getBoutique());
        assertFalse("L'article ne devrait plus être dans l'inventaire de la boutique 2", 
                   boutique2.contientArticle(miroir));
    }
    
    @Test
    public void testInventaireMultiple() {
        // Création d'une boutique avec plusieurs articles
        Boutique grandeEchoppe = new Boutique("Grande Échoppe des Merveilles", 1000.0);
        
        Article potion = new Article("Potion d'invisibilité", 120.0);
        Article chapeau = new Article("Chapeau de métamorphose", 85.0);
        Article boule = new Article("Boule de cristal", 200.0);
        
        grandeEchoppe.ajouterArticle(potion);
        grandeEchoppe.ajouterArticle(chapeau);
        grandeEchoppe.ajouterArticle(boule);
        
        // Vérification du contenu de l'inventaire
        List<Article> inventaire = grandeEchoppe.getInventaire();
        assertEquals("L'inventaire devrait contenir 3 articles", 3, inventaire.size());
        assertTrue("L'inventaire devrait contenir la potion", inventaire.contains(potion));
        assertTrue("L'inventaire devrait contenir le chapeau", inventaire.contains(chapeau));
        assertTrue("L'inventaire devrait contenir la boule", inventaire.contains(boule));
        
        // Vérification de la valeur de l'inventaire
        double valeurAttendue = potion.getPrix() + chapeau.getPrix() + boule.getPrix();
        assertEquals("La valeur de l'inventaire devrait être la somme des prix", 
                    valeurAttendue, grandeEchoppe.evaluerInventaire(), 0.001);
    }


}
