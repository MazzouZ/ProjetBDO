package ma.bdo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.bdo.docs.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, String> {
	
 
}

