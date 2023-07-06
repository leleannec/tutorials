package nc.agilesoft.formation.intellij.exercice5.solution;

import java.time.LocalDate;

public class AgentSecret extends Agent {

    public static final int NB_HEURE_PAR_JOUR = 24;
    public static final int NB_SECONDE_PAR_HEURE = 3600;

    public AgentSecret(String nom, String prenom, LocalDate dateNaissance) {
        super(nom, prenom, dateNaissance);
    }

    public long calculNbSecondeParAn(boolean bissextile) {
        return NB_HEURE_PAR_JOUR * NB_SECONDE_PAR_HEURE * getNbJourParAn(bissextile);
    }

    private static long getNbJourParAn(boolean bissextile) {
        return bissextile ? 366 : 365;
    }
}
