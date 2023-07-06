package nc.agilesoft.formation.intellij.exercice5.solution.rh;

import lombok.Getter;
import lombok.Setter;
import nc.agilesoft.formation.intellij.exercice5.solution.batiment.Construction;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

@Getter
@Setter
public class Personne {

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private Construction construction;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public static void main(String[] args) {
        bonjourWorld("1");
        System.out.println("Bonjour world 2 ...!");
        System.out.println("Bonjour world 3 ...!");
    }

    private static void bonjourWorld(String numero) {
        System.out.println("Bonjour world " + numero + " ...!");
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(dateNaissance, personne.dateNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, dateNaissance);
    }

    /**
     * @param date Date à laquelle on se positionne (pas forcément aujourd'hui)
     * @return nombre d'années de la personne
     */
    public int calculateAgeADate(LocalDate date) {
        Period period = Period.between(this.dateNaissance, date);
        return period.getYears();
    }
}
