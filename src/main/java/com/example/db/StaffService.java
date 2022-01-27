package com.example.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	@Autowired
	StaffRepository staffRepository;
	
	public void addStaff(StaffModel staffModel) {
		staffRepository.addStaff(staffModel);
	}
	
//  Method...1
//	public void staffInfo() {
//		staffRepository.staffInfo();
//	}

//  Method...2
	public List<StaffModel> staffInfo() {
		List<StaffModel> listStaff = staffRepository.staffInfo();

		return listStaff;
	}
	
}
