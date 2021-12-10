package net.javaguides.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Thang", "Phan", "thang@123.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Veee", "Phantom", "veepp@123.com");
//		studentRepository.save(student2);
	}

}
