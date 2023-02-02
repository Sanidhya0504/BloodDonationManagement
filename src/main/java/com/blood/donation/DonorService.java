package com.blood.donation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;





@Service
public class DonorService {
	private ArrayList<Donor> donorList=new ArrayList<Donor>(
			Arrays.asList(
		new Donor("1", "Aman","Jamshedpur","A+","Jharkhand","9999999991"),
		new Donor("2", "Bhuppu","Bangalore","B-","Karnataka","9999999992"),
		new Donor("3", "Krish Bullah","Bareilly","A+","Uttar Pradesh","9999999993")
		));
	
	
	public List<Donor> getAllDonors() {
		return donorList;
		}
	
	
	public void addDonor(Donor mov) {
		donorList.add(mov);
	}
	
	
	public Donor getDonor(String id) {
		return
				donorList.stream().filter(d->d.getD_ID().equals(id)).findFirst().get();
	}
}
