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
import me.vukas.jooq.db.tables.records.ParentStRecord;

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
public class ParentSt extends TableImpl<ParentStRecord> {

    private static final long serialVersionUID = 1637461695;

    /**
     * The reference instance of <code>hi_perf_java_pers.parent_st</code>
     */
    public static final ParentSt PARENT_ST = new ParentSt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParentStRecord> getRecordType() {
        return ParentStRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.parent_st.dtype</code>.
     */
    public final TableField<ParentStRecord, String> DTYPE = createField("dtype", org.jooq.impl.SQLDataType.VARCHAR(31).nullable(false), this, "");

    /**
     * The column <code>hi_perf_java_pers.parent_st.id</code>.
     */
    public final TableField<ParentStRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>hi_perf_java_pers.parent_st.name</code>.
     */
    public final TableField<ParentStRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>hi_perf_java_pers.parent_st.child1prop</code>.
     */
    public final TableField<ParentStRecord, String> CHILD1PROP = createField("child1prop", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>hi_perf_java_pers.parent_st.child2prop</code>.
     */
    public final TableField<ParentStRecord, String> CHILD2PROP = createField("child2prop", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>hi_perf_java_pers.parent_st</code> table reference
     */
    public ParentSt() {
        this(DSL.name("parent_st"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.parent_st</code> table reference
     */
    public ParentSt(String alias) {
        this(DSL.name(alias), PARENT_ST);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.parent_st</code> table reference
     */
    public ParentSt(Name alias) {
        this(alias, PARENT_ST);
    }

    private ParentSt(Name alias, Table<ParentStRecord> aliased) {
        this(alias, aliased, null);
    }

    private ParentSt(Name alias, Table<ParentStRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ParentSt(Table<O> child, ForeignKey<O, ParentStRecord> key) {
        super(child, key, PARENT_ST);
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
        return Arrays.<Index>asList(Indexes.PARENT_ST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ParentStRecord, Long> getIdentity() {
        return Keys.IDENTITY_PARENT_ST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ParentStRecord> getPrimaryKey() {
        return Keys.KEY_PARENT_ST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ParentStRecord>> getKeys() {
        return Arrays.<UniqueKey<ParentStRecord>>asList(Keys.KEY_PARENT_ST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentSt as(String alias) {
        return new ParentSt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentSt as(Name alias) {
        return new ParentSt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ParentSt rename(String name) {
        return new ParentSt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ParentSt rename(Name name) {
        return new ParentSt(name, null);
    }
}