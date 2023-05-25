import GLOOP.*;
public class Spieler {
    private GLZylinder spieler;
    private Spielfeld feld;
    private GLTastatur tastatur;

    public int Punkte = 0;
    public double Radius = 100;


    public double skala =1;



    public void vergroessern(){
        skala = skala +0.0001;
        spieler.skaliere(skala,skala,skala);
    }






    public Spieler() {
        spieler = new GLZylinder(0, 20, 0, 100, 40, "src/img/Ufo362.jpg");
        spieler.drehe(90, 0, 0);



    }




    public void bewegeLinks() {
        spieler.verschiebe(-1.5, 0, 0);
    }

    public void bewegeRechts() {
        spieler.verschiebe(1.5, 0, 0);
    }

    public void bewegeOben() {
        spieler.verschiebe(0, 0, -1.5);
    }

    public void bewegeUnten() {
        spieler.verschiebe(0, 0, 1.5);
    }



    public double gibX()  {return spieler.gibX();}

    public double gibY(){
        return spieler.gibY();
    }

    public double gibZ() {
        return spieler.gibZ();
    }





}



