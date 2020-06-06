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
}
