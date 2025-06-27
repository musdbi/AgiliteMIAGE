import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de test pour le storytelling "Nations Enchantées"
 * Compatible avec BlueJ et JUnit 4
 */
public class TestNationsEnchantees {
    
    private President macron;
    private Pays france;
    private Boutique echoppe;
    private Article baguette;
    private Article grimoire;
    
    @Before
    public void setUp() {
        macron = new President("Emmanuel Macron", 5);
        france = new Pays("France", 67000000, macron);
        echoppe = new Boutique("L'Échoppe Enchantée", 500.0);
        baguette = new Article("Baguette Magique de Marianne", 150.0);
        grimoire = new Article("Grimoire de la République", 200.0);
    }
    
    @After
    public void tearDown() {
        macron = null;
        france = null;
        echoppe = null;
        baguette = null;
        grimoire = null;
    }
    
    @Test
    public void testCreationRoyaume() {
        assertEquals("France", france.getName());
        assertEquals(67000000, france.getPopulation());
        assertEquals("Emmanuel Macron", france.getPresident().getName());
        assertEquals(5, france.getPresident().getMandateLength());
    }
    
    @Test
    public void testBoutiqueAppartientPays() {
        france.ajouterBoutique(echoppe);
        
        assertEquals(france, echoppe.getPaysOrigine());
        assertTrue(france.getDescription().contains("1 boutiques"));
    }
    
    @Test
    public void testArticlesForgesAuRoyaume() {
        france.ajouterBoutique(echoppe);
        echoppe.ajouterArticle(baguette);
        echoppe.ajouterArticle(grimoire);
        
        String descriptionBaguette = baguette.getDescription();
        assertTrue(descriptionBaguette.contains("Forgé au France"));
        assertTrue(descriptionBaguette.contains("sous le mandat de Emmanuel Macron"));
        
        String descriptionGrimoire = grimoire.getDescription();
        assertTrue(descriptionGrimoire.contains("Forgé au France"));
        assertTrue(descriptionGrimoire.contains("sous le mandat de Emmanuel Macron"));
    }
    
    @Test
    public void testValeurTotaleRoyaume() {
        france.ajouterBoutique(echoppe);
        echoppe.ajouterArticle(baguette);
        echoppe.ajouterArticle(grimoire);
        
        double valeurBoutique = 500.0 + 150.0 + 200.0;
        assertEquals(valeurBoutique, echoppe.getValeurTotale(), 0.01);
        
        assertEquals(valeurBoutique, france.getValeurTotale(), 0.01);
    }
    
    @Test
    public void testTransactionMagique() {
        france.ajouterBoutique(echoppe);
        echoppe.ajouterArticle(baguette);
        
        double valeurInitiale = france.getValeurTotale();
        
        echoppe.realiserTransac(150.0);
        
        double valeurApresTransaction = france.getValeurTotale();
        assertEquals(valeurInitiale + 150.0, valeurApresTransaction, 0.01);
    }
    
    @Test
    public void testRelationBidirectionnelleBoutiqueArticle() {
        france.ajouterBoutique(echoppe);
        echoppe.ajouterArticle(baguette);
        
        assertEquals(echoppe, baguette.getBoutique());
        
        assertTrue(echoppe.contientArticle(baguette));
        assertTrue(baguette.dansBoutique(echoppe));
    }
    
    @Test
    public void testDetailsPaysPolitiques() {
        String details = france.getCountryDetail();
        
        assertTrue(details.contains("Le président de France est Emmanuel Macron"));
        assertTrue(details.contains("avec un mandat de 5 ans"));
    }
    
    @Test
    public void testPlusieursRoyaumes() {
        President biden = new President("Joe Biden", 4);
        Pays usa = new Pays("USA", 330000000, biden);
        Boutique shopUSA = new Boutique("Magical USA Shop", 800.0);
        
        france.ajouterBoutique(echoppe);
        usa.ajouterBoutique(shopUSA);
        
        assertNotEquals(france.getValeurTotale(), usa.getValeurTotale());
        
        assertNotEquals(france.getDescription(), usa.getDescription());
    }
    
    @Test
    public void testCoherenceEconomiqueRoyaume() {
        france.ajouterBoutique(echoppe);
        echoppe.ajouterArticle(baguette);
        echoppe.ajouterArticle(grimoire);
        
        assertTrue(france.getValeurTotale() > 0);
        assertTrue(echoppe.getValeurTotale() > 0);
        
        echoppe.realiserTransac(100.0);
        
        for (Article article : echoppe.getInventaire()) {
            assertTrue(article.getDescription().contains(macron.getName()));
        }
    }
}