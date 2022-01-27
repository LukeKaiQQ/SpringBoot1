package com.example.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.jdi.Method;

@Controller
public class StaffController {
	@Autowired
	StaffModel staffModel;
	
	@Autowired
	StaffService staffService;
	
	@RequestMapping("/addStaff")
	public String addStaff(Model model) {
		staffModel = new StaffModel();
		staffModel.setEmail("k18265@firstbank.com.tw");
		staffModel.setPassword("1234567");
		staffModel.setPhone("25538366");
		staffModel.setPosition("Manager");
		staffService.addStaff(staffModel);
		
		model.addAttribute("info", "新增成功");
		return "staff_msg";
	}
	
//	Method...1
//	@RequestMapping("/staffInfo")
//	public String staffInfo(Model model) {
//		staffModel = new StaffModel();
//		staffService.staffInfo();
//		model.addAttribute("staffModel", staffModel);
//		
//		return "staffInfo";
//	}
	
//	Method...2
	@RequestMapping("/staffInfo")
	public String staffInfo(Model model) {
		List<StaffModel> listStaff = staffService.staffInfo();
		model.addAttribute("listStaff", listStaff);
		
		return "staffInfo";
	}
	
}


