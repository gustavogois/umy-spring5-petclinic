package gois.study.umyspring5petclinic.repositories;

import gois.study.umyspring5petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
