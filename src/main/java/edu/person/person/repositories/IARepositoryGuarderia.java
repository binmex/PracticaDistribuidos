package edu.person.person.repositories;

import edu.person.person.models.Guarderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IARepositoryGuarderia extends JpaRepository<Guarderia,Long> {
    @Query(value = "select * from guarderia inner join perro on (guarderia.FK_PERRO = perro.IDPERRO)",nativeQuery = true)
    List<Guarderia> selectAllInfo4();

    @Query(value = "insert into guarderia values(:guarderia.id, :guarderia.nameGuarderi, :guarderia.perro.idperro)",nativeQuery = true)
    Guarderia saveGuarderia(Guarderia guarderia);
}
