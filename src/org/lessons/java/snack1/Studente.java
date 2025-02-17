package org.lessons.java.snack1;

public class Studente {
    // attributi
    private String nome;
    private String cognome;
    private int età;
    
    public Studente(String nome, String cognome, int età){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    // metodi
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return this.età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public String getStudente() {
        return String.format("%s %s, %d", this.nome, this.cognome, this.età);
    }


}
