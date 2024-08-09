package phb.group.phb.dev.employ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import phb.group.phb.dev.employ.entity.AnimalFeed;

@Repository
public interface AnimalFeedRepository extends JpaRepository<AnimalFeed, Long> {
}
