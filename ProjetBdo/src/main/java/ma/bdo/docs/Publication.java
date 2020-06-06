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
    private List<Auteur> auteurs;
    private Categorie categorie;
    
	public Publication(String id, String titre, String versionNum, Date datePublication, String resume, String motsCle,
			List<Auteur> auteurs, Categorie categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.versionNum = versionNum;
		this.datePublication = datePublication;
		this.resume = resume;
		this.motsCle = motsCle;
		this.auteurs = auteurs;
		this.categorie = categorie;
	}
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
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
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
    
    
}
