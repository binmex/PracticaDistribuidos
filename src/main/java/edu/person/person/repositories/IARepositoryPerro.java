package edu.person.person.repositories;

import edu.person.person.models.Perro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IARepositoryPerro extends JpaRepository<Perro,Long> {
    //
    @Query (value = "select  * from perro ",nativeQuery = true)
    List<Perro> selectAllInfo();
    @Query(value = "select * from perro where idperro = :idLlega",nativeQuery = true)
    Perro findByIDPerro(Long idLlega);
}
