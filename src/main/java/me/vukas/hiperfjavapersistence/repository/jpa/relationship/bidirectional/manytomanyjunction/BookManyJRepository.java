package me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.manytomanyjunction;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookManyJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookManyJRepository extends JpaRepository<BookManyJ, Long> {
}
