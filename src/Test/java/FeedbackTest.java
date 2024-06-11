package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.projet.Feedback;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FeedbackTest {

    private Feedback feedback;

    @BeforeEach
    public void setUp() {
        feedback = new Feedback("1", "patient123", "medecin456", LocalDate.of(2023, 6, 10), "Très bon service", 5);
    }

    @Test
    public void testGetId() {
        assertEquals("1", feedback.getId());
    }

    @Test
    public void testGetPatientId() {
        assertEquals("patient123", feedback.getPatientId());
    }

    @Test
    public void testGetMedecinId() {
        assertEquals("medecin456", feedback.getMedecinId());
    }

    @Test
    public void testGetDateConsultation() {
        assertEquals(LocalDate.of(2023, 6, 10), feedback.getDateConsultation());
    }

    @Test
    public void testGetCommentaire() {
        assertEquals("Très bon service", feedback.getCommentaire());
    }

    @Test
    public void testMettreAJourCommentaire() {
        feedback.mettreAJourCommentaire("Service médiocre");
        assertEquals("Service médiocre", feedback.getCommentaire());
    }

    @Test
    public void testGetNote() {
        assertEquals(5, feedback.getNote());
    }

    @Test
    public void testAjouterNote() {
        feedback.ajouterNote(3);
        assertEquals(3, feedback.getNote());
    }

    @Test
    public void testToString() {
        String expected = "Feedback{id='1', patientId='patient123', medecinId='medecin456', dateConsultation=2023-06-10, commentaire='Très bon service', note=5}";
        assertEquals(expected, feedback.toString());
    }

    @Test
    public void testConstructeurNonNull() {
        assertNotNull(feedback);
    }
}

