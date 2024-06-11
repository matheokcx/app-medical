import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
* @Author Deleplanque Matheo
* Cette classe est la classe de test de la classe Medecin
* */
public class MedecinTest {


    Medecin medecinTest = new Medecin("1", "Dr. Smith", "Cardiologist", LocalDate.of(1990, 1, 1), "cardiologue");
    Patient patient1 = new Patient("1", "John", "Doe", LocalDate.of(1990, 1, 1));
    Patient patient2 = new Patient("2", "Jane", "Doe", LocalDate.of(1985, 5, 15));


    @Test
    public void testAjouterPatient() {
        medecinTest.ajouterPatient(patient1);
        assertTrue(medecinTest.getPatients().contains(patient1));
    }

    @Test
    public void testSupprimerPatient() {
        medecinTest.ajouterPatient(patient1);
        medecinTest.supprimerPatient(patient1);
        assertFalse(medecinTest.getPatients().contains(patient1));
    }

    @Test
    public void testRechercheParNom() {
        List<Medecin> result = medecinTest.rechercheParNom("Dr. Smith");
        assertTrue(result.contains(medecinTest));
    }

    @Test
    public void testRechercheParSpecialisation() {
        List<Medecin> result = medecinTest.rechercheParSpecialisation("Cardiologist");
        assertTrue(result.contains(medecinTest));
    }

    @Test
    public void testRechercheGenerale() {
        List<Medecin> result = medecinTest.rechercheGenerale("Smith");
        assertTrue(result.contains(medecinTest));
    }

    @Test
    public void testFiltrerParDate() {
        List<Medecin> result = medecinTest.filtrerParDate(LocalDate.now());
        assertNotNull(result);
    }

    @Test
    public void testTrierParNom() {
        List<Medecin> result = medecinTest.trierParNom(true);
        assertNotNull(result);
    }

    @Test
    public void testToString() {
        String expected = "Medecin{nom='Dr. Smith', specialisation='Cardiologist', patients=[]}";
        assertEquals(expected, medecinTest.toString());
    }
}
