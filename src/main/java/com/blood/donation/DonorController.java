package com.blood.donation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DonorController {
@Autowired
private DonorService service;


@RequestMapping("/donor/all")
public List<Donor> getAllMovies() {
return service.getAllDonors();

}

@PostMapping("/donor/add")
public void postDonor(@RequestBody Donor donor){
	service.addDonor(donor);
}


@RequestMapping("/donor/search/{id}")
public Donor getMovie(@PathVariable String id) {
	return service.getDonor(id);

}
}
