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
import me.vukas.jooq.db.tables.records.PostManyUniTagsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PostManyUniTags extends TableImpl<PostManyUniTagsRecord> {

    private static final long serialVersionUID = 523206404;

    /**
     * The reference instance of <code>hi_perf_java_pers.post_many_uni_tags</code>
     */
    public static final PostManyUniTags POST_MANY_UNI_TAGS = new PostManyUniTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PostManyUniTagsRecord> getRecordType() {
        return PostManyUniTagsRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.post_many_uni_tags.post_many_uni_id</code>.
     */
    public final TableField<PostManyUniTagsRecord, Long> POST_MANY_UNI_ID = createField("post_many_uni_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>hi_perf_java_pers.post_many_uni_tags.tags_id</code>.
     */
    public final TableField<PostManyUniTagsRecord, Long> TAGS_ID = createField("tags_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>hi_perf_java_pers.post_many_uni_tags</code> table reference
     */
    public PostManyUniTags() {
        this(DSL.name("post_many_uni_tags"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_many_uni_tags</code> table reference
     */
    public PostManyUniTags(String alias) {
        this(DSL.name(alias), POST_MANY_UNI_TAGS);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.post_many_uni_tags</code> table reference
     */
    public PostManyUniTags(Name alias) {
        this(alias, POST_MANY_UNI_TAGS);
    }

    private PostManyUniTags(Name alias, Table<PostManyUniTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PostManyUniTags(Name alias, Table<PostManyUniTagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PostManyUniTags(Table<O> child, ForeignKey<O, PostManyUniTagsRecord> key) {
        super(child, key, POST_MANY_UNI_TAGS);
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
        return Arrays.<Index>asList(Indexes.POST_MANY_UNI_TAGS_FKNUXK5IFM2NP8MUXKNV1XOATXL, Indexes.POST_MANY_UNI_TAGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PostManyUniTagsRecord> getPrimaryKey() {
        return Keys.KEY_POST_MANY_UNI_TAGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PostManyUniTagsRecord>> getKeys() {
        return Arrays.<UniqueKey<PostManyUniTagsRecord>>asList(Keys.KEY_POST_MANY_UNI_TAGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PostManyUniTagsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PostManyUniTagsRecord, ?>>asList(Keys.FK9L4UCWPY3694X8AENS5TKT751, Keys.FKNUXK5IFM2NP8MUXKNV1XOATXL);
    }

    public PostManyUni postManyUni() {
        return new PostManyUni(this, Keys.FK9L4UCWPY3694X8AENS5TKT751);
    }

    public TagManyUni tagManyUni() {
        return new TagManyUni(this, Keys.FKNUXK5IFM2NP8MUXKNV1XOATXL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostManyUniTags as(String alias) {
        return new PostManyUniTags(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostManyUniTags as(Name alias) {
        return new PostManyUniTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PostManyUniTags rename(String name) {
        return new PostManyUniTags(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PostManyUniTags rename(Name name) {
        return new PostManyUniTags(name, null);
    }
}
