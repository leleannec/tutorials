package nc.agilesoft.formation.intellij.exercice5;

import nc.agilesoft.formation.intellij.exercice5.solution.batiment.Construction;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;


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
        System.out.println("Bonjour world 1 ...!");
        System.out.println("Bonjour world 2 ...!");
        System.out.println("Bonjour world 3 ...!");
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Construction getBatiment() {
        return construction;
    }

    public void setBatiment(Construction construction) {
        this.construction = construction;
    }

//    public void methodeInvalide() {
//        int chaine="aa";  // ALT+ENTREE pour voir des suggestions  (change variable type to String)
//        System.out.print("code pas bon"   // utiliser SHIFT+CTRL+ENTREE après le second " pour compléter le code
//        Batiment batiment = new Batiment();  // ALT+ENTREE, choisir create constructor
//        batiment.methodePrivee(); // ALT+ENTREE, make method public
//    }

    /**
     * @param date Date à laquelle on se positionne (pas forcément aujourd'hui)
     * @return nombre d'années de la personne
     */
    public int calculateAgeADate(LocalDate date) {
        Period period = Period.between(this.dateNaissance, date);
        return period.getYears();
    }

}
