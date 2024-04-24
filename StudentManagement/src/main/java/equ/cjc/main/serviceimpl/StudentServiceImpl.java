package equ.cjc.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import equ.cjc.main.model.Student;
import equ.cjc.main.repository.StudentRepository;
import equ.cjc.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;
	
	@Override
	public void saveStudentDetails(Student st) {
		sr.save(st);
		
	}
	public List<Student> getAllStudents(){
		
		return sr.findAll();
	}
	@Override
	public List<Student> searchStudentsByBatch(String batchNumber) {
		List<Student>  batchStudents = sr.findAllByBatchNumber(batchNumber);
		return batchStudents;
	}
	@Override
	public Student getSingleStudent(int id) {
		Optional<Student> opStudent =sr.findById(id);
		return opStudent.get();
	}
	@Override
	public void updateStudentFees(int studentid, float ammount) {
		Optional<Student> opStudent = sr.findById(studentid);
		Student st = opStudent.get();
		st.setFeesPaid(st.getFeesPaid()+ammount);
		sr.save(st);
	}
	
	@Override
	public void updatestudentbatch(int studentid, String batchNumber) {
		Optional<Student> opStudent = sr.findById(studentid);
		Student st =opStudent.get();
		st.setBatchNumber(batchNumber);
		//st.getBatchNumber();
		sr.save(st);	
	}
	@Override
	public void removestudent(int studentid) {
		 sr.deleteById(studentid);
		
	}

}
