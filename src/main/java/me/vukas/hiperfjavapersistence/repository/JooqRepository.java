package me.vukas.hiperfjavapersistence.repository;

import static me.vukas.jooq.db.Tables.POST_ONE_BI;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiDto;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class JooqRepository {

  private DSLContext sql;

  public JooqRepository(DSLContext sql) {
    this.sql = sql;
  }

  public PostOneBiDto getPostOneBi(Long id) {
    return sql.selectFrom
        (
            POST_ONE_BI
//            .leftJoin(POST_COMMENT_MANY_BI)
//            .on(POST_ONE_BI.ID
//                .eq(POST_COMMENT_MANY_BI.POST_ID))
        )
        .where(POST_ONE_BI.ID.eq(id))
        .fetchOneInto(PostOneBiDto.class);
  }
}
