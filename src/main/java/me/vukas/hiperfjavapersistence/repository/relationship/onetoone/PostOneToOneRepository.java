package me.vukas.hiperfjavapersistence.repository.relationship.onetoone;

        import me.vukas.hiperfjavapersistence.entity.relationship.onetoone.PostOneToOne;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface PostOneToOneRepository extends JpaRepository<PostOneToOne, Long> {
}

