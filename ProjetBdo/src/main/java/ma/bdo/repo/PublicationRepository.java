package ma.bdo.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ma.bdo.docs.Publication;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface PublicationRepository extends MongoRepository<Publication, String> {
	
	@RestResource(path = "/ParCategorie")
    public List<Publication> findByCategorie(@Param("categorie") String categorie);
    //--------------------------------------------------------------------------------------------
	@RestResource(path = "/ParCategorieDisciplineOrganisme")
	@Query(value = "{ 'categorie' : ?0,'discipline' : ?1,'auteurs.organisme' : ?2 }")
	public List<Publication> getByCategorieDisciplineOrganisme(	@Param("categorie") String categorie,
																@Param("discipline") String discipline,
																@Param("organisme") String organisme);

	//----------------------------------------------------------------------------------------------
	@RestResource(path = "/ParAuteur")
	@Query(value = "{ 'auteurs.nom' : ?0 }")
	public List<Publication> getByAuteur(	@Param("auteur") String auteur);
	//----------------------------------------------------------------------------------------------
	@RestResource(path = "/ParAuteurSorted")
	@Query(value = "{ 'auteurs.nom' : ?0 }",sort = "{ 'titre' : 1 }")
	public List<Publication> getByAuteurSorted(@Param("auteur") String auteur);
	//----------------------------------------------------------------------------------------------
	@RestResource(path = "/ParAuteurCounted")
	@Query(value = "{ 'auteurs.nom' : ?0 }",count=true)
	public Long getByAuteurCounted(@Param("auteur") String auteur);
	//----------------------------------------------------------------------------------------------
	@RestResource(path = "/ParMulticritaire")
	@Query("{'$or':[ { 'titre': ?0 }, { 'versionNum' : ?0 }, { 'datePublication' : ?0 }, { 'resume' : ?0 }, { 'motsCle' : ?0 }, { 'discipline' : ?0 }, { 'auteurs.organisme' : ?0 },{ 'auteurs.nom' : ?0 }, { 'categorie' : ?0 } ] }")
	public List<Publication> getByMulticritaire(@Param("chaine") String chaine);

}


