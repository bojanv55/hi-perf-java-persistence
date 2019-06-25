/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables;


import javax.annotation.Generated;

import me.vukas.jooq.db.HiPerfJavaPers;
import me.vukas.jooq.db.tables.records.PooledSequenceRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class PooledSequence extends TableImpl<PooledSequenceRecord> {

    private static final long serialVersionUID = 591231583;

    /**
     * The reference instance of <code>hi_perf_java_pers.pooled_sequence</code>
     */
    public static final PooledSequence POOLED_SEQUENCE = new PooledSequence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PooledSequenceRecord> getRecordType() {
        return PooledSequenceRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.pooled_sequence.next_val</code>.
     */
    public final TableField<PooledSequenceRecord, Long> NEXT_VAL = createField("next_val", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>hi_perf_java_pers.pooled_sequence</code> table reference
     */
    public PooledSequence() {
        this(DSL.name("pooled_sequence"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.pooled_sequence</code> table reference
     */
    public PooledSequence(String alias) {
        this(DSL.name(alias), POOLED_SEQUENCE);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.pooled_sequence</code> table reference
     */
    public PooledSequence(Name alias) {
        this(alias, POOLED_SEQUENCE);
    }

    private PooledSequence(Name alias, Table<PooledSequenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PooledSequence(Name alias, Table<PooledSequenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PooledSequence(Table<O> child, ForeignKey<O, PooledSequenceRecord> key) {
        super(child, key, POOLED_SEQUENCE);
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
    public PooledSequence as(String alias) {
        return new PooledSequence(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PooledSequence as(Name alias) {
        return new PooledSequence(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PooledSequence rename(String name) {
        return new PooledSequence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PooledSequence rename(Name name) {
        return new PooledSequence(name, null);
    }
}
