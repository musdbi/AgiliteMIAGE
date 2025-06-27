
/**
 * Décrivez votre classe President ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class President
{
    private String name;
    private int mandateLength;
    
    public President(String name, int mandateLength) {
        this.name = name;
        this.mandateLength = mandateLength;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getMandateLength() { return mandateLength; }
    public void setMandateLength(int mandateLength) { this.mandateLength = mandateLength; }
}
