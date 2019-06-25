/*
 * This file is generated by jOOQ.
 */
package me.vukas.jooq.db;


import javax.annotation.Generated;

import me.vukas.jooq.db.tables.Assigneduuidgenerator;
import me.vukas.jooq.db.tables.AuthorManyBi;
import me.vukas.jooq.db.tables.AuthorManyj;
import me.vukas.jooq.db.tables.BookAuthor;
import me.vukas.jooq.db.tables.BookManyBi;
import me.vukas.jooq.db.tables.BookManyBiAuthors;
import me.vukas.jooq.db.tables.BookManyj;
import me.vukas.jooq.db.tables.Child1jt;
import me.vukas.jooq.db.tables.Child1ms;
import me.vukas.jooq.db.tables.Child1tpc;
import me.vukas.jooq.db.tables.Child2jt;
import me.vukas.jooq.db.tables.Child2ms;
import me.vukas.jooq.db.tables.Child2tpc;
import me.vukas.jooq.db.tables.HibernateSequences;
import me.vukas.jooq.db.tables.IdentityGenerator;
import me.vukas.jooq.db.tables.ParentJt;
import me.vukas.jooq.db.tables.ParentSt;
import me.vukas.jooq.db.tables.Parenttpc;
import me.vukas.jooq.db.tables.PooledSequenceGenerator;
import me.vukas.jooq.db.tables.PostCommentMany;
import me.vukas.jooq.db.tables.PostCommentManyBi;
import me.vukas.jooq.db.tables.PostCommentUniMany;
import me.vukas.jooq.db.tables.PostDetailsOne;
import me.vukas.jooq.db.tables.PostDetailsOneBi;
import me.vukas.jooq.db.tables.PostManyUni;
import me.vukas.jooq.db.tables.PostManyUniTags;
import me.vukas.jooq.db.tables.PostOne;
import me.vukas.jooq.db.tables.PostOneBi;
import me.vukas.jooq.db.tables.PostOneToOne;
import me.vukas.jooq.db.tables.PostOneToOneBi;
import me.vukas.jooq.db.tables.PostOneUni;
import me.vukas.jooq.db.tables.PostWithCollection;
import me.vukas.jooq.db.tables.PostWithCollectionListOfComplex;
import me.vukas.jooq.db.tables.PostWithCollectionListOfStrings;
import me.vukas.jooq.db.tables.SequenceGenerator;
import me.vukas.jooq.db.tables.StandaloneEntity;
import me.vukas.jooq.db.tables.TableGenerator;
import me.vukas.jooq.db.tables.TagManyUni;
import me.vukas.jooq.db.tables.Uuidgenerator;
import me.vukas.jooq.db.tables.records.AssigneduuidgeneratorRecord;
import me.vukas.jooq.db.tables.records.AuthorManyBiRecord;
import me.vukas.jooq.db.tables.records.AuthorManyjRecord;
import me.vukas.jooq.db.tables.records.BookAuthorRecord;
import me.vukas.jooq.db.tables.records.BookManyBiAuthorsRecord;
import me.vukas.jooq.db.tables.records.BookManyBiRecord;
import me.vukas.jooq.db.tables.records.BookManyjRecord;
import me.vukas.jooq.db.tables.records.Child1jtRecord;
import me.vukas.jooq.db.tables.records.Child1msRecord;
import me.vukas.jooq.db.tables.records.Child1tpcRecord;
import me.vukas.jooq.db.tables.records.Child2jtRecord;
import me.vukas.jooq.db.tables.records.Child2msRecord;
import me.vukas.jooq.db.tables.records.Child2tpcRecord;
import me.vukas.jooq.db.tables.records.HibernateSequencesRecord;
import me.vukas.jooq.db.tables.records.IdentityGeneratorRecord;
import me.vukas.jooq.db.tables.records.ParentJtRecord;
import me.vukas.jooq.db.tables.records.ParentStRecord;
import me.vukas.jooq.db.tables.records.ParenttpcRecord;
import me.vukas.jooq.db.tables.records.PooledSequenceGeneratorRecord;
import me.vukas.jooq.db.tables.records.PostCommentManyBiRecord;
import me.vukas.jooq.db.tables.records.PostCommentManyRecord;
import me.vukas.jooq.db.tables.records.PostCommentUniManyRecord;
import me.vukas.jooq.db.tables.records.PostDetailsOneBiRecord;
import me.vukas.jooq.db.tables.records.PostDetailsOneRecord;
import me.vukas.jooq.db.tables.records.PostManyUniRecord;
import me.vukas.jooq.db.tables.records.PostManyUniTagsRecord;
import me.vukas.jooq.db.tables.records.PostOneBiRecord;
import me.vukas.jooq.db.tables.records.PostOneRecord;
import me.vukas.jooq.db.tables.records.PostOneToOneBiRecord;
import me.vukas.jooq.db.tables.records.PostOneToOneRecord;
import me.vukas.jooq.db.tables.records.PostOneUniRecord;
import me.vukas.jooq.db.tables.records.PostWithCollectionListOfComplexRecord;
import me.vukas.jooq.db.tables.records.PostWithCollectionListOfStringsRecord;
import me.vukas.jooq.db.tables.records.PostWithCollectionRecord;
import me.vukas.jooq.db.tables.records.SequenceGeneratorRecord;
import me.vukas.jooq.db.tables.records.StandaloneEntityRecord;
import me.vukas.jooq.db.tables.records.TableGeneratorRecord;
import me.vukas.jooq.db.tables.records.TagManyUniRecord;
import me.vukas.jooq.db.tables.records.UuidgeneratorRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>hi_perf_java_pers</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthorManyjRecord, Long> IDENTITY_AUTHOR_MANYJ = Identities0.IDENTITY_AUTHOR_MANYJ;
    public static final Identity<AuthorManyBiRecord, Long> IDENTITY_AUTHOR_MANY_BI = Identities0.IDENTITY_AUTHOR_MANY_BI;
    public static final Identity<BookManyjRecord, Long> IDENTITY_BOOK_MANYJ = Identities0.IDENTITY_BOOK_MANYJ;
    public static final Identity<BookManyBiRecord, Long> IDENTITY_BOOK_MANY_BI = Identities0.IDENTITY_BOOK_MANY_BI;
    public static final Identity<Child1msRecord, Long> IDENTITY_CHILD1MS = Identities0.IDENTITY_CHILD1MS;
    public static final Identity<Child2msRecord, Long> IDENTITY_CHILD2MS = Identities0.IDENTITY_CHILD2MS;
    public static final Identity<IdentityGeneratorRecord, Long> IDENTITY_IDENTITY_GENERATOR = Identities0.IDENTITY_IDENTITY_GENERATOR;
    public static final Identity<ParentJtRecord, Long> IDENTITY_PARENT_JT = Identities0.IDENTITY_PARENT_JT;
    public static final Identity<ParentStRecord, Long> IDENTITY_PARENT_ST = Identities0.IDENTITY_PARENT_ST;
    public static final Identity<PostCommentManyRecord, Long> IDENTITY_POST_COMMENT_MANY = Identities0.IDENTITY_POST_COMMENT_MANY;
    public static final Identity<PostCommentManyBiRecord, Long> IDENTITY_POST_COMMENT_MANY_BI = Identities0.IDENTITY_POST_COMMENT_MANY_BI;
    public static final Identity<PostCommentUniManyRecord, Long> IDENTITY_POST_COMMENT_UNI_MANY = Identities0.IDENTITY_POST_COMMENT_UNI_MANY;
    public static final Identity<PostManyUniRecord, Long> IDENTITY_POST_MANY_UNI = Identities0.IDENTITY_POST_MANY_UNI;
    public static final Identity<PostOneRecord, Long> IDENTITY_POST_ONE = Identities0.IDENTITY_POST_ONE;
    public static final Identity<PostOneBiRecord, Long> IDENTITY_POST_ONE_BI = Identities0.IDENTITY_POST_ONE_BI;
    public static final Identity<PostOneToOneRecord, Long> IDENTITY_POST_ONE_TO_ONE = Identities0.IDENTITY_POST_ONE_TO_ONE;
    public static final Identity<PostOneToOneBiRecord, Long> IDENTITY_POST_ONE_TO_ONE_BI = Identities0.IDENTITY_POST_ONE_TO_ONE_BI;
    public static final Identity<PostWithCollectionRecord, Long> IDENTITY_POST_WITH_COLLECTION = Identities0.IDENTITY_POST_WITH_COLLECTION;
    public static final Identity<TagManyUniRecord, Long> IDENTITY_TAG_MANY_UNI = Identities0.IDENTITY_TAG_MANY_UNI;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AssigneduuidgeneratorRecord> KEY_ASSIGNEDUUIDGENERATOR_PRIMARY = UniqueKeys0.KEY_ASSIGNEDUUIDGENERATOR_PRIMARY;
    public static final UniqueKey<AuthorManyjRecord> KEY_AUTHOR_MANYJ_PRIMARY = UniqueKeys0.KEY_AUTHOR_MANYJ_PRIMARY;
    public static final UniqueKey<AuthorManyBiRecord> KEY_AUTHOR_MANY_BI_PRIMARY = UniqueKeys0.KEY_AUTHOR_MANY_BI_PRIMARY;
    public static final UniqueKey<AuthorManyBiRecord> KEY_AUTHOR_MANY_BI_UK_81A5W9QC9SSM6XLY74RM34B4A = UniqueKeys0.KEY_AUTHOR_MANY_BI_UK_81A5W9QC9SSM6XLY74RM34B4A;
    public static final UniqueKey<BookAuthorRecord> KEY_BOOK_AUTHOR_PRIMARY = UniqueKeys0.KEY_BOOK_AUTHOR_PRIMARY;
    public static final UniqueKey<BookManyjRecord> KEY_BOOK_MANYJ_PRIMARY = UniqueKeys0.KEY_BOOK_MANYJ_PRIMARY;
    public static final UniqueKey<BookManyBiRecord> KEY_BOOK_MANY_BI_PRIMARY = UniqueKeys0.KEY_BOOK_MANY_BI_PRIMARY;
    public static final UniqueKey<BookManyBiAuthorsRecord> KEY_BOOK_MANY_BI_AUTHORS_PRIMARY = UniqueKeys0.KEY_BOOK_MANY_BI_AUTHORS_PRIMARY;
    public static final UniqueKey<Child1jtRecord> KEY_CHILD1JT_PRIMARY = UniqueKeys0.KEY_CHILD1JT_PRIMARY;
    public static final UniqueKey<Child1msRecord> KEY_CHILD1MS_PRIMARY = UniqueKeys0.KEY_CHILD1MS_PRIMARY;
    public static final UniqueKey<Child1tpcRecord> KEY_CHILD1TPC_PRIMARY = UniqueKeys0.KEY_CHILD1TPC_PRIMARY;
    public static final UniqueKey<Child2jtRecord> KEY_CHILD2JT_PRIMARY = UniqueKeys0.KEY_CHILD2JT_PRIMARY;
    public static final UniqueKey<Child2msRecord> KEY_CHILD2MS_PRIMARY = UniqueKeys0.KEY_CHILD2MS_PRIMARY;
    public static final UniqueKey<Child2tpcRecord> KEY_CHILD2TPC_PRIMARY = UniqueKeys0.KEY_CHILD2TPC_PRIMARY;
    public static final UniqueKey<HibernateSequencesRecord> KEY_HIBERNATE_SEQUENCES_PRIMARY = UniqueKeys0.KEY_HIBERNATE_SEQUENCES_PRIMARY;
    public static final UniqueKey<IdentityGeneratorRecord> KEY_IDENTITY_GENERATOR_PRIMARY = UniqueKeys0.KEY_IDENTITY_GENERATOR_PRIMARY;
    public static final UniqueKey<ParenttpcRecord> KEY_PARENTTPC_PRIMARY = UniqueKeys0.KEY_PARENTTPC_PRIMARY;
    public static final UniqueKey<ParentJtRecord> KEY_PARENT_JT_PRIMARY = UniqueKeys0.KEY_PARENT_JT_PRIMARY;
    public static final UniqueKey<ParentStRecord> KEY_PARENT_ST_PRIMARY = UniqueKeys0.KEY_PARENT_ST_PRIMARY;
    public static final UniqueKey<PooledSequenceGeneratorRecord> KEY_POOLED_SEQUENCE_GENERATOR_PRIMARY = UniqueKeys0.KEY_POOLED_SEQUENCE_GENERATOR_PRIMARY;
    public static final UniqueKey<PostCommentManyRecord> KEY_POST_COMMENT_MANY_PRIMARY = UniqueKeys0.KEY_POST_COMMENT_MANY_PRIMARY;
    public static final UniqueKey<PostCommentManyBiRecord> KEY_POST_COMMENT_MANY_BI_PRIMARY = UniqueKeys0.KEY_POST_COMMENT_MANY_BI_PRIMARY;
    public static final UniqueKey<PostCommentUniManyRecord> KEY_POST_COMMENT_UNI_MANY_PRIMARY = UniqueKeys0.KEY_POST_COMMENT_UNI_MANY_PRIMARY;
    public static final UniqueKey<PostDetailsOneRecord> KEY_POST_DETAILS_ONE_PRIMARY = UniqueKeys0.KEY_POST_DETAILS_ONE_PRIMARY;
    public static final UniqueKey<PostDetailsOneBiRecord> KEY_POST_DETAILS_ONE_BI_PRIMARY = UniqueKeys0.KEY_POST_DETAILS_ONE_BI_PRIMARY;
    public static final UniqueKey<PostManyUniRecord> KEY_POST_MANY_UNI_PRIMARY = UniqueKeys0.KEY_POST_MANY_UNI_PRIMARY;
    public static final UniqueKey<PostManyUniTagsRecord> KEY_POST_MANY_UNI_TAGS_PRIMARY = UniqueKeys0.KEY_POST_MANY_UNI_TAGS_PRIMARY;
    public static final UniqueKey<PostOneRecord> KEY_POST_ONE_PRIMARY = UniqueKeys0.KEY_POST_ONE_PRIMARY;
    public static final UniqueKey<PostOneBiRecord> KEY_POST_ONE_BI_PRIMARY = UniqueKeys0.KEY_POST_ONE_BI_PRIMARY;
    public static final UniqueKey<PostOneToOneRecord> KEY_POST_ONE_TO_ONE_PRIMARY = UniqueKeys0.KEY_POST_ONE_TO_ONE_PRIMARY;
    public static final UniqueKey<PostOneToOneBiRecord> KEY_POST_ONE_TO_ONE_BI_PRIMARY = UniqueKeys0.KEY_POST_ONE_TO_ONE_BI_PRIMARY;
    public static final UniqueKey<PostOneUniRecord> KEY_POST_ONE_UNI_PRIMARY = UniqueKeys0.KEY_POST_ONE_UNI_PRIMARY;
    public static final UniqueKey<PostWithCollectionRecord> KEY_POST_WITH_COLLECTION_PRIMARY = UniqueKeys0.KEY_POST_WITH_COLLECTION_PRIMARY;
    public static final UniqueKey<SequenceGeneratorRecord> KEY_SEQUENCE_GENERATOR_PRIMARY = UniqueKeys0.KEY_SEQUENCE_GENERATOR_PRIMARY;
    public static final UniqueKey<StandaloneEntityRecord> KEY_STANDALONE_ENTITY_PRIMARY = UniqueKeys0.KEY_STANDALONE_ENTITY_PRIMARY;
    public static final UniqueKey<TableGeneratorRecord> KEY_TABLE_GENERATOR_PRIMARY = UniqueKeys0.KEY_TABLE_GENERATOR_PRIMARY;
    public static final UniqueKey<TagManyUniRecord> KEY_TAG_MANY_UNI_PRIMARY = UniqueKeys0.KEY_TAG_MANY_UNI_PRIMARY;
    public static final UniqueKey<UuidgeneratorRecord> KEY_UUIDGENERATOR_PRIMARY = UniqueKeys0.KEY_UUIDGENERATOR_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookAuthorRecord, AuthorManyjRecord> FK412BCVQ3OL3GBFQ6W727JJ9NV = ForeignKeys0.FK412BCVQ3OL3GBFQ6W727JJ9NV;
    public static final ForeignKey<BookAuthorRecord, BookManyjRecord> FKBO8DRQ2LKNC77OLAJ3KKBJH4 = ForeignKeys0.FKBO8DRQ2LKNC77OLAJ3KKBJH4;
    public static final ForeignKey<BookManyBiAuthorsRecord, BookManyBiRecord> FKLTSP8HKRUSHUK2TIAB4OAEXAQ = ForeignKeys0.FKLTSP8HKRUSHUK2TIAB4OAEXAQ;
    public static final ForeignKey<BookManyBiAuthorsRecord, AuthorManyBiRecord> FKA9KDM0F4X1KPV93HJW2E296HE = ForeignKeys0.FKA9KDM0F4X1KPV93HJW2E296HE;
    public static final ForeignKey<Child1jtRecord, ParentJtRecord> FKA5914KNN9X6NGC5DM0BIJQCLN = ForeignKeys0.FKA5914KNN9X6NGC5DM0BIJQCLN;
    public static final ForeignKey<Child2jtRecord, ParentJtRecord> FKSF48FL156H7AYPRFQSCHBN38P = ForeignKeys0.FKSF48FL156H7AYPRFQSCHBN38P;
    public static final ForeignKey<PostCommentManyRecord, PostOneRecord> FKIJQORVAAWMHGNKX917PS7MFP9 = ForeignKeys0.FKIJQORVAAWMHGNKX917PS7MFP9;
    public static final ForeignKey<PostCommentManyBiRecord, PostOneBiRecord> FKQDJUHSGS3OPNLXT26S15U0YQF = ForeignKeys0.FKQDJUHSGS3OPNLXT26S15U0YQF;
    public static final ForeignKey<PostCommentUniManyRecord, PostOneUniRecord> FKE4H8SRREB0UVU98PBCCFIUQ16 = ForeignKeys0.FKE4H8SRREB0UVU98PBCCFIUQ16;
    public static final ForeignKey<PostDetailsOneRecord, PostOneToOneRecord> FK8VWH77YWL2HRLWQSIETMRAOB0 = ForeignKeys0.FK8VWH77YWL2HRLWQSIETMRAOB0;
    public static final ForeignKey<PostDetailsOneBiRecord, PostOneToOneBiRecord> FKSBVJ5N18KTN1LC7A1UC1AUJI0 = ForeignKeys0.FKSBVJ5N18KTN1LC7A1UC1AUJI0;
    public static final ForeignKey<PostManyUniTagsRecord, PostManyUniRecord> FK9L4UCWPY3694X8AENS5TKT751 = ForeignKeys0.FK9L4UCWPY3694X8AENS5TKT751;
    public static final ForeignKey<PostManyUniTagsRecord, TagManyUniRecord> FKNUXK5IFM2NP8MUXKNV1XOATXL = ForeignKeys0.FKNUXK5IFM2NP8MUXKNV1XOATXL;
    public static final ForeignKey<PostWithCollectionListOfComplexRecord, PostWithCollectionRecord> FKCYYJ9CLP6U114UCY5D6TX8XH9 = ForeignKeys0.FKCYYJ9CLP6U114UCY5D6TX8XH9;
    public static final ForeignKey<PostWithCollectionListOfStringsRecord, PostWithCollectionRecord> FKED0FRWO7QVBY7K5GPFRVWUT2I = ForeignKeys0.FKED0FRWO7QVBY7K5GPFRVWUT2I;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AuthorManyjRecord, Long> IDENTITY_AUTHOR_MANYJ = Internal.createIdentity(AuthorManyj.AUTHOR_MANYJ, AuthorManyj.AUTHOR_MANYJ.ID);
        public static Identity<AuthorManyBiRecord, Long> IDENTITY_AUTHOR_MANY_BI = Internal.createIdentity(AuthorManyBi.AUTHOR_MANY_BI, AuthorManyBi.AUTHOR_MANY_BI.ID);
        public static Identity<BookManyjRecord, Long> IDENTITY_BOOK_MANYJ = Internal.createIdentity(BookManyj.BOOK_MANYJ, BookManyj.BOOK_MANYJ.ID);
        public static Identity<BookManyBiRecord, Long> IDENTITY_BOOK_MANY_BI = Internal.createIdentity(BookManyBi.BOOK_MANY_BI, BookManyBi.BOOK_MANY_BI.ID);
        public static Identity<Child1msRecord, Long> IDENTITY_CHILD1MS = Internal.createIdentity(Child1ms.CHILD1MS, Child1ms.CHILD1MS.ID);
        public static Identity<Child2msRecord, Long> IDENTITY_CHILD2MS = Internal.createIdentity(Child2ms.CHILD2MS, Child2ms.CHILD2MS.ID);
        public static Identity<IdentityGeneratorRecord, Long> IDENTITY_IDENTITY_GENERATOR = Internal.createIdentity(IdentityGenerator.IDENTITY_GENERATOR, IdentityGenerator.IDENTITY_GENERATOR.ID);
        public static Identity<ParentJtRecord, Long> IDENTITY_PARENT_JT = Internal.createIdentity(ParentJt.PARENT_JT, ParentJt.PARENT_JT.ID);
        public static Identity<ParentStRecord, Long> IDENTITY_PARENT_ST = Internal.createIdentity(ParentSt.PARENT_ST, ParentSt.PARENT_ST.ID);
        public static Identity<PostCommentManyRecord, Long> IDENTITY_POST_COMMENT_MANY = Internal.createIdentity(PostCommentMany.POST_COMMENT_MANY, PostCommentMany.POST_COMMENT_MANY.ID);
        public static Identity<PostCommentManyBiRecord, Long> IDENTITY_POST_COMMENT_MANY_BI = Internal.createIdentity(PostCommentManyBi.POST_COMMENT_MANY_BI, PostCommentManyBi.POST_COMMENT_MANY_BI.ID);
        public static Identity<PostCommentUniManyRecord, Long> IDENTITY_POST_COMMENT_UNI_MANY = Internal.createIdentity(PostCommentUniMany.POST_COMMENT_UNI_MANY, PostCommentUniMany.POST_COMMENT_UNI_MANY.ID);
        public static Identity<PostManyUniRecord, Long> IDENTITY_POST_MANY_UNI = Internal.createIdentity(PostManyUni.POST_MANY_UNI, PostManyUni.POST_MANY_UNI.ID);
        public static Identity<PostOneRecord, Long> IDENTITY_POST_ONE = Internal.createIdentity(PostOne.POST_ONE, PostOne.POST_ONE.ID);
        public static Identity<PostOneBiRecord, Long> IDENTITY_POST_ONE_BI = Internal.createIdentity(PostOneBi.POST_ONE_BI, PostOneBi.POST_ONE_BI.ID);
        public static Identity<PostOneToOneRecord, Long> IDENTITY_POST_ONE_TO_ONE = Internal.createIdentity(PostOneToOne.POST_ONE_TO_ONE, PostOneToOne.POST_ONE_TO_ONE.ID);
        public static Identity<PostOneToOneBiRecord, Long> IDENTITY_POST_ONE_TO_ONE_BI = Internal.createIdentity(PostOneToOneBi.POST_ONE_TO_ONE_BI, PostOneToOneBi.POST_ONE_TO_ONE_BI.ID);
        public static Identity<PostWithCollectionRecord, Long> IDENTITY_POST_WITH_COLLECTION = Internal.createIdentity(PostWithCollection.POST_WITH_COLLECTION, PostWithCollection.POST_WITH_COLLECTION.ID);
        public static Identity<TagManyUniRecord, Long> IDENTITY_TAG_MANY_UNI = Internal.createIdentity(TagManyUni.TAG_MANY_UNI, TagManyUni.TAG_MANY_UNI.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AssigneduuidgeneratorRecord> KEY_ASSIGNEDUUIDGENERATOR_PRIMARY = Internal.createUniqueKey(Assigneduuidgenerator.ASSIGNEDUUIDGENERATOR, "KEY_assigneduuidgenerator_PRIMARY", Assigneduuidgenerator.ASSIGNEDUUIDGENERATOR.ID);
        public static final UniqueKey<AuthorManyjRecord> KEY_AUTHOR_MANYJ_PRIMARY = Internal.createUniqueKey(AuthorManyj.AUTHOR_MANYJ, "KEY_author_manyj_PRIMARY", AuthorManyj.AUTHOR_MANYJ.ID);
        public static final UniqueKey<AuthorManyBiRecord> KEY_AUTHOR_MANY_BI_PRIMARY = Internal.createUniqueKey(AuthorManyBi.AUTHOR_MANY_BI, "KEY_author_many_bi_PRIMARY", AuthorManyBi.AUTHOR_MANY_BI.ID);
        public static final UniqueKey<AuthorManyBiRecord> KEY_AUTHOR_MANY_BI_UK_81A5W9QC9SSM6XLY74RM34B4A = Internal.createUniqueKey(AuthorManyBi.AUTHOR_MANY_BI, "KEY_author_many_bi_UK_81a5w9qc9ssm6xly74rm34b4a", AuthorManyBi.AUTHOR_MANY_BI.NAME);
        public static final UniqueKey<BookAuthorRecord> KEY_BOOK_AUTHOR_PRIMARY = Internal.createUniqueKey(BookAuthor.BOOK_AUTHOR, "KEY_book_author_PRIMARY", BookAuthor.BOOK_AUTHOR.AUTHOR_ID, BookAuthor.BOOK_AUTHOR.BOOK_ID);
        public static final UniqueKey<BookManyjRecord> KEY_BOOK_MANYJ_PRIMARY = Internal.createUniqueKey(BookManyj.BOOK_MANYJ, "KEY_book_manyj_PRIMARY", BookManyj.BOOK_MANYJ.ID);
        public static final UniqueKey<BookManyBiRecord> KEY_BOOK_MANY_BI_PRIMARY = Internal.createUniqueKey(BookManyBi.BOOK_MANY_BI, "KEY_book_many_bi_PRIMARY", BookManyBi.BOOK_MANY_BI.ID);
        public static final UniqueKey<BookManyBiAuthorsRecord> KEY_BOOK_MANY_BI_AUTHORS_PRIMARY = Internal.createUniqueKey(BookManyBiAuthors.BOOK_MANY_BI_AUTHORS, "KEY_book_many_bi_authors_PRIMARY", BookManyBiAuthors.BOOK_MANY_BI_AUTHORS.BOOKS_ID, BookManyBiAuthors.BOOK_MANY_BI_AUTHORS.AUTHORS_ID);
        public static final UniqueKey<Child1jtRecord> KEY_CHILD1JT_PRIMARY = Internal.createUniqueKey(Child1jt.CHILD1JT, "KEY_child1jt_PRIMARY", Child1jt.CHILD1JT.ID);
        public static final UniqueKey<Child1msRecord> KEY_CHILD1MS_PRIMARY = Internal.createUniqueKey(Child1ms.CHILD1MS, "KEY_child1ms_PRIMARY", Child1ms.CHILD1MS.ID);
        public static final UniqueKey<Child1tpcRecord> KEY_CHILD1TPC_PRIMARY = Internal.createUniqueKey(Child1tpc.CHILD1TPC, "KEY_child1tpc_PRIMARY", Child1tpc.CHILD1TPC.ID);
        public static final UniqueKey<Child2jtRecord> KEY_CHILD2JT_PRIMARY = Internal.createUniqueKey(Child2jt.CHILD2JT, "KEY_child2jt_PRIMARY", Child2jt.CHILD2JT.ID);
        public static final UniqueKey<Child2msRecord> KEY_CHILD2MS_PRIMARY = Internal.createUniqueKey(Child2ms.CHILD2MS, "KEY_child2ms_PRIMARY", Child2ms.CHILD2MS.ID);
        public static final UniqueKey<Child2tpcRecord> KEY_CHILD2TPC_PRIMARY = Internal.createUniqueKey(Child2tpc.CHILD2TPC, "KEY_child2tpc_PRIMARY", Child2tpc.CHILD2TPC.ID);
        public static final UniqueKey<HibernateSequencesRecord> KEY_HIBERNATE_SEQUENCES_PRIMARY = Internal.createUniqueKey(HibernateSequences.HIBERNATE_SEQUENCES, "KEY_hibernate_sequences_PRIMARY", HibernateSequences.HIBERNATE_SEQUENCES.SEQUENCE_NAME);
        public static final UniqueKey<IdentityGeneratorRecord> KEY_IDENTITY_GENERATOR_PRIMARY = Internal.createUniqueKey(IdentityGenerator.IDENTITY_GENERATOR, "KEY_identity_generator_PRIMARY", IdentityGenerator.IDENTITY_GENERATOR.ID);
        public static final UniqueKey<ParenttpcRecord> KEY_PARENTTPC_PRIMARY = Internal.createUniqueKey(Parenttpc.PARENTTPC, "KEY_parenttpc_PRIMARY", Parenttpc.PARENTTPC.ID);
        public static final UniqueKey<ParentJtRecord> KEY_PARENT_JT_PRIMARY = Internal.createUniqueKey(ParentJt.PARENT_JT, "KEY_parent_jt_PRIMARY", ParentJt.PARENT_JT.ID);
        public static final UniqueKey<ParentStRecord> KEY_PARENT_ST_PRIMARY = Internal.createUniqueKey(ParentSt.PARENT_ST, "KEY_parent_st_PRIMARY", ParentSt.PARENT_ST.ID);
        public static final UniqueKey<PooledSequenceGeneratorRecord> KEY_POOLED_SEQUENCE_GENERATOR_PRIMARY = Internal.createUniqueKey(PooledSequenceGenerator.POOLED_SEQUENCE_GENERATOR, "KEY_pooled_sequence_generator_PRIMARY", PooledSequenceGenerator.POOLED_SEQUENCE_GENERATOR.ID);
        public static final UniqueKey<PostCommentManyRecord> KEY_POST_COMMENT_MANY_PRIMARY = Internal.createUniqueKey(PostCommentMany.POST_COMMENT_MANY, "KEY_post_comment_many_PRIMARY", PostCommentMany.POST_COMMENT_MANY.ID);
        public static final UniqueKey<PostCommentManyBiRecord> KEY_POST_COMMENT_MANY_BI_PRIMARY = Internal.createUniqueKey(PostCommentManyBi.POST_COMMENT_MANY_BI, "KEY_post_comment_many_bi_PRIMARY", PostCommentManyBi.POST_COMMENT_MANY_BI.ID);
        public static final UniqueKey<PostCommentUniManyRecord> KEY_POST_COMMENT_UNI_MANY_PRIMARY = Internal.createUniqueKey(PostCommentUniMany.POST_COMMENT_UNI_MANY, "KEY_post_comment_uni_many_PRIMARY", PostCommentUniMany.POST_COMMENT_UNI_MANY.ID);
        public static final UniqueKey<PostDetailsOneRecord> KEY_POST_DETAILS_ONE_PRIMARY = Internal.createUniqueKey(PostDetailsOne.POST_DETAILS_ONE, "KEY_post_details_one_PRIMARY", PostDetailsOne.POST_DETAILS_ONE.POST_ID);
        public static final UniqueKey<PostDetailsOneBiRecord> KEY_POST_DETAILS_ONE_BI_PRIMARY = Internal.createUniqueKey(PostDetailsOneBi.POST_DETAILS_ONE_BI, "KEY_post_details_one_bi_PRIMARY", PostDetailsOneBi.POST_DETAILS_ONE_BI.POST_ID);
        public static final UniqueKey<PostManyUniRecord> KEY_POST_MANY_UNI_PRIMARY = Internal.createUniqueKey(PostManyUni.POST_MANY_UNI, "KEY_post_many_uni_PRIMARY", PostManyUni.POST_MANY_UNI.ID);
        public static final UniqueKey<PostManyUniTagsRecord> KEY_POST_MANY_UNI_TAGS_PRIMARY = Internal.createUniqueKey(PostManyUniTags.POST_MANY_UNI_TAGS, "KEY_post_many_uni_tags_PRIMARY", PostManyUniTags.POST_MANY_UNI_TAGS.POST_MANY_UNI_ID, PostManyUniTags.POST_MANY_UNI_TAGS.TAGS_ID);
        public static final UniqueKey<PostOneRecord> KEY_POST_ONE_PRIMARY = Internal.createUniqueKey(PostOne.POST_ONE, "KEY_post_one_PRIMARY", PostOne.POST_ONE.ID);
        public static final UniqueKey<PostOneBiRecord> KEY_POST_ONE_BI_PRIMARY = Internal.createUniqueKey(PostOneBi.POST_ONE_BI, "KEY_post_one_bi_PRIMARY", PostOneBi.POST_ONE_BI.ID);
        public static final UniqueKey<PostOneToOneRecord> KEY_POST_ONE_TO_ONE_PRIMARY = Internal.createUniqueKey(PostOneToOne.POST_ONE_TO_ONE, "KEY_post_one_to_one_PRIMARY", PostOneToOne.POST_ONE_TO_ONE.ID);
        public static final UniqueKey<PostOneToOneBiRecord> KEY_POST_ONE_TO_ONE_BI_PRIMARY = Internal.createUniqueKey(PostOneToOneBi.POST_ONE_TO_ONE_BI, "KEY_post_one_to_one_bi_PRIMARY", PostOneToOneBi.POST_ONE_TO_ONE_BI.ID);
        public static final UniqueKey<PostOneUniRecord> KEY_POST_ONE_UNI_PRIMARY = Internal.createUniqueKey(PostOneUni.POST_ONE_UNI, "KEY_post_one_uni_PRIMARY", PostOneUni.POST_ONE_UNI.ID1, PostOneUni.POST_ONE_UNI.ID2);
        public static final UniqueKey<PostWithCollectionRecord> KEY_POST_WITH_COLLECTION_PRIMARY = Internal.createUniqueKey(PostWithCollection.POST_WITH_COLLECTION, "KEY_post_with_collection_PRIMARY", PostWithCollection.POST_WITH_COLLECTION.ID);
        public static final UniqueKey<SequenceGeneratorRecord> KEY_SEQUENCE_GENERATOR_PRIMARY = Internal.createUniqueKey(SequenceGenerator.SEQUENCE_GENERATOR, "KEY_sequence_generator_PRIMARY", SequenceGenerator.SEQUENCE_GENERATOR.ID);
        public static final UniqueKey<StandaloneEntityRecord> KEY_STANDALONE_ENTITY_PRIMARY = Internal.createUniqueKey(StandaloneEntity.STANDALONE_ENTITY, "KEY_standalone_entity_PRIMARY", StandaloneEntity.STANDALONE_ENTITY.ID);
        public static final UniqueKey<TableGeneratorRecord> KEY_TABLE_GENERATOR_PRIMARY = Internal.createUniqueKey(TableGenerator.TABLE_GENERATOR, "KEY_table_generator_PRIMARY", TableGenerator.TABLE_GENERATOR.ID);
        public static final UniqueKey<TagManyUniRecord> KEY_TAG_MANY_UNI_PRIMARY = Internal.createUniqueKey(TagManyUni.TAG_MANY_UNI, "KEY_tag_many_uni_PRIMARY", TagManyUni.TAG_MANY_UNI.ID);
        public static final UniqueKey<UuidgeneratorRecord> KEY_UUIDGENERATOR_PRIMARY = Internal.createUniqueKey(Uuidgenerator.UUIDGENERATOR, "KEY_uuidgenerator_PRIMARY", Uuidgenerator.UUIDGENERATOR.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookAuthorRecord, AuthorManyjRecord> FK412BCVQ3OL3GBFQ6W727JJ9NV = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_AUTHOR_MANYJ_PRIMARY, BookAuthor.BOOK_AUTHOR, "FK412bcvq3ol3gbfq6w727jj9nv", BookAuthor.BOOK_AUTHOR.AUTHOR_ID);
        public static final ForeignKey<BookAuthorRecord, BookManyjRecord> FKBO8DRQ2LKNC77OLAJ3KKBJH4 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_BOOK_MANYJ_PRIMARY, BookAuthor.BOOK_AUTHOR, "FKbo8drq2lknc77olaj3kkbjh4", BookAuthor.BOOK_AUTHOR.BOOK_ID);
        public static final ForeignKey<BookManyBiAuthorsRecord, BookManyBiRecord> FKLTSP8HKRUSHUK2TIAB4OAEXAQ = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_BOOK_MANY_BI_PRIMARY, BookManyBiAuthors.BOOK_MANY_BI_AUTHORS, "FKltsp8hkrushuk2tiab4oaexaq", BookManyBiAuthors.BOOK_MANY_BI_AUTHORS.BOOKS_ID);
        public static final ForeignKey<BookManyBiAuthorsRecord, AuthorManyBiRecord> FKA9KDM0F4X1KPV93HJW2E296HE = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_AUTHOR_MANY_BI_PRIMARY, BookManyBiAuthors.BOOK_MANY_BI_AUTHORS, "FKa9kdm0f4x1kpv93hjw2e296he", BookManyBiAuthors.BOOK_MANY_BI_AUTHORS.AUTHORS_ID);
        public static final ForeignKey<Child1jtRecord, ParentJtRecord> FKA5914KNN9X6NGC5DM0BIJQCLN = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_PARENT_JT_PRIMARY, Child1jt.CHILD1JT, "FKa5914knn9x6ngc5dm0bijqcln", Child1jt.CHILD1JT.ID);
        public static final ForeignKey<Child2jtRecord, ParentJtRecord> FKSF48FL156H7AYPRFQSCHBN38P = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_PARENT_JT_PRIMARY, Child2jt.CHILD2JT, "FKsf48fl156h7ayprfqschbn38p", Child2jt.CHILD2JT.ID);
        public static final ForeignKey<PostCommentManyRecord, PostOneRecord> FKIJQORVAAWMHGNKX917PS7MFP9 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_ONE_PRIMARY, PostCommentMany.POST_COMMENT_MANY, "FKijqorvaawmhgnkx917ps7mfp9", PostCommentMany.POST_COMMENT_MANY.POST_ID);
        public static final ForeignKey<PostCommentManyBiRecord, PostOneBiRecord> FKQDJUHSGS3OPNLXT26S15U0YQF = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_ONE_BI_PRIMARY, PostCommentManyBi.POST_COMMENT_MANY_BI, "FKqdjuhsgs3opnlxt26s15u0yqf", PostCommentManyBi.POST_COMMENT_MANY_BI.POST_ID);
        public static final ForeignKey<PostCommentUniManyRecord, PostOneUniRecord> FKE4H8SRREB0UVU98PBCCFIUQ16 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_ONE_UNI_PRIMARY, PostCommentUniMany.POST_COMMENT_UNI_MANY, "FKe4h8srreb0uvu98pbccfiuq16", PostCommentUniMany.POST_COMMENT_UNI_MANY.POST_ID1, PostCommentUniMany.POST_COMMENT_UNI_MANY.POST_ID2);
        public static final ForeignKey<PostDetailsOneRecord, PostOneToOneRecord> FK8VWH77YWL2HRLWQSIETMRAOB0 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_ONE_TO_ONE_PRIMARY, PostDetailsOne.POST_DETAILS_ONE, "FK8vwh77ywl2hrlwqsietmraob0", PostDetailsOne.POST_DETAILS_ONE.POST_ID);
        public static final ForeignKey<PostDetailsOneBiRecord, PostOneToOneBiRecord> FKSBVJ5N18KTN1LC7A1UC1AUJI0 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_ONE_TO_ONE_BI_PRIMARY, PostDetailsOneBi.POST_DETAILS_ONE_BI, "FKsbvj5n18ktn1lc7a1uc1auji0", PostDetailsOneBi.POST_DETAILS_ONE_BI.POST_ID);
        public static final ForeignKey<PostManyUniTagsRecord, PostManyUniRecord> FK9L4UCWPY3694X8AENS5TKT751 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_MANY_UNI_PRIMARY, PostManyUniTags.POST_MANY_UNI_TAGS, "FK9l4ucwpy3694x8aens5tkt751", PostManyUniTags.POST_MANY_UNI_TAGS.POST_MANY_UNI_ID);
        public static final ForeignKey<PostManyUniTagsRecord, TagManyUniRecord> FKNUXK5IFM2NP8MUXKNV1XOATXL = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_TAG_MANY_UNI_PRIMARY, PostManyUniTags.POST_MANY_UNI_TAGS, "FKnuxk5ifm2np8muxknv1xoatxl", PostManyUniTags.POST_MANY_UNI_TAGS.TAGS_ID);
        public static final ForeignKey<PostWithCollectionListOfComplexRecord, PostWithCollectionRecord> FKCYYJ9CLP6U114UCY5D6TX8XH9 = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_WITH_COLLECTION_PRIMARY, PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX, "FKcyyj9clp6u114ucy5d6tx8xh9", PostWithCollectionListOfComplex.POST_WITH_COLLECTION_LIST_OF_COMPLEX.POST_WITH_COLLECTION_ID);
        public static final ForeignKey<PostWithCollectionListOfStringsRecord, PostWithCollectionRecord> FKED0FRWO7QVBY7K5GPFRVWUT2I = Internal.createForeignKey(me.vukas.jooq.db.Keys.KEY_POST_WITH_COLLECTION_PRIMARY, PostWithCollectionListOfStrings.POST_WITH_COLLECTION_LIST_OF_STRINGS, "FKed0frwo7qvby7k5gpfrvwut2i", PostWithCollectionListOfStrings.POST_WITH_COLLECTION_LIST_OF_STRINGS.POST_WITH_COLLECTION_ID);
    }
}
