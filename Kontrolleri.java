package simulaattori;

import javax.swing.JOptionPane;
import simulaattori.View.*;

public class Kontrolleri {

    Sauna Sauna = new Sauna();
    Laskuri Laskuri = new Laskuri();
    Laituri Laituri = new Laituri();
    Simulaattori Simu = new Simulaattori();
    View view = new View();

    double luku;

    public void Promillet() {
        luku = Laskuri.getPromillet();

    }

    public double getPromillet() {
        return Laskuri.getPromillet();
    }

    public int getValinnat() {
        return Laskuri.getValinnat();
    }

    public void Menesaunaan(String valinta) {

        if (Laskuri.getPromillet() > 2.5) {
            Laskuri.nollaaPromille(Laskuri.getPromillet());
        } else {
            switch (valinta) {
                case "1":

                    Laskuri.lisääPromille(Sauna.getSaunaPromillet());

                    break;

                case "2":
                    Laskuri.vähennäPromille(Laskuri.getPromillet());

                    break;

                default:

            }

        }
    }

    public void Laiturille(String valinta) {

        switch (valinta) {
            case "1":

                if (Laskuri.getPromillet() <= 0.3) {
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);
                } else if (Laskuri.getPromillet() < 1.0 && Laskuri.getPromillet() > 0.3) {
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);

                } else if (Laskuri.getPromillet() > 2.3) {
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);
                } else {
                    Laskuri.lisääPromille(Laituri.kalastusPromillet);
                }

                break;

            case "2":
                if (Laskuri.getPromillet() <= 0.3) {
                    Laskuri.lisääPromille(Laituri.veneilyPromillet);
                    Laskuri.lisääPromille(Laituri.veneilyPromillet);
                } else if (Laskuri.getPromillet() >= 2.5) {
                    Laskuri.vähennäPromille(Laituri.veneilyPromillet);
                    Laskuri.vähennäPromille(Laituri.veneilyPromillet);
                } else {
                    Laskuri.lisääPromille(Laituri.veneilyPromillet);
                }

                break;
            
            case "3":

                if (Laskuri.getPromillet() >= 4.5) {
                    Laskuri.lisääPromille(Laituri.uimisPromillet);
                    Laskuri.lisääPromille(Laituri.uimisPromillet);
                    Laskuri.lisääPromille(Laituri.uimisPromillet);
                } else {

                    Laskuri.vähennäPromille(Laituri.uimisPromillet);
                    Laskuri.vähennäPromille(Laituri.uimisPromillet);
                }
                break;
            default:
                
        }
    }
}
