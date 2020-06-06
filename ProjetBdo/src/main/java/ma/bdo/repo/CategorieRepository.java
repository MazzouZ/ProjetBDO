package ma.bdo.repo;

import ma.bdo.docs.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategorieRepository extends MongoRepository<Categorie, String> {
    
}

