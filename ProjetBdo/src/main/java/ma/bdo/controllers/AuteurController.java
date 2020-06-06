package ma.bdo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.bdo.docs.Auteur;
import ma.bdo.repo.AuteurRepository;

@RestController 
public class AuteurController {
	
@Autowired
private AuteurRepository auteurRepository;

@PostMapping("/save")
public void save(@RequestBody Auteur auteur){

	AuteurRepository.save(auteur);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable (required = true) String id){

	AuteurRepository.deleteById(Integer.parseInt(id));

}

@GetMapping("/all")
public List<Auteur>findAll(){

	return AuteurRepository.findAll();
}

@GetMapping(value = "/count")
public long countAuteur() {

	return AuteurRepository.count();
}
}