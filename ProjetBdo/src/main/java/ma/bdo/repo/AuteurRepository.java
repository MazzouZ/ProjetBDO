package ma.bdo.repo;

import ma.bdo.docs.Auteur;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AuteurRepository extends MongoRepository<Auteur, String> {
	
 
}
