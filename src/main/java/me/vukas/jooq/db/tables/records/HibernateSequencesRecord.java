/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.HibernateSequences;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class HibernateSequencesRecord extends UpdatableRecordImpl<HibernateSequencesRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = -906118809;

    /**
     * Setter for <code>hi_perf_java_pers.hibernate_sequences.sequence_name</code>.
     */
    public void setSequenceName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.hibernate_sequences.sequence_name</code>.
     */
    public String getSequenceName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>hi_perf_java_pers.hibernate_sequences.next_val</code>.
     */
    public void setNextVal(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.hibernate_sequences.next_val</code>.
     */
    public Long getNextVal() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return HibernateSequences.HIBERNATE_SEQUENCES.SEQUENCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return HibernateSequences.HIBERNATE_SEQUENCES.NEXT_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSequenceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getNextVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSequenceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getNextVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HibernateSequencesRecord value1(String value) {
        setSequenceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HibernateSequencesRecord value2(Long value) {
        setNextVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HibernateSequencesRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HibernateSequencesRecord
     */
    public HibernateSequencesRecord() {
        super(HibernateSequences.HIBERNATE_SEQUENCES);
    }

    /**
     * Create a detached, initialised HibernateSequencesRecord
     */
    public HibernateSequencesRecord(String sequenceName, Long nextVal) {
        super(HibernateSequences.HIBERNATE_SEQUENCES);

        set(0, sequenceName);
        set(1, nextVal);
    }
}
