package nc.agilesoft.formation.intellij.exercice5.solution;

import nc.agilesoft.formation.intellij.exercice5.Personne;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonneTest {

    private Personne personne;

    @BeforeEach
    void setUp() {
        personne = new Personne("NOM", "Jean", LocalDate.of(2000, 1, 1));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void calculateAgeADate() {
        int age = personne.calculateAgeADate(LocalDate.of(2001, 1, 1));
        assertThat(age).isEqualTo(1);
    }

    @Test
    public void calculateAgeADate21() {
        int age = personne.calculateAgeADate(LocalDate.of(2021, 12, 31));
        assertThat(age).isEqualTo(21);
    }

    @Test
    public void calculateAgeKo() {
        int age = personne.calculateAgeADate(LocalDate.of(2021, 12, 31));
        assertThat(age).isEqualTo(100);
    }
}
