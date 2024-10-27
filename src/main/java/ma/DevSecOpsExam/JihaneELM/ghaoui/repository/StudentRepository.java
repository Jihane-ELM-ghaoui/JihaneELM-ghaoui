package ma.DevSecOpsExam.JihaneELM.ghaoui.repository;

import ma.DevSecOpsExam.JihaneELM.ghaoui.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}