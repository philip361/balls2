import GLOOP.*;
public class Spielfeld {
    private GLQuader untergrund;

    public GLTafel tafel;
    private double breite, tiefe;

    public GLQuader wand1, wand2, wand3, wand4;

    public Spielfeld() {
        tafel = new GLTafel(-1000,400,-1000,500,300);
        untergrund = new GLQuader(0, 0, 0, 2500, 2000, 2500);
        untergrund.setzeTextur("src/img/Ufo362.jpg");
        untergrund.verschiebe(0, -990, 0);

        //vorne
        wand1 = new GLQuader(0, 0, 1225, 2500, 200, 50);
        wand1.setzeTextur("src/img/Marmor.jpg");


        //hinten
        wand2 = new GLQuader(0, 0, -1225, 2500, 200, 50);
        wand2.setzeTextur("src/img/Marmor.jpg");


        //rechts
        wand3 = new GLQuader(1225, 0, 0, 2500, 200, 50);
        wand3.drehe(0, 90, 0);
        wand3.setzeTextur("src/img/Marmor.jpg");


        //links
        wand4 = new GLQuader(-1225, 0, 0, 2500, 200, 50);
        wand4.drehe(0, 90, 0);
        wand4.setzeTextur("src/img/Marmor.jpg");

    }
}
