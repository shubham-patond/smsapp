package equ.cjc.main.service;

import java.util.List;

import equ.cjc.main.model.Student;

public interface StudentService {

	  public void saveStudentDetails(Student st);
	  
	  public List<Student> getAllStudents();
	  
	  public List<Student> searchStudentsByBatch(String batchNumber);

	  public Student getSingleStudent(int id);

	  public void updateStudentFees(int studentid, float ammount);

	  public void updatestudentbatch(int studentid, String batchNumber);

	  public void removestudent(int studentid);

	





	

	
	  
}
