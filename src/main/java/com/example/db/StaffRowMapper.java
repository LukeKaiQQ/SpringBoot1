package com.example.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StaffRowMapper implements RowMapper<StaffModel>{
	
	@Override
	public StaffModel mapRow(ResultSet rs, int rowNum) throws SQLException{
		StaffModel staff = new StaffModel();
		staff.setId(rs.getInt("id"));
		staff.setEmail(rs.getString("email"));
		staff.setPassword(rs.getString("password"));
		staff.setPosition(rs.getString("position"));
		staff.setPhone(rs.getString("phone"));
		staff.setCreate_date(rs.getString("create_date"));

		return staff;
	}
}

