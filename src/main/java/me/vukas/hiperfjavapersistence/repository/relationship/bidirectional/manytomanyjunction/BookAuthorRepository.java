package me.vukas.hiperfjavapersistence.repository.relationship.bidirectional.manytomanyjunction;

import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthor;
import me.vukas.hiperfjavapersistence.entity.relationship.bidirectional.manytomanyjunction.BookAuthorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, BookAuthorId> {
}

