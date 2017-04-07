package MIAGE;

import MIAGE.Enseignant;

public class Etudiant
{
    // instance variables - replace the example below with your own
    private int noteMemoire;
    private String nom, prenom;
    private Enseignant tuteur;
    
    /**
     * Constructor for objects of class Etudiant
     */
    public Etudiant(String nom, String prenom)
    {
        // initialise instance variables
       this.nom = nom;
       this.prenom = prenom;
       this.noteMemoire = 0;
       this.tuteur = null;
       
    }
    
    public void setTuteur(Enseignant e){
    this.tuteur = e;
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
    
     public void setNote(int note){
         this.noteMemoire = note;
    }
    
    public int getNote(){
        return this.noteMemoire;
    }
    
    public boolean valideMemoire(){
    	
    	if (noteMemoire > 10){
    		return true;
    	}else
    	{
    		return false;
    	}
    }
    
}
