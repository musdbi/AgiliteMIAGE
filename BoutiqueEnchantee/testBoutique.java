

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test boutiqueTest.
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
public class testBoutique
{
    @Test
    public void testConstructeurEtGetters() {
        Boutique b = new Boutique("Boutique A", 5000.0);
        assertEquals("Boutique A", b.getNom());
        assertEquals(5000.0, b.getChiffresAffaires(), 0.0001);
    }

    @Test
    public void testSetNom() {
        Boutique b = new Boutique("Ancien Nom", 1000.0);
        b.setNom("Nouveau Nom");
        assertEquals("Nouveau Nom", b.getNom());
    }

    @Test
    public void testSetChiffresAffaires() {
        Boutique b = new Boutique("Boutique B", 2000.0);
        b.setChiffresAffaires(3000.0);
        assertEquals(3000.0, b.getChiffresAffaires(), 0.0001);
    }

    @Test
    public void testRealiserTransac() {
        Boutique b = new Boutique("Boutique C", 4000.0);
        b.realiserTransac(500.0);
        assertEquals(4500.0, b.getChiffresAffaires(), 0.0001);
    }

    @Test
    public void testRealiserRemboursement() {
        Boutique b = new Boutique("Boutique D", 10000.0);
        b.realiserTransac(-1000.0);
        assertEquals(9000.0, b.getChiffresAffaires(), 0.0001);
    }
    
    @Test
    public void testDansBoutique() {
        Boutique b = new Boutique("Boutique G", 8000.0);
        Article a = new Article("Produit C", 199.99);
        
        b.ajouterArticle(a);
        a.setBoutique(b);

        assertTrue(a.dansBoutique(b));
}
}
