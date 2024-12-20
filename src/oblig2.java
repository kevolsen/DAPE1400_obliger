// Oblig 2

// Klasse for å representere omgivelsene
class Verden {
    boolean regner;
    int dag; // 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...

    // endre metoden for å returnere true hvis det er søndag (hint: Modulo %)
    public boolean erSondag() {
        return dag % 7 ==0;
    }
}

class Robot {
    String navn;
    double batteriNivaa;
    int avstadTilParken;
    String botType;

    public Robot(String navn, double batteriNivaa, int avstadTilParken, String botType) {
        this.navn = navn;
        this.batteriNivaa = batteriNivaa;
        this.avstadTilParken = avstadTilParken;
        this.botType = botType;
    }

    // gi robotten 4 attributter: navn, batteriNivaa, avstandTilParken og botType

    // ENdre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
    // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
    // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
    public String giStatus() {
        return "Dette er bot " + navn + " av type " + botType + ". Denne enheten har " + batteriNivaa +
                " batterikapasitet igjen og bor " + avstadTilParken + " meter fra parken.";
    }

    // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene
    public boolean gaaTilParken(Verden verden) {
        System.out.println();
        System.out.println("Sjekker om "+navn+" kan gå til parken...");

        // Sjekk om det regner
        if (verden.regner) {
            System.out.println(navn + " kan ikke gå til parken når det regner.");
            return false;
        }

        // Sjekk om det er søndag. Kan bare gå i parken på søndager.
        else if (!verden.erSondag()) {
            System.out.println(navn + " kan bare gå til parken på søndag.");
            return false;
        }

        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.
        else if (batteriNivaa < ((double) avstadTilParken / 100)) {
            System.out.println(navn + "har for lite strøm for å gå til parken.");
            return false;
        }
        return true;
    }

    // lag en metode som sjekker om boten kan være med på danseklubben
    // bottypen må være av type B-Bot (hint .equals)
    // En bot trenger minimum 50% batterikapasitet for å være med
    // Det kan ikke være mandag. Da er danseklubben stengt.

    public boolean bliMedTilKlubben(Verden verden) {
        System.out.println("Sjekker om "+navn+" kan bli med til danseklubben...");

        if (!botType.equals("B-bot")) {
            System.out.println(navn + " kan ikke bli med til danseklubben, da den er av feil type.");
            return false;
        }

        if (batteriNivaa < 50.0) {
            System.out.println(navn + " kan ikke bli med til danseklubben, pga. for lavt batterinivå.");
            return false;
        }

        if (verden.dag == 1) {
            System.out.println("Danseklubben er stengt på mandager.");
            return false;
        }

        return true;
    }
}

public class oblig2 {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        Verden dagensVerden = new Verden();
        dagensVerden.regner = false;
        dagensVerden.dag = 122;

        // Oppretter to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        Robot robotA = new Robot("Dancatron 4000",50,1000,"B-bot");
        Robot robotB = new Robot("Spark-E",40,25000,"Toaster");

        // Sjekker om robotene kan gå til danseklubben
        // Sjekker om robotene kan gå til parken

        System.out.println(robotA.gaaTilParken(dagensVerden));
        System.out.println(robotA.bliMedTilKlubben(dagensVerden));

        System.out.println(robotB.gaaTilParken(dagensVerden));
        System.out.println(robotB.bliMedTilKlubben(dagensVerden));
    }
}