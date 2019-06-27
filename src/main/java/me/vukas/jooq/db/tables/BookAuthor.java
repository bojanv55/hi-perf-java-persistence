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
import me.vukas.jooq.db.tables.records.BookAuthorRecord;

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
public class BookAuthor extends TableImpl<BookAuthorRecord> {

    private static final long serialVersionUID = -1330904158;

    /**
     * The reference instance of <code>hi_perf_java_pers.book_author</code>
     */
    public static final BookAuthor BOOK_AUTHOR = new BookAuthor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookAuthorRecord> getRecordType() {
        return BookAuthorRecord.class;
    }

    /**
     * The column <code>hi_perf_java_pers.book_author.author_id</code>.
     */
    public final TableField<BookAuthorRecord, Long> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>hi_perf_java_pers.book_author.book_id</code>.
     */
    public final TableField<BookAuthorRecord, Long> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>hi_perf_java_pers.book_author</code> table reference
     */
    public BookAuthor() {
        this(DSL.name("book_author"), null);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.book_author</code> table reference
     */
    public BookAuthor(String alias) {
        this(DSL.name(alias), BOOK_AUTHOR);
    }

    /**
     * Create an aliased <code>hi_perf_java_pers.book_author</code> table reference
     */
    public BookAuthor(Name alias) {
        this(alias, BOOK_AUTHOR);
    }

    private BookAuthor(Name alias, Table<BookAuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookAuthor(Name alias, Table<BookAuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BookAuthor(Table<O> child, ForeignKey<O, BookAuthorRecord> key) {
        super(child, key, BOOK_AUTHOR);
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
        return Arrays.<Index>asList(Indexes.BOOK_AUTHOR_FKBO8DRQ2LKNC77OLAJ3KKBJH4, Indexes.BOOK_AUTHOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookAuthorRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_AUTHOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookAuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<BookAuthorRecord>>asList(Keys.KEY_BOOK_AUTHOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BookAuthorRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookAuthorRecord, ?>>asList(Keys.FK412BCVQ3OL3GBFQ6W727JJ9NV, Keys.FKBO8DRQ2LKNC77OLAJ3KKBJH4);
    }

    public AuthorManyj authorManyj() {
        return new AuthorManyj(this, Keys.FK412BCVQ3OL3GBFQ6W727JJ9NV);
    }

    public BookManyj bookManyj() {
        return new BookManyj(this, Keys.FKBO8DRQ2LKNC77OLAJ3KKBJH4);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookAuthor as(String alias) {
        return new BookAuthor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookAuthor as(Name alias) {
        return new BookAuthor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookAuthor rename(String name) {
        return new BookAuthor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookAuthor rename(Name name) {
        return new BookAuthor(name, null);
    }
}