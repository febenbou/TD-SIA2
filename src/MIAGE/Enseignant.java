package MIAGE;

import MIAGE.Etudiant;

public class Enseignant
{
    // instance variables - replace the example below with your own
    private String nom, prenom;

    /**
     * Constructor for objects of class Etudiant
     */
    public Enseignant(String nom, String prenom)
    {
        // initialise instance variables
       this.nom = nom;
       this.prenom = prenom;
    }

    public String getNom(){
        return this.nom;
    }
    
      public void setNom(String nom){
        this.nom = nom ;
    }
    
      public String getPrenom(){
        return this.prenom;
    }
    
      public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
      public void setNoteEtudiant(Etudiant e,int note){
        e.setNote(note);
    }
    
}

