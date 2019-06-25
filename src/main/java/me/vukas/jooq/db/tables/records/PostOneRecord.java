/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.PostOne;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PostOneRecord extends UpdatableRecordImpl<PostOneRecord> implements Record6<Long, String, Double, Integer, Long, String> {

    private static final long serialVersionUID = 1510573822;

    /**
     * Setter for <code>hi_perf_java_pers.post_one.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_one.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_one.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_one.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_one.four</code>.
     */
    public void setFour(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_one.four</code>.
     */
    public Double getFour() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_one.one</code>.
     */
    public void setOne(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_one.one</code>.
     */
    public Integer getOne() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_one.three</code>.
     */
    public void setThree(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_one.three</code>.
     */
    public Long getThree() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_one.two</code>.
     */
    public void setTwo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_one.two</code>.
     */
    public String getTwo() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Double, Integer, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Double, Integer, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PostOne.POST_ONE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PostOne.POST_ONE.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return PostOne.POST_ONE.FOUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PostOne.POST_ONE.ONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PostOne.POST_ONE.THREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PostOne.POST_ONE.TWO;
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getFour();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getOne();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getThree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTwo();
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getFour();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getOne();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getThree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTwo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord value3(Double value) {
        setFour(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord value4(Integer value) {
        setOne(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord value5(Long value) {
        setThree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord value6(String value) {
        setTwo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostOneRecord values(Long value1, String value2, Double value3, Integer value4, Long value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostOneRecord
     */
    public PostOneRecord() {
        super(PostOne.POST_ONE);
    }

    /**
     * Create a detached, initialised PostOneRecord
     */
    public PostOneRecord(Long id, String content, Double four, Integer one, Long three, String two) {
        super(PostOne.POST_ONE);

        set(0, id);
        set(1, content);
        set(2, four);
        set(3, one);
        set(4, three);
        set(5, two);
    }
}
