package ma.bdo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.bdo.docs.Categorie;
import ma.bdo.repo.CategorieRepository;

@RestController 
public class CategorieController {
	
@Autowired
private CategorieRepository categorieRepository;

@PostMapping("/save")
public void save(@RequestBody Categorie Categorie){

	categorieRepository.save(Categorie);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable (required = true) String id){

	categorieRepository.deleteById(id);

}

@GetMapping("/all")
public List<Categorie>findAll(){

	return categorieRepository.findAll();
}

@GetMapping(value = "/count")
public long countCategorie() {

	return categorieRepository.count();
}
}