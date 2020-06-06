package ma.bdo.docs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Categorie {
    @Id
    private String id;
    private String label;
    private List<Publication> publications;
    
	public Categorie(String id, String label, List<Publication> publications) {
		super();
		this.id = id;
		this.label = label;
		this.publications = publications;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Publication> getPublications() {
		return publications;
	}
	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}
    
    
}
