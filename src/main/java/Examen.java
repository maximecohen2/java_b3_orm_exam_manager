import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    @Column(length = 10, nullable = false)
    private String code;

    @Temporal(TemporalType.DATE)
    private Calendar dateDePassage;

    @Basic
    @Column(length = 100, nullable = false)
    private String nomEtudiant;

    @Basic
    private Integer note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Calendar getDateDePassage() {
        return dateDePassage;
    }

    public void setDateDePassage(Calendar dateDePassage) {
        this.dateDePassage = dateDePassage;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }
}
