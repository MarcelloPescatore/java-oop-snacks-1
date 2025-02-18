package org.lessons.java.snack3;

import org.lessons.java.snack1.Studente;

public class RegistroStudenti {
    private Studente[] registro;

    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    // metodi
    public Studente[] getRegistro() {
        return this.registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    public void addStudente(Studente studente){
        Studente[] nuovoRegistro = new Studente[this.registro.length + 1];

        for(int i=0; i < this.registro.length; i++){
            nuovoRegistro[i] = this.registro[i];
        }

        nuovoRegistro[nuovoRegistro.length - 1] = studente;

        this.registro = nuovoRegistro;
    }

    public String toString(){
        String output = "Registro studenti: ";
        for (Studente studente : this.registro){
            output +=String.format("%s; ", studente.getStudente());
        }
        return output;
    }
}
