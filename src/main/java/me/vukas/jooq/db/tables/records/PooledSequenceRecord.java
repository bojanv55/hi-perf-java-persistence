/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.PooledSequence;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


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
public class PooledSequenceRecord extends TableRecordImpl<PooledSequenceRecord> implements Record1<Long> {

    private static final long serialVersionUID = -1554141382;

    /**
     * Setter for <code>hi_perf_java_pers.pooled_sequence.next_val</code>.
     */
    public void setNextVal(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.pooled_sequence.next_val</code>.
     */
    public Long getNextVal() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PooledSequence.POOLED_SEQUENCE.NEXT_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getNextVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getNextVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PooledSequenceRecord value1(Long value) {
        setNextVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PooledSequenceRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PooledSequenceRecord
     */
    public PooledSequenceRecord() {
        super(PooledSequence.POOLED_SEQUENCE);
    }

    /**
     * Create a detached, initialised PooledSequenceRecord
     */
    public PooledSequenceRecord(Long nextVal) {
        super(PooledSequence.POOLED_SEQUENCE);

        set(0, nextVal);
    }
}