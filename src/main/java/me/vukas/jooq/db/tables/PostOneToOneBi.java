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
import me.vukas.jooq.db.tables.records.PostOneToOneBiRecord;

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
public class PostOneToOneBi extends TableImpl<PostOneToOneBiRecord> {

    private static final long serialVersionUID = 919125364;

    /**
     * The reference instance of <code>hi_perf_java_pers.post_one_to_one_bi</code>
     */
    public static final PostOneToOneBi POST_ONE_TO_ONE_BI = new PostOneToOneBi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PostOneToOneBiRecord> getRecordType() {
        return PostOneToOneBiRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.post_one_to_one_bi.id</code>.
     */
    public final TableField<PostOneToOneBiRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_one_to_one_bi.content</code>.
     */
    public final TableField<PostOneToOneBiRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>hi_perf_java_pers.post_one_to_one_bi</code> table reference
     */
    public PostOneToOneBi() {
        this(DSL.name("post_one_to_one_bi"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_one_to_one_bi</code> table reference
     */
    public PostOneToOneBi(String alias) {
        this(DSL.name(alias), POST_ONE_TO_ONE_BI);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_one_to_one_bi</code> table reference
     */
    public PostOneToOneBi(Name alias) {
        this(alias, POST_ONE_TO_ONE_BI);
    }

    private PostOneToOneBi(Name alias, Table<PostOneToOneBiRecord> aliased) {
        this(alias, aliased, null);
    }

    private PostOneToOneBi(Name alias, Table<PostOneToOneBiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PostOneToOneBi(Table<O> child, ForeignKey<O, PostOneToOneBiRecord> key) {
        super(child, key, POST_ONE_TO_ONE_BI);
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
        return Arrays.<Index>asList(Indexes.POST_ONE_TO_ONE_BI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PostOneToOneBiRecord, Long> getIdentity() {
        return Keys.IDENTITY_POST_ONE_TO_ONE_BI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PostOneToOneBiRecord> getPrimaryKey() {
        return Keys.KEY_POST_ONE_TO_ONE_BI_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PostOneToOneBiRecord>> getKeys() {
        return Arrays.<UniqueKey<PostOneToOneBiRecord>>asList(Keys.KEY_POST_ONE_TO_ONE_BI_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneToOneBi as(String alias) {
        return new PostOneToOneBi(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneToOneBi as(Name alias) {
        return new PostOneToOneBi(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PostOneToOneBi rename(String name) {
        return new PostOneToOneBi(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PostOneToOneBi rename(Name name) {
        return new PostOneToOneBi(name, null);
    }
}
