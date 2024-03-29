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
import me.vukas.jooq.db.tables.records.IdentityGeneratorRecord;

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
public class IdentityGenerator extends TableImpl<IdentityGeneratorRecord> {

    private static final long serialVersionUID = 1906138428;

    /**
     * The reference instance of <code>hi_perf_java_pers.identity_generator</code>
     */
    public static final IdentityGenerator IDENTITY_GENERATOR = new IdentityGenerator();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IdentityGeneratorRecord> getRecordType() {
        return IdentityGeneratorRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.identity_generator.id</code>.
     */
    public final TableField<IdentityGeneratorRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * Create a <code>hi_perf_java_pers.identity_generator</code> table reference
     */
    public IdentityGenerator() {
        this(DSL.name("identity_generator"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.identity_generator</code> table reference
     */
    public IdentityGenerator(String alias) {
        this(DSL.name(alias), IDENTITY_GENERATOR);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.identity_generator</code> table reference
     */
    public IdentityGenerator(Name alias) {
        this(alias, IDENTITY_GENERATOR);
    }

    private IdentityGenerator(Name alias, Table<IdentityGeneratorRecord> aliased) {
        this(alias, aliased, null);
    }

    private IdentityGenerator(Name alias, Table<IdentityGeneratorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IdentityGenerator(Table<O> child, ForeignKey<O, IdentityGeneratorRecord> key) {
        super(child, key, IDENTITY_GENERATOR);
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
        return Arrays.<Index>asList(Indexes.IDENTITY_GENERATOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IdentityGeneratorRecord, Long> getIdentity() {
        return Keys.IDENTITY_IDENTITY_GENERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IdentityGeneratorRecord> getPrimaryKey() {
        return Keys.KEY_IDENTITY_GENERATOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IdentityGeneratorRecord>> getKeys() {
        return Arrays.<UniqueKey<IdentityGeneratorRecord>>asList(Keys.KEY_IDENTITY_GENERATOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentityGenerator as(String alias) {
        return new IdentityGenerator(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentityGenerator as(Name alias) {
        return new IdentityGenerator(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IdentityGenerator rename(String name) {
        return new IdentityGenerator(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IdentityGenerator rename(Name name) {
        return new IdentityGenerator(name, null);
    }
}
