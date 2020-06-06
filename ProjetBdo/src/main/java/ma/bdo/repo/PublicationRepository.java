package ma.bdo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import ma.bdo.docs.Publication;

public interface PublicationRepository extends MongoRepository<Publication, String> {
	
 
}


