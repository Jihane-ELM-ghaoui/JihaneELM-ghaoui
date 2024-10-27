package ma.DevSecOpsExam.JihaneELM.ghaoui.service;

import ma.DevSecOpsExam.JihaneELM.ghaoui.entity.Student;
import ma.DevSecOpsExam.JihaneELM.ghaoui.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Create a new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Retrieve a student by ID
    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    // Retrieve all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Update an existing student
    public Student updateStudent(long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Student not found with id: " + id)
        );

        existingStudent.setFirstName(updatedStudent.getFirstName());
        existingStudent.setLastName(updatedStudent.getLastName());
        existingStudent.setBirthday(updatedStudent.getBirthday());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setPhone(updatedStudent.getPhone());
        existingStudent.setAddress(updatedStudent.getAddress());
        existingStudent.setMajor(updatedStudent.getMajor());
        existingStudent.setLevel(updatedStudent.getLevel());

        return studentRepository.save(existingStudent);
    }

    // Delete a student by ID
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}