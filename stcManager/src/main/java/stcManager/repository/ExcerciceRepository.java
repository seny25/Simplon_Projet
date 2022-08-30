package stcManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stcManager.model.Excercice;
@Repository
public interface ExcerciceRepository extends JpaRepository<Excercice, Long> {

}
