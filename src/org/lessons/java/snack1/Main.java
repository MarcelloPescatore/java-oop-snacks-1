package org.lessons.java.snack1;

import org.lessons.java.snack3.RegistroStudenti;

public class Main {
    public static void main(String[] args) {
        Studente marcello = new Studente("Marcello", "Pescatore", 26);

        System.out.println(marcello.getStudente());

        RegistroStudenti registro = new RegistroStudenti();

        Studente s1 = new Studente("Mario", "Rossi", 33);
        Studente s2 = new Studente("Anna", "Bianchi", 19);

        registro.addStudente(s1);
        registro.addStudente(marcello);
        registro.addStudente(s2);

        System.out.println(registro);
    }
}
