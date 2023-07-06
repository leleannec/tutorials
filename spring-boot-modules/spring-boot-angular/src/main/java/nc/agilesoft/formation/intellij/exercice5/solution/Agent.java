package nc.agilesoft.formation.intellij.exercice5.solution;

import nc.agilesoft.formation.intellij.exercice5.solution.rh.Personne;

import java.time.LocalDate;

public class Agent extends Personne {
    public Agent(String nom, String prenom, LocalDate dateNaissance) {
        super(nom, prenom, dateNaissance);
    }
}
