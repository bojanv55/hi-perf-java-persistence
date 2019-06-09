/**
 * Describes ways to use identifiers in hibernate
 * In summary (for numerical identifiers):
 *  - If database supports sequences - use sequence (possibly with pooled optimization)
 *  - If database supports AUTO_INCREMENT - use identity (even if it cannot be batched - it is still faster than table gen.)
 */
package me.vukas.hiperfjavapersistence.entity.identifier;