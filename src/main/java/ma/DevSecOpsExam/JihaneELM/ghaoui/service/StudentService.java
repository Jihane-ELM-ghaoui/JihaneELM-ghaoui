package ma.DevSecOpsExam.JihaneELM.ghaoui.service;

import ma.DevSecOpsExam.JihaneELM.ghaoui.entity.Student;
import ma.DevSecOpsExam.JihaneELM.ghaoui.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

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

        // Save and return the updated student
        return studentRepository.save(existingStudent);
    }


    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}

