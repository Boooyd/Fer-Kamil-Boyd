package Opdracht_S;

public class Triangle extends Shape {
    public Triangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
 
    }

    @Override

    public void fill() {
    	
   /* int breedte = SIZEX; //breedte
       int hoogte = SIZEY;
       final String KRUISJE = "*";
       final String SPATIE  = " ";

       String  tekenReeks;
       boolean breedteIsEven;
       int     aantalKruisjesMidden;// 1 bij oneven breedte, 2 bij even breedte
       double  aantalKruisjesErbij; // het aantal kruisjes per regel erbij is een double
       double  toenameAlsDouble;    // de 'ruwe' toename voor elke regel is ook een double
       int     toenameAlsInt;       // dit moet een EVEN getal worden!
       int     aantalKruisjes;
       int     aantalSpaties;

       breedteIsEven = breedte % 2 == 0;

       if (breedteIsEven) {
           aantalKruisjesMidden = 2;
       } else {
           aantalKruisjesMidden = 1;
       }

       aantalKruisjesErbij = (double) (breedte - aantalKruisjesMidden) / (hoogte - 1);

       for (int regelNummer = 1; regelNummer <= hoogte; regelNummer++){
           tekenReeks = SPATIE;

           toenameAlsDouble = (regelNummer - 1) * aantalKruisjesErbij;

           toenameAlsInt = 2 * (int) (toenameAlsDouble / 2);
           aantalKruisjes = aantalKruisjesMidden + toenameAlsInt;

           // bereken nu het aantal spaties
           aantalSpaties = (breedte - aantalKruisjes) / 2;
           for (int teller = 1; teller <= aantalSpaties; teller++) {
               tekenReeks =  SPATIE + tekenReeks;
           }

           for (int teller = 1; teller <= aantalKruisjes; teller++) {
               tekenReeks =  tekenReeks + KRUISJE;
           }

           System.out.println(tekenReeks);
           
       }
    }
}*/


        
        // xPixel verhogen dan haalt die de bovenkant eraf
       for(int xPixel = 1 ; xPixel <= SIZEY; xPixel++) 
        {
            for (int yPixel = xPixel ; yPixel <= SIZEY; yPixel++) // spaties?
            	 System.out.print(" ");
            
            // als je van de (xPixel*2) de 2 verandert in 1 dan verwijdert die de helft van de piramide
            for (int k = 1 ; k < (xPixel*2); k++) //Sterren?
                System.out.print("*");
            System.out.print("\n");
        }
    }
}

