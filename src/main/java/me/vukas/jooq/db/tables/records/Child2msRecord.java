/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.Child2ms;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class Child2msRecord extends UpdatableRecordImpl<Child2msRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 303290245;

    /**
     * Setter for <code>hi_perf_java_pers.child2ms.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.child2ms.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>hi_perf_java_pers.child2ms.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.child2ms.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>hi_perf_java_pers.child2ms.child2prop</code>.
     */
    public void setChild2prop(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.child2ms.child2prop</code>.
     */
    public String getChild2prop() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Child2ms.CHILD2MS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Child2ms.CHILD2MS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Child2ms.CHILD2MS.CHILD2PROP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getChild2prop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChild2prop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Child2msRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Child2msRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Child2msRecord value3(String value) {
        setChild2prop(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Child2msRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Child2msRecord
     */
    public Child2msRecord() {
        super(Child2ms.CHILD2MS);
    }

    /**
     * Create a detached, initialised Child2msRecord
     */
    public Child2msRecord(Long id, String name, String child2prop) {
        super(Child2ms.CHILD2MS);

        set(0, id);
        set(1, name);
        set(2, child2prop);
    }
}