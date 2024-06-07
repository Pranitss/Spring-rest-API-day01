package in.asterisc.orm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.asterisc.orm.model.Student;

public interface MyJpa extends JpaRepository<Student, Integer>{

}
