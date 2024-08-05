package acc.br.student_api.repository;

import acc.br.student_api.model.Student;
;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
