package com.spring;

//import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import com.demo.entities.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class DemoCrudApplicationTests {
    
	@Autowired
	private StudentRepository stuRepo;
	
	@Test
	void saveOneStudent() {
		System.out.println(stuRepo);

//		Student s1 = new Student();
//		s1.setName("vinod");
//		s1.setCourse("development");
//		s1.setFee(10000);
//		
//		stuRepo.save(s1);		
	}
	
//	@Test
//	void deleteOneStudent() {
//		stuRepo.deleteById(2L);
//
//	}
//	
//	@Test
//	void getOneStudent() {
//		Optional<Student> findById = stuRepo.findById(1L);
//		if(findById.isPresent()) {
//           Student student = findById.get();
//           System.out.println(student.getId());
//           System.out.println(student.getName());
//           System.out.println(student.getCourse());
//           System.out.println(student.getFee());
//		}
//		else {
//			System.out.println("No record found");
//		}
//	}
//	@Test
//	void updateOneStudent() {
//		Optional<Student> findById = stuRepo.findById(1L);    //to eliminate null
//		if(findById.isPresent()) {
//           Student student = findById.get();
//            
//          student.setCourse("Testing");
//          student.setFee(10000);
//          stuRepo.save(student);
//		}
//		else {
//			System.out.println("No record found");
//		}
//	}

}
