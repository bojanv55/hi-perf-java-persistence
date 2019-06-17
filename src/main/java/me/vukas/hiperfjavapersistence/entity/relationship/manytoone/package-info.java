/**
 * This should be fastest way to create one to many association. Many side is not
 * loaded eagerly (but only when needed using queries). Not natural usage in code, since
 * we need to set post on comment (comment.setPost(post)) - which is unnatural
 */
package me.vukas.hiperfjavapersistence.entity.relationship.manytoone;
