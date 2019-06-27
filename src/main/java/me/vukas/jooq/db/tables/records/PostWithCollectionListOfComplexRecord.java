/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.PostWithCollectionListOfComplex;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PostWithCollectionListOfComplexRecord extends TableRecordImpl<PostWithCollectionListOfComplexRecord> implements Record4<Long, String, Integer, Double> {

    private static final long serialVersionUID = -942468832;

    /**
     * Setter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.post_with_collection_id</code>.
     */
    public void setPostWithCollectionId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.post_with_collection_id</code>.
     */
    public Long getPostWithCollectionId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.attrib1</code>.
     */
    public void setAttrib1(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.attrib1</code>.
     */
    public String getAttrib1() {
        return (String) get(1);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.attrib2</code>.
     */
    public void setAttrib2(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.attrib2</code>.
     */
    public Integer getAttrib2() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.attrib3</code>.
     */
    public void setAttrib3(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_with_collection_list_of_complex.attrib3</code>.
     */
    public Double getAttrib3() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Integer, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Integer, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX.POST_WITH_COLLECTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX.ATTRIB1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX.ATTRIB2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX.ATTRIB3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getPostWithCollectionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAttrib1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAttrib2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getAttrib3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPostWithCollectionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAttrib1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAttrib2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getAttrib3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionListOfComplexRecord value1(Long value) {
        setPostWithCollectionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionListOfComplexRecord value2(String value) {
        setAttrib1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionListOfComplexRecord value3(Integer value) {
        setAttrib2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionListOfComplexRecord value4(Double value) {
        setAttrib3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostWithCollectionListOfComplexRecord values(Long value1, String value2, Integer value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostWithCollectionListOfComplexRecord
     */
    public PostWithCollectionListOfComplexRecord() {
        super(PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX);
    }

    /**
     * Create a detached, initialised PostWithCollectionListOfComplexRecord
     */
    public PostWithCollectionListOfComplexRecord(Long postWithCollectionId, String attrib1, Integer attrib2, Double attrib3) {
        super(PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX);

        set(0, postWithCollectionId);
        set(1, attrib1);
        set(2, attrib2);
        set(3, attrib3);
    }
}