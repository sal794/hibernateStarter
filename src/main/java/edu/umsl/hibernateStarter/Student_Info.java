package edu.umsl.hibernateStarter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_INFORMATION")
public class Student_Info {

	@Id @GeneratedValue
	@Column(name="Student_Number")
	private int student_id;
	
	@Column(name="Full_Name", nullable=false)
	private String name;
	
	private Date birthDate;
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getRollNo() {
		return student_id;
	}
	public void setRollNo(int rollNo) {
		this.student_id = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
