package ma.DevSecOpsExam.JihaneELM.ghaoui.controller;

import ma.DevSecOpsExam.JihaneELM.ghaoui.entity.Student;
import ma.DevSecOpsExam.JihaneELM.ghaoui.repository.StudentRepository;
import ma.DevSecOpsExam.JihaneELM.ghaoui.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @PostMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

}