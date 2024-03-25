package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentRepo {


	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student obj) {

		//System.out.println("repo class: saved");
		
		String query="insert into student (rollno, name, marks) values (?,?,?)";
		int rows=jdbc.update(query, obj.getRollNo(), obj.getName(),obj.getMarks());
		System.out.println(rows+" rows updated");
	}

	public List<Student> findAll() {
		//List<Student> students=new ArrayList<>();
		//return students;
		
		String query1="select * from student";
		
		//for getting all the rows present in table
		
		
		RowMapper<Student> mapper=(rs,rowNum) ->{
				
				Student obj=new Student();
				obj.setRollNo(rs.getInt("rollno"));
				obj.setName(rs.getString("name"));
				obj.setMarks(rs.getInt("marks"));

				return obj;
		
		};
		
		return jdbc.query(query1,mapper);
		
		
		//without using lambda expression
//		RowMapper<Student> mapper=new RowMapper<Student>(){ //interface 
//
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
//				Student obj=new Student();
//				obj.setRollNo(rs.getInt("rollno"));
//				obj.setName(rs.getString("name"));
//				obj.setMarks(rs.getInt("marks"));
//
//				return obj;
//			} 
//		
//		};
		
		//return jdbc.query(query1,mapper);	
		
	//mapRow method is to take one row at a time from result set and give it to us.	
		
		
		
	}
	

}
