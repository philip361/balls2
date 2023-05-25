import GLOOP.*;
public class game {
    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private GLQuader quader;

    private Spieler spieler;
    private Kugeln[] kugel;

    public game() {
        kamera = new GLKamera();
        kamera.setzePosition(0, 1500, 1500);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();


        //Box



        Spielfeld spielfeld = new Spielfeld();


        kugel = new Kugeln[361];
        spieler = new Spieler();
        for (int i = 0; i < kugel.length; i++) {
            kugel[i] = new Kugeln(spieler,spielfeld);
        }

      bewege();

    }


    public void bewege()
    {
            while (!tastatur.esc()) {

                if (tastatur.links()) {
                    spieler.bewegeLinks();
                }
                if (tastatur.rechts()) {
                    spieler.bewegeRechts();
                }
                if (tastatur.oben()) {
                    spieler.bewegeOben();
                }
                if (tastatur.unten()) {
                    spieler.bewegeUnten();
                }

                for (int i = 0; i < kugel.length; i++) {
                    kugel[i].bewege();
                }

                Sys.warte();
            }

        }
        }








