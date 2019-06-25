/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import me.vukas.jooq.db.HiPerfJavaPers;
import me.vukas.jooq.db.Indexes;
import me.vukas.jooq.db.Keys;
import me.vukas.jooq.db.tables.records.PostCommentManyBiRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PostCommentManyBi extends TableImpl<PostCommentManyBiRecord> {

    private static final long serialVersionUID = -1479568778;

    /**
     * The reference instance of <code>hi_perf_java_pers.post_comment_many_bi</code>
     */
    public static final PostCommentManyBi POST_COMMENT_MANY_BI = new PostCommentManyBi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PostCommentManyBiRecord> getRecordType() {
        return PostCommentManyBiRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.post_comment_many_bi.id</code>.
     */
    public final TableField<PostCommentManyBiRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many_bi.content</code>.
     */
    public final TableField<PostCommentManyBiRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many_bi.post_id</code>.
     */
    public final TableField<PostCommentManyBiRecord, Long> POST_ID = createField("post_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>hi_perf_java_pers.post_comment_many_bi</code> table reference
     */
    public PostCommentManyBi() {
        this(DSL.name("post_comment_many_bi"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_comment_many_bi</code> table reference
     */
    public PostCommentManyBi(String alias) {
        this(DSL.name(alias), POST_COMMENT_MANY_BI);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_comment_many_bi</code> table reference
     */
    public PostCommentManyBi(Name alias) {
        this(alias, POST_COMMENT_MANY_BI);
    }

    private PostCommentManyBi(Name alias, Table<PostCommentManyBiRecord> aliased) {
        this(alias, aliased, null);
    }

    private PostCommentManyBi(Name alias, Table<PostCommentManyBiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PostCommentManyBi(Table<O> child, ForeignKey<O, PostCommentManyBiRecord> key) {
        super(child, key, POST_COMMENT_MANY_BI);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return HiPerfJavaPers.HI_PERF_JAVA_PERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.POST_COMMENT_MANY_BI_FKQDJUHSGS3OPNLXT26S15U0YQF, Indexes.POST_COMMENT_MANY_BI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PostCommentManyBiRecord, Long> getIdentity() {
        return Keys.IDENTITY_POST_COMMENT_MANY_BI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PostCommentManyBiRecord> getPrimaryKey() {
        return Keys.KEY_POST_COMMENT_MANY_BI_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PostCommentManyBiRecord>> getKeys() {
        return Arrays.<UniqueKey<PostCommentManyBiRecord>>asList(Keys.KEY_POST_COMMENT_MANY_BI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PostCommentManyBiRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PostCommentManyBiRecord, ?>>asList(Keys.FKQDJUHSGS3OPNLXT26S15U0YQF);
    }

    public PostOneBi postOneBi() {
        return new PostOneBi(this, Keys.FKQDJUHSGS3OPNLXT26S15U0YQF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentManyBi as(String alias) {
        return new PostCommentManyBi(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentManyBi as(Name alias) {
        return new PostCommentManyBi(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PostCommentManyBi rename(String name) {
        return new PostCommentManyBi(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PostCommentManyBi rename(Name name) {
        return new PostCommentManyBi(name, null);
    }
}
