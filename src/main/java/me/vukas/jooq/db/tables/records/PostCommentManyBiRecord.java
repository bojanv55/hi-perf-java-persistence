/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db.tables.records;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.PostCommentManyBi;

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
public class PostCommentManyBiRecord extends UpdatableRecordImpl<PostCommentManyBiRecord> implements Record3<Long, String, Long> {

    private static final long serialVersionUID = -670535364;

    /**
     * Setter for <code>hi_perf_java_pers.post_comment_many_bi.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_comment_many_bi.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_comment_many_bi.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_comment_many_bi.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>hi_perf_java_pers.post_comment_many_bi.post_id</code>.
     */
    public void setPostId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>hi_perf_java_pers.post_comment_many_bi.post_id</code>.
     */
    public Long getPostId() {
        return (Long) get(2);
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
    public Row3<Long, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PostCommentManyBi.POST_COMMENT_MANY_BI.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PostCommentManyBi.POST_COMMENT_MANY_BI.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PostCommentManyBi.POST_COMMENT_MANY_BI.POST_ID;
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
    public Long component3() {
        return getPostId();
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
    public Long value3() {
        return getPostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentManyBiRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentManyBiRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentManyBiRecord value3(Long value) {
        setPostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostCommentManyBiRecord values(Long value1, String value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostCommentManyBiRecord
     */
    public PostCommentManyBiRecord() {
        super(PostCommentManyBi.POST_COMMENT_MANY_BI);
    }

    /**
     * Create a detached, initialised PostCommentManyBiRecord
     */
    public PostCommentManyBiRecord(Long id, String content, Long postId) {
        super(PostCommentManyBi.POST_COMMENT_MANY_BI);

        set(0, id);
        set(1, content);
        set(2, postId);
    }
}
