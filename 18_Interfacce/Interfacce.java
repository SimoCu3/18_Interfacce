/*
CONSEGNA:
Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
*/

public class Interfacce {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5,10);
        Triangolo triangolo = new Triangolo(5,10);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();

        //System.out.println(rettangolo);
        //System.out.println(triangolo);
    }
}

/*
CORREZIONE:

*/