/**
 * Beschreiben Sie hier die Klasse Pfeife.
 * 
 * Leon
 * 0.1
 */
import java.util.Random;
public class Muenze
{
    Random wuerfel = new Random();
    int augenZahl;
    
    public Muenze(){
        
    }
    public String muenzeWerfen(){
        if(muenzenSeite() == 0)
        {
            return "Kopf";
        }
        return "Zahl";
    }
    public int muenzenSeite(){
        augenZahl = wuerfel.nextInt(2);
        return augenZahl;
    }
}
