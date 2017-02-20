package simulaattori;

import javax.swing.*;

public class Simulaattori {

    private static double Promillet;

    public static void main(String[] args) {

        Kontrolleri Kont = new Kontrolleri();

        String valinta;
       
        
        
        do {
            //lukuStr = JOptionPane.showInputDialog(View.menu);
            valinta = JOptionPane.showInputDialog(View.menu);
          
            //valinta = Integer.parseInt(lukuStr);
            switch (valinta) {

                //Ensimmäinen menu
                case "1":

                    JOptionPane.showMessageDialog(null, View.C1 + Kont.getPromillet() + View.C12);              //pelkkkä laskuri humalalle, jossa voi tarkastella humalan tilaa!
                    break;

                case "2":

                    if (Laskuri.getPromillet() > 2.5) {
                        JOptionPane.showMessageDialog(null, View.C2);
                        Kont.Menesaunaan(valinta);
                        // elsen sisällä saunamenu jossa voi valita eri saunojen väliltä
                    } else {
                        valinta = JOptionPane.showInputDialog(View.saunaMenu);              //Sauna alavalikko
                        Kont.Menesaunaan(valinta);
                        if ((Integer.parseInt(valinta) == 1)) {
                            JOptionPane.showMessageDialog(null, View.C21);

                        } else if ((Integer.parseInt(valinta) == 2)) {

                            JOptionPane.showMessageDialog(null, View.C22);
                        }
                    }
                    JOptionPane.showMessageDialog(null, View.C1 + Kont.getPromillet());
                    break;
                case "3":

                    valinta = JOptionPane.showInputDialog(null, View.laituriMenu);

                    if (Integer.parseInt(valinta) == 1) {                                           //jos laiturin alavalikon valinta on 1, niin...
                        if (Kont.getPromillet() <= 0.3 && Kont.getPromillet() >= 0.0) {
                            JOptionPane.showMessageDialog(null, View.C24);                          //eli siis KALASTUS!
                            //ajaa kontrollerissa valitun casen
                            Kont.Laiturille(valinta);

                        } else if (Kont.getPromillet() < 1.0 && Kont.getPromillet() > 0.3) {
                            JOptionPane.showMessageDialog(null, View.C23);
                            Kont.Laiturille(valinta);
                        } else if (Kont.getPromillet() > 2.3) {
                            JOptionPane.showMessageDialog(null, View.C25);
                            Kont.Laiturille(valinta);
                      } else {

                            JOptionPane.showMessageDialog(null, View.C26);
                            Kont.Laiturille(valinta);                                 // tapahtuu näin
                        }
                    }

                    if ((Integer.parseInt(valinta) == 2)) {                                         // jälleen alavalikko
                        JOptionPane.showMessageDialog(null, View.C27);
                        if (Kont.getPromillet() <= 0.3 && Kont.getPromillet() >= 0.0) {
                            JOptionPane.showMessageDialog(null, View.C28);                          // VENEILY
                            Kont.Laiturille(valinta);

                        } else if (Kont.getPromillet() > 2.5) {
                            valinta = JOptionPane.showInputDialog(null, View.C29);

                            if (Integer.parseInt(valinta) == 1) {
                                JOptionPane.showMessageDialog(null, View.C30);                        //VENEILY alavalikon alavalikko
                                Kont.Laiturille(valinta);                             //jos siis pelaajalla tarpeeksi promilleja
                            } else if (Integer.parseInt(valinta) == 2) {                                //valinnasta riippuu tippuuko pelaaaja veteen
                                JOptionPane.showMessageDialog(null, View.C32);
                                Kont.Laiturille(valinta);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, View.C31);
                            valinta = JOptionPane.showInputDialog(View.saunaMenu);                  //kun humala on sopiva, veneretki menee hyvin ja ohjelma laittaa pelaajan 
                            Kont.Menesaunaan(valinta);                            //saunomaan automaattisestiKont.Menesaunaan(Integer.parseInt(lukuStr));

                            if ((Integer.parseInt(valinta) == 1)) {
                                JOptionPane.showMessageDialog(null, View.C21);

                            } else if ((Integer.parseInt(valinta) == 2)) {

                                JOptionPane.showMessageDialog(null, View.C22);
                            }
                        }
                        
                    }
                    
                    if (Integer.parseInt(valinta) == 3) {
                        JOptionPane.showMessageDialog(null, View.C33);
                        if (Kont.getPromillet() >= 4.5) {
                            JOptionPane.showMessageDialog(null, View.C35);
                            Kont.Laiturille(valinta);
                        } else {
                            JOptionPane.showMessageDialog(null, View.C34);
                            Kont.Laiturille(valinta);
                        }
                    }

                    JOptionPane.showMessageDialog(null, View.C1 + Kont.getPromillet());

                    break;
                
                default: 
                    
            }

        } while (!valinta.equals("0"));

        if (Kont.getPromillet() >= 4.0) {
            JOptionPane.showMessageDialog(null, View.C36);
            
        } else if (Kont.getPromillet() == 0.0) {
            JOptionPane.showMessageDialog(null, View.C37);

        } else {
            JOptionPane.showMessageDialog(null, View.C38);
        }

    }

    public void setPromillet(double Prom) {
        this.Promillet = Prom;

    }

}
