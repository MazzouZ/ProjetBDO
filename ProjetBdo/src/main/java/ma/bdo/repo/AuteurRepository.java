package ma.bdo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.bdo.docs.Auteur;

public interface AuteurRepository extends MongoRepository<Auteur, String> {
	
 
}
