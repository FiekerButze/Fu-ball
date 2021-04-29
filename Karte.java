/**
 * Beschreiben Sie hier die Klasse Karte.
 * 
 * Leon
 * 0.1
 */
public class Karte
{
    String farbe;
    int namenAnzahl;
    String[] namen = new String[22];
    
    public Karte(String farbe){
        this.farbe = farbe;
    }
    public void neuerName(String name){
        int merke = 0;
        for(int i=0; i < namen.length;i++){
            if(namen[i] == null){
                merke = i;
            }
        }
        namen[merke] = name;
    }
    public String gibName(int position){
        return namen[position];
    }
    public void gibAlleNamenAus(){
        System.out.println(farbe + "e Karte: ");
        for(int i=0; i < namen.length;i++){
            if(namen[i] != null){
                System.out.println(namen[i]);
            }
        }
    }
    public int gibNamenAnzahl(){
        int zaehler = 0;
        for(int i=0; i < namen.length;i++){
            if(namen[i] != null){
                zaehler++;
            }
        }
        return zaehler;
    }
    public String[] gibNamenAlle(){
        return namen;
    }
}
