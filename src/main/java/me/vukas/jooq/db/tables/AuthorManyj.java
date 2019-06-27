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
import me.vukas.jooq.db.tables.records.AuthorManyjRecord;

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
public class AuthorManyj extends TableImpl<AuthorManyjRecord> {

    private static final long serialVersionUID = 1568827779;

    /**
     * The reference instance of <code>hi_perf_java_pers.author_manyj</code>
     */
    public static final AuthorManyj AUTHOR_MANYJ = new AuthorManyj();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorManyjRecord> getRecordType() {
        return AuthorManyjRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.author_manyj.id</code>.
     */
    public final TableField<AuthorManyjRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>hi_perf_java_pers.author_manyj.name</code>.
     */
    public final TableField<AuthorManyjRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>hi_perf_java_pers.author_manyj</code> table reference
     */
    public AuthorManyj() {
        this(DSL.name("author_manyj"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.author_manyj</code> table reference
     */
    public AuthorManyj(String alias) {
        this(DSL.name(alias), AUTHOR_MANYJ);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.author_manyj</code> table reference
     */
    public AuthorManyj(Name alias) {
        this(alias, AUTHOR_MANYJ);
    }

    private AuthorManyj(Name alias, Table<AuthorManyjRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorManyj(Name alias, Table<AuthorManyjRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AuthorManyj(Table<O> child, ForeignKey<O, AuthorManyjRecord> key) {
        super(child, key, AUTHOR_MANYJ);
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
        return Arrays.<Index>asList(Indexes.AUTHOR_MANYJ_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthorManyjRecord, Long> getIdentity() {
        return Keys.IDENTITY_AUTHOR_MANYJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorManyjRecord> getPrimaryKey() {
        return Keys.KEY_AUTHOR_MANYJ_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorManyjRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorManyjRecord>>asList(Keys.KEY_AUTHOR_MANYJ_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorManyj as(String alias) {
        return new AuthorManyj(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorManyj as(Name alias) {
        return new AuthorManyj(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorManyj rename(String name) {
        return new AuthorManyj(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorManyj rename(Name name) {
        return new AuthorManyj(name, null);
    }
}