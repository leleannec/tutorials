package nc.agilesoft.formation.intellij.exercice5;

import nc.agilesoft.formation.intellij.exercice5.solution.Agent;

import java.time.LocalDate;

public class AgentSecret extends Agent {

    private String variableInutile = "ne sert à rien";  // ALT+ENTREE : remove field pour supprimer

    public AgentSecret(String nom, String prenom, LocalDate dateNaissance, String inutile) {  // ALT+ENTREE sur inutile > Safe delete
        super(nom, prenom, dateNaissance);
    }

    public long x(boolean biss) {
        return 24 * 3600 * (biss ? 366 : 365);
    }
}
