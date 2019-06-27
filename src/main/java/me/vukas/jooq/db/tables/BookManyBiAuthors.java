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
import me.vukas.jooq.db.tables.records.BookManyBiAuthorsRecord;

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
public class BookManyBiAuthors extends TableImpl<BookManyBiAuthorsRecord> {

    private static final long serialVersionUID = -819088125;

    /**
     * The reference instance of <code>hi_perf_java_pers.book_many_bi_authors</code>
     */
    public static final BookManyBiAuthors BOOK_MANY_BI_AUTHORS = new BookManyBiAuthors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookManyBiAuthorsRecord> getRecordType() {
        return BookManyBiAuthorsRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.book_many_bi_authors.books_id</code>.
     */
    public final TableField<BookManyBiAuthorsRecord, Long> BOOKS_ID = createField("books_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>hi_perf_java_pers.book_many_bi_authors.authors_id</code>.
     */
    public final TableField<BookManyBiAuthorsRecord, Long> AUTHORS_ID = createField("authors_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>hi_perf_java_pers.book_many_bi_authors</code> table reference
     */
    public BookManyBiAuthors() {
        this(DSL.name("book_many_bi_authors"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.book_many_bi_authors</code> table reference
     */
    public BookManyBiAuthors(String alias) {
        this(DSL.name(alias), BOOK_MANY_BI_AUTHORS);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.book_many_bi_authors</code> table reference
     */
    public BookManyBiAuthors(Name alias) {
        this(alias, BOOK_MANY_BI_AUTHORS);
    }

    private BookManyBiAuthors(Name alias, Table<BookManyBiAuthorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookManyBiAuthors(Name alias, Table<BookManyBiAuthorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BookManyBiAuthors(Table<O> child, ForeignKey<O, BookManyBiAuthorsRecord> key) {
        super(child, key, BOOK_MANY_BI_AUTHORS);
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
        return Arrays.<Index>asList(Indexes.BOOK_MANY_BI_AUTHORS_FKA9KDM0F4X1KPV93HJW2E296HE, Indexes.BOOK_MANY_BI_AUTHORS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookManyBiAuthorsRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_MANY_BI_AUTHORS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookManyBiAuthorsRecord>> getKeys() {
        return Arrays.<UniqueKey<BookManyBiAuthorsRecord>>asList(Keys.KEY_BOOK_MANY_BI_AUTHORS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BookManyBiAuthorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookManyBiAuthorsRecord, ?>>asList(Keys.FKLTSP8HKRUSHUK2TIAB4OAEXAQ, Keys.FKA9KDM0F4X1KPV93HJW2E296HE);
    }

    public BookManyBi bookManyBi() {
        return new BookManyBi(this, Keys.FKLTSP8HKRUSHUK2TIAB4OAEXAQ);
    }

    public AuthorManyBi authorManyBi() {
        return new AuthorManyBi(this, Keys.FKA9KDM0F4X1KPV93HJW2E296HE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookManyBiAuthors as(String alias) {
        return new BookManyBiAuthors(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookManyBiAuthors as(Name alias) {
        return new BookManyBiAuthors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookManyBiAuthors rename(String name) {
        return new BookManyBiAuthors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookManyBiAuthors rename(Name name) {
        return new BookManyBiAuthors(name, null);
    }
}