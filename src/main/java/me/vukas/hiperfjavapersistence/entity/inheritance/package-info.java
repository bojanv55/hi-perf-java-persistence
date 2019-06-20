/**
 * SINGLE_TABLE - best performance, but no null check in children and too many null columns if too many children
 * JOINED - for higher number of subclasses and no need for polymorphic queries
 * TABLE_PER_CLASS - least effective for polymorphic
 * "@MappedSuperclass" - polymorphic queries are not permitted anymore, but same performance as SINGLE_TABLE
 */
package me.vukas.hiperfjavapersistence.entity.inheritance;
