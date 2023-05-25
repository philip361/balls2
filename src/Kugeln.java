import GLOOP.*;
public class Kugeln {
    private GLKugel kugel;
    private Spieler spieler ;
    private Spielfeld spielfeld;
    private Spieler Box;
    private Spielfeld feld;

    private double radius;

    private double xSpeed,zSpeed;

    public Kugeln(Spieler spieler,Spielfeld spielfeld) {
        kugel = new GLKugel(-750 + Math.random() * 1500, 20, -750 + Math.random() * 1500, 25);
        kugel.setzeTextur("src/img/kugeltextur.jpg");
        kugel.setzeDrehung(90,0,180);
        this.spieler = spieler;
        this.spielfeld = spielfeld;
        xSpeed = Math.random()*2-1;
        zSpeed = Math.random()*2-1;
    }


    public void bewege() {
        if (kugel.gibX()<=spielfeld.wand4.gibX()) {
         xSpeed = xSpeed * -1;
        }
        if (kugel.gibX()>=spielfeld.wand3.gibX()) {
            xSpeed = xSpeed * -1;
        }
        if (kugel.gibZ()>=spielfeld.wand2.gibZ()) {
            zSpeed = zSpeed * -1;
        }
        if (kugel.gibZ()<=spielfeld.wand1.gibZ()) {
            zSpeed = zSpeed * -1;
        }

         kugel.verschiebe( xSpeed, 0,  zSpeed);


        if(getroffen()){

            kugel.verschiebe(1000000,10000001,100000);
            spieler.vergroessern();
        }

    }

    public boolean getroffen() {
        double abstand = Math.sqrt(Math.pow(kugel.gibX() - spieler.gibX(), 2)
                + Math.pow(kugel.gibZ() - spieler.gibZ(), 2));
        if (abstand < spieler.Radius+spieler.skala) {
            spieler.Punkte= spieler.Punkte +1;
            spielfeld.tafel.setzeText(String.valueOf(spieler.Punkte),250);
            return true;
        } else {
            return false;
        }


    }}