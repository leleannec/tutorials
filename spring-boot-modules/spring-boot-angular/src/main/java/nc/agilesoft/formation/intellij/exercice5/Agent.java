package nc.agilesoft.formation.intellij.exercice5;

import java.time.LocalDate;

public class Agent extends Personne {
    public Agent(String nom, String prenom, LocalDate dateNaissance) {
        super(nom, prenom, dateNaissance);
    }

    public int calculConges() {
        int result = 25;
        return result;
    }
}
