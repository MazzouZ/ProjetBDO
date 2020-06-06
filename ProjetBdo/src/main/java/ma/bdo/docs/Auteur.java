package ma.bdo.docs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Document(collection = "User")
public class Auteur {
	@Id
	private String id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String Adresse;
    private Double grade;
    private String Organisme;
	private List<Publication> publications;

}
