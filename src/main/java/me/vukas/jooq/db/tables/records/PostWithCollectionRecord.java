/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.PostWithCollection;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class PostWithCollectionRecord extends UpdatableRecordImpl<PostWithCollectionRecord> implements Record1<Long> {

    private static final long serialVersionUID = 288484274;

    /**
     * Setter for <code>hi_perf_java_pers.post_with_collection.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_with_collection.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
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
        return PostWithCollection.POST_WITH_COLLECTION.ID;
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
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostWithCollectionRecord
     */
    public PostWithCollectionRecord() {
        super(PostWithCollection.POST_WITH_COLLECTION);
    }

    /**
     * Create a detached, initialised PostWithCollectionRecord
     */
    public PostWithCollectionRecord(Long id) {
        super(PostWithCollection.POST_WITH_COLLECTION);

        set(0, id);
    }
}
