/**
 * Missing:
 *  - generate JOOQ database static model in java using testcontainers db (and liquibase).
 *  https://github.com/jOOQ/jOOQ/issues/6551
 *  - JOOQ should be able to map complex structures (eg one-to-many) using MapStruct to DTOs
 *  - testcontainers should be in-memory so when developing and writing tests, there is no need to
 *  restart containers and wait. https://github.com/testcontainers/testcontainers-java/issues/781
 */
package me.vukas.hiperfjavapersistence.service;
