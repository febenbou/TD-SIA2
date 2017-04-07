package MIAGE;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class classeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EtudianTest
{
    private Etudiant laurent;
    private Enseignant enseignantTuteur;

    

    /**
     * Default constructor for test class classeTest
     */
    public EtudianTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        laurent = new Etudiant("Mourer","laurent");
        enseignantTuteur = new Enseignant("Lhom","hillah");
        laurent.setTuteur(enseignantTuteur);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    

    @Test
    public void testGetPrenomEnseignant(){
    	assertEquals("hillah", enseignantTuteur.getPrenom());
    	assertNotEquals("Lhom", enseignantTuteur.getPrenom());
    }
    
    @Test
    public void testGetPrenomEtudiant(){
    	assertEquals("laurent", laurent.getPrenom());
    	assertNotEquals("sam", laurent.getPrenom());
    }
    
    @Test
    public void testGetNomEnseignant(){
    	assertEquals("Lhom", enseignantTuteur.getNom());
    	assertNotEquals("Peyre", enseignantTuteur.getNom());
    }
    
    @Test
    public void testGetNomEtudiant(){
    	assertEquals("Mourer", laurent.getNom());
    	assertNotEquals("maximus", laurent.getNom());
    }
    
    @Test
    public void testGetNoteEtudiant(){
    	assertEquals(0, laurent.getNote());
    	assertNotEquals(10, laurent.getNote());
    }

    
    
    
    @Test
    public void testSetNomEtudiant(){
    	laurent.setNom("anseame");
    	assertEquals("anseame", laurent.getNom());
    	assertNotEquals("mourer", laurent.getNom());
    }

    @Test
    public void testSetNomEnseignant(){
    	enseignantTuteur.setNom("peyre");
    	assertEquals("peyre", enseignantTuteur.getNom());
    	assertNotEquals("lhom", enseignantTuteur.getNom());
    }
    
    @Test
    public void testSetPrenomEtudiant(){
    	laurent.setPrenom("thomas");
    	assertEquals("thomas", laurent.getPrenom());
    	assertNotEquals("laurent", laurent.getPrenom());
    }
    
    @Test
    public void testSetPrenomEnseignant(){
    	enseignantTuteur.setPrenom("aonzo");
    	assertEquals("aonzo", enseignantTuteur.getPrenom());
    	assertNotEquals("millah", enseignantTuteur.getPrenom());
    }
    
    @Test
    public void testSetNoteEtudiant(){
    	laurent.setNote(14);
    	assertEquals(14, laurent.getNote());
    	assertNotEquals(18, laurent.getNote());
    }
    
    
    @Test
    public void etudiantConstructeurTest()
    {
        Etudiant etudiant1 = new Etudiant("Mourer","laurent");
        
        assertEquals("Mourer", etudiant1.getNom());
        assertEquals("laurent", etudiant1.getPrenom());
        assertNotEquals("ANSEAUME", etudiant1.getNom());
        assertNotEquals("maximus", etudiant1.getPrenom());
        		
        etudiant1.setNom("ANSEAUME");
        etudiant1.setPrenom("maximus");

        assertEquals("ANSEAUME", etudiant1.getNom());
        assertEquals("maximus", etudiant1.getPrenom());
        assertNotEquals("Mourer", etudiant1.getNom());
        assertNotEquals("laurent", etudiant1.getPrenom());
    }
    
    @Test
    public void noteTest()
    {
    	enseignantTuteur.setNoteEtudiant(laurent, 15);
        laurent.getNote();
        
        assertEquals(15, laurent.getNote());
        assertNotEquals(13, laurent.getNote());
    }
    
    
    @Test
    public void enseignantConstructeurTest()
    {
        Enseignant enseignant1 = new Enseignant("Lhom","millah");
        
        assertEquals("Lhom", enseignant1.getNom());
        assertEquals("millah", enseignant1.getPrenom());
        assertNotEquals("Pradat", enseignant1.getNom());
        assertNotEquals("jean", enseignant1.getPrenom());
        
        enseignant1.setNom("Pradat");
        enseignant1.setPrenom("jean");

        assertEquals("Pradat", enseignant1.getNom());
        assertEquals("jean", enseignant1.getPrenom());
        assertNotEquals("Lhom", enseignant1.getNom());
        assertNotEquals("millah", enseignant1.getNom());
    }
    
    @Test
    public void MemoireValidéTest()
    {
    	
    	laurent.setNote(15);
    	assertEquals(true, laurent.valideMemoire());     	
    	assertNotEquals(false, laurent.valideMemoire());
    	
    	laurent.setNote(5);
    	assertEquals(false, laurent.valideMemoire());
    	assertNotEquals(true, laurent.valideMemoire());
    	
    }

}
