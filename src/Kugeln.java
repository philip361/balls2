import GLOOP.*;
public class Kugeln {
    private GLZylinder kugel;
    private Spieler Box;
    private Spielfeld feld;
    private double radius;


    public Kugeln() {
        kugel = new GLZylinder(-750 + Math.random() * 1500, 20, -750 + Math.random() * 1500, 25,1);
        kugel.setzeTextur("src/img/kugeltextur.jpg");
        kugel.setzeDrehung(90,0,180);

    }


    public void bewege(double speed) {
        kugel.verschiebe(-5  * speed, 0, -5  * speed);


    }

    public void abprallen(){

     // if(); kugel.gibX > feld.breite


    }




    public double gibX() {
        return kugel.gibX();
    }

    public double gibY() {
        return kugel.gibY();
    }

    public double gibZ() {
        return kugel.gibZ();
    }
}