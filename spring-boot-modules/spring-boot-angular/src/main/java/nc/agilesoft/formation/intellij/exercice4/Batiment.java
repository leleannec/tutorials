package nc.agilesoft.formation.intellij.exercice4;

import java.time.LocalDate;
import java.util.Objects;

public class Batiment {

    private String nom;
    private String description;
    private LocalDate dateConstruction;

    public static final int C1 = 1;
    public static final String C2 = "2";

    public static void main(String[] args) {
        System.out.println("Hello world 1");
        System.out.println("Hello world 2");
        System.out.println("Hello world 3");
        System.out.println("Hello world 4");
        System.out.println("Hello world 123");
        System.out.println("Hello world ah ok! / Bonjour Ah ok!");
    }

    /**
     * @param nom
     * @param description
     * @param dateConstruction
     */
    public Batiment(String nom, String description, LocalDate dateConstruction) {
        this.nom = nom;
        this.description = description;
        this.dateConstruction = dateConstruction;
    }

    // @formatter:off
    @Override
    public String toString() {
        return "Personne{" +
                "  nom='" + nom + '\'' +
                ", prenom='" + description + '\'' +
                ", dateNaissance=" + dateConstruction +
                '}';
    }
    // @formatter:on

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batiment personne = (Batiment) o;
        return Objects.equals(nom, personne.nom) && Objects.equals(description, personne.description) && Objects.equals(dateConstruction, personne.dateConstruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, description, dateConstruction);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateConstruction() {
        return dateConstruction;
    }

    public void setDateConstruction(LocalDate dateConstruction) {
        this.dateConstruction = dateConstruction;
    }
}
