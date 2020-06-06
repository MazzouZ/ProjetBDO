package ma.bdo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.bdo.docs.Publication;
import ma.bdo.repo.PublicationRepository;

@RestController 
public class publicationController {
	
@Autowired
private PublicationRepository PublicationRepository;

@PostMapping("/save")
public void save(@RequestBody Publication Publication){

	PublicationRepository.save(Publication);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable (required = true) String id){

	PublicationRepository.deleteById(Integer.parseInt(id));

}

@GetMapping("/all")
public List<Publication>findAll(){

	return PublicationRepository.findAll();
}

@GetMapping(value = "/count")
public long countPublication() {

	return PublicationRepository.count();
}
}