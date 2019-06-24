package me.vukas.hiperfjavapersistence.repository;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

import me.vukas.hiperfjavapersistence.dto.bidirectional.onetomany.PostOneBiDto;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class JooqRepository {

  private DSLContext sql;

  public JooqRepository(DSLContext sql) {
    this.sql = sql;
  }

  public PostOneBiDto getPostOneBi(Long id){
    return sql.selectFrom(table("post_one_bi")
        .leftJoin(table("post_comment_many_bi")).on(field("post_one_bi.id").eq(field("post_comment_many_bi.post_id"))))
        .where(field("post_one_bi.id").eq(id)).fetchOneInto(PostOneBiDto.class);
  }
}
