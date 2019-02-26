/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparazione.alla.verifica;

/**
 *
 * @author redaelli_mattia
 */
public class Ricevimento {

    private String ID;
    private String nome;
    private String giorno;
    private String ora;
    private String Note;
    
    
    public Ricevimento()
    {
        
            ID="";
         nome="";
         giorno="";
         ora="";
         Note=""; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    
}
