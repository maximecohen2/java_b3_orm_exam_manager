import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

public class ExamManager {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examManager");

        EntityManager entityManager = emf.createEntityManager();

        Examen examen = new Examen();

        examen.setCode("TESNULL");
        examen.setDateDePassage(Calendar.getInstance());
        examen.setNomEtudiant("Cédric Clémenceau");
        examen.setNote(1);


        entityManager.getTransaction().begin();
        boolean success = false;
        try {
            entityManager.persist(examen);
            success = true;
        } finally {
            if (success) {
                entityManager.getTransaction().commit();
            } else {
                entityManager.getTransaction().rollback();
            }
        }
    }

}
