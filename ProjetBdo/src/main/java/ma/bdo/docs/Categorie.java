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
}
