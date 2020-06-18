package ma.bdo.repo;

import ma.bdo.docs.Auteur;
import ma.bdo.docs.Publication;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface AuteurRepository extends MongoRepository<Auteur, String> {
 
	//----------------------------------------------------------------------------------------------
		@RestResource(path = "/ParMulticritaire")
		@Query("{'$or':[ { 'nom': ?0 }, { 'prenom' : ?0 }, { 'dateNaissance' : ?0 }, { 'adresse' : ?0 }, { 'grade' : ?1 }, { 'organisme' : ?0 }, { 'publications.titre' : ?0 },{ 'publications.categorie' : ?0 }] }")
		public List<Auteur> getByMulticritaire(@Param("chaine") String chaine,@Param("number") Double ThisParamForGrade);
}
