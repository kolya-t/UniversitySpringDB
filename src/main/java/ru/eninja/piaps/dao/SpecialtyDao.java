package ru.eninja.piaps.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.eninja.piaps.domain.impl.Specialty;


public interface SpecialtyDao extends PagingAndSortingRepository<Specialty, String>, JpaSpecificationExecutor<SpecialtyDao> {
}
