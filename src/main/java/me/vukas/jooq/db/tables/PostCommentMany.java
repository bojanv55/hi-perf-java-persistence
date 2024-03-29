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
import me.vukas.jooq.db.tables.records.PostCommentManyRecord;

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
public class PostCommentMany extends TableImpl<PostCommentManyRecord> {

    private static final long serialVersionUID = 1298418227;

    /**
     * The reference instance of <code>hi_perf_java_pers.post_comment_many</code>
     */
    public static final PostCommentMany POST_COMMENT_MANY = new PostCommentMany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PostCommentManyRecord> getRecordType() {
        return PostCommentManyRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.id</code>.
     */
    public final TableField<PostCommentManyRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.comment</code>.
     */
    public final TableField<PostCommentManyRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.four</code>.
     */
    public final TableField<PostCommentManyRecord, Double> FOUR = createField("four", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.one</code>.
     */
    public final TableField<PostCommentManyRecord, Integer> ONE = createField("one", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.three</code>.
     */
    public final TableField<PostCommentManyRecord, Long> THREE = createField("three", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.two</code>.
     */
    public final TableField<PostCommentManyRecord, String> TWO = createField("two", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_comment_many.post_id</code>.
     */
    public final TableField<PostCommentManyRecord, Long> POST_ID = createField("post_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>hi_perf_java_pers.post_comment_many</code> table reference
     */
    public PostCommentMany() {
        this(DSL.name("post_comment_many"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_comment_many</code> table reference
     */
    public PostCommentMany(String alias) {
        this(DSL.name(alias), POST_COMMENT_MANY);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_comment_many</code> table reference
     */
    public PostCommentMany(Name alias) {
        this(alias, POST_COMMENT_MANY);
    }

    private PostCommentMany(Name alias, Table<PostCommentManyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PostCommentMany(Name alias, Table<PostCommentManyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PostCommentMany(Table<O> child, ForeignKey<O, PostCommentManyRecord> key) {
        super(child, key, POST_COMMENT_MANY);
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
        return Arrays.<Index>asList(Indexes.POST_COMMENT_MANY_FKIJQORVAAWMHGNKX917PS7MFP9, Indexes.POST_COMMENT_MANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PostCommentManyRecord, Long> getIdentity() {
        return Keys.IDENTITY_POST_COMMENT_MANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PostCommentManyRecord> getPrimaryKey() {
        return Keys.KEY_POST_COMMENT_MANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PostCommentManyRecord>> getKeys() {
        return Arrays.<UniqueKey<PostCommentManyRecord>>asList(Keys.KEY_POST_COMMENT_MANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PostCommentManyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PostCommentManyRecord, ?>>asList(Keys.FKIJQORVAAWMHGNKX917PS7MFP9);
    }

    public PostOne postOne() {
        return new PostOne(this, Keys.FKIJQORVAAWMHGNKX917PS7MFP9);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentMany as(String alias) {
        return new PostCommentMany(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentMany as(Name alias) {
        return new PostCommentMany(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PostCommentMany rename(String name) {
        return new PostCommentMany(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PostCommentMany rename(Name name) {
        return new PostCommentMany(name, null);
    }
}
