package ma.bdo.docs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Publication {
    @Id
    private String id;
    private String titre;
    private String versionNum;
    private Date datePublication;
    private String resume;
    private String motsCle;
    private String discipline;
    private List<Auteur> auteurs;
    private String categorie;

    public Publication(String id, String titre, String versionNum, Date datePublication, String resume, String motsCle,
                       List<Auteur> auteurs, String categorie,String discipline) {
        super();
        this.id = id;
        this.titre = titre;
        this.versionNum = versionNum;
        this.datePublication = datePublication;
        this.resume = resume;
        this.motsCle = motsCle;
        this.auteurs = auteurs;
        this.discipline=discipline;
        this.categorie = categorie;
    }

    public Publication() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getMotsCle() {
        return motsCle;
    }

    public void setMotsCle(String motsCle) {
        this.motsCle = motsCle;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


}
