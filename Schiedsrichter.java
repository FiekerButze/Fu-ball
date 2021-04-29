/**
 * Beschreiben Sie hier die Klasse Schiedsrichter.
 * 
 * Leon
 * 0.1
 */
public class Schiedsrichter
{
    Karte gelbeKarte = new Karte("Gelb");
    Karte roteKarte = new Karte("Rot");
    Muenze münze = new Muenze();
    Pfeife pfeife = new Pfeife();
    
    public Schiedsrichter(){
        System.out.print ('\f');
        System.out.println(muenzenWurf());
        pfeifen();
        nameAufschreiben("testRot", "rot");
        nameAufschreiben("testGelb", "gelb");
        karteZeigen("rot");
        karteZeigen("gelb");
    }
    public String muenzenWurf(){
        String seite = münze.muenzeWerfen();
        System.out.println(seite + "!");
        if(seite == "Kopf"){
            return "Das Blaue Team darf sich die Seite aussuchen! Das Rote hat Anstoß!";
        }
        return "Das Rote Team darf sich die Seite aussuchen! Das Blaue hat Anstoß!";
    }
       public void pfeifen(){
            pfeife.pfeifen();
    }
    public void karteZeigen(String farbe){
        if(farbe == "gelb"){
            gelbeKarte.gibAlleNamenAus();
        }else if(farbe == "rot"){
            roteKarte.gibAlleNamenAus();
        }
    }
    public void nameAufschreiben(String name, String farbe){
        if(farbe == "gelb"){
            gelbeKarte.neuerName(name);
        }else if(farbe == "rot"){
            roteKarte.neuerName(name);
        }
    }
}
