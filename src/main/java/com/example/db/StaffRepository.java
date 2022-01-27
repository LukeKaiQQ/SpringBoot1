package com.example.db;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StaffRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addStaff(StaffModel staffModel) {
		System.out.println("EXECUTE INSERT MEMBER");
		
		// SQL
		String sqlInsert = "INSERT INTO staffInfo"
				+ "(EMAIL, PASSWORD, POSITION, PHONE, CREATE_DATE)"
				+ "VALUES(?,?,?,?,NOW())";
		jdbcTemplate.update(sqlInsert,
				staffModel.getEmail(), staffModel.getPassword(),
				staffModel.getPosition(), staffModel.getPhone());
	}
	
//	Method...1
//	public void staffInfo() {
//		String sqlSelect = "SELECT * FROM staffInfo";
//		
//		List rows = jdbcTemplate.queryForList(sqlSelect);
//		for(int i = 0 ; i < rows.size() ; i++) {
//			System.out.println("data: " + rows.get(i));
//		}
//	}


//	Method...2
//	public List<StaffModel> staffInfo() {
//		String sqlSelect = "SELECT * FROM staffInfo";
//		List<StaffModel> listStaff = jdbcTemplate.query(sqlSelect,
//				BeanPropertyRowMapper.newInstance(StaffModel.class));
//		
//		return listStaff;
//	}
	
	
//	Method...3
	public List<StaffModel> staffInfo() {
		String sqlSelect = "SELECT * FROM staffInfo";
		List<StaffModel> listStaff = jdbcTemplate.query(sqlSelect, new StaffRowMapper());

		return listStaff;
	}
	
}
