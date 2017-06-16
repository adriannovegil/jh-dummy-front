package es.devcircus.jhdummy.repository;

import es.devcircus.jhdummy.domain.JobHistory;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the JobHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory,Long> {
    
}
