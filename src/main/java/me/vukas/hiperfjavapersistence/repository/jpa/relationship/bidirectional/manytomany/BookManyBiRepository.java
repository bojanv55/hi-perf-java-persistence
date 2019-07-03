package me.vukas.hiperfjavapersistence.repository.jpa.relationship.bidirectional.manytomany;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomany.BookManyBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookManyBiRepository extends JpaRepository<BookManyBi, Long> {
}

