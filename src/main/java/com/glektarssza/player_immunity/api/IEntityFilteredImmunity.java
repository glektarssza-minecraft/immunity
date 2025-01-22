package com.glektarssza.player_immunity.api;

import java.util.Arrays;

import javax.annotation.Nonnull;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;

/**
 * An interface which provides a base for immunities that are filtered by the
 * entity that is the source of the incoming "thing" that the immunity is
 * protecting against.
 */
public interface IEntityFilteredImmunity extends IImmunityBase {
    // #region Methods

    /**
     * Get the filter mode that this immunity is using.
     *
     * @return The filter mode that this immunity is using.
     */
    @Nonnull
    public FilterMode getFilterMode();

    /**
     * Get the list of entity types that this immunity is filtering against.
     */
    @Nonnull
    public String[] getEntityTypes();

    /**
     * Add an entity type to the list of entity types that this immunity is
     * filtering against.
     *
     * @param entityType The entity type to add.
     */
    public void addEntityType(String entityType);

    /**
     * Add an entity type to the list of entity types that this immunity is
     * filtering against.
     *
     * @param entityType The entity type to add.
     */
    public default void addEntityType(Entity entityType) {
        this.addEntityType(EntityList.getEntityString(entityType));
    }

    /**
     * Remove an entity type from the list of entity types that this immunity is
     * filtering against.
     *
     * @param entityType The entity type to remove.
     */
    public void removeEntityType(String entityType);

    /**
     * Remove an entity type from the list of entity types that this immunity is
     * filtering against.
     *
     * @param entityType The entity type to remove.
     */
    public default void removeEntityType(Entity entityType) {
        this.removeEntityType(EntityList.getEntityString(entityType));
    }

    /**
     * Set the specified entity types as the list of entity types that this
     * immunity is filtering against.
     *
     * @param entityTypes The entity types to set.
     */
    public void setEntityTypes(String... entityTypes);

    /**
     * Set the specified entity types as the list of entity types that this
     * immunity is filtering against.
     *
     * @param entityTypes The entity types to set.
     */
    public default void setEntityTypes(Entity... entityTypes) {
        this.setEntityTypes(Arrays.stream(entityTypes)
            .map((entityType) -> EntityList.getEntityString(entityType))
            .toArray(String[]::new));
    }

    /**
     * Add the specified entity types to the list of entity types that this
     * immunity is filtering against.
     *
     * @param entityTypes The entity types to add.
     */
    public void addEntityTypes(String... entityTypes);

    /**
     * Add the specified entity types to the list of entity types that this
     * immunity is filtering against.
     *
     * @param entityTypes The entity types to add.
     */
    public default void addEntityTypes(Entity... entityTypes) {
        this.addEntityTypes(Arrays.stream(entityTypes)
            .map((entityType) -> EntityList.getEntityString(entityType))
            .toArray(String[]::new));
    }

    /**
     * Remove the specified entity types from the list of entity types that this
     * immunity is filtering against.
     *
     * @param entityTypes The entity types to remove.
     */
    public void removeEntityTypes(String... entityTypes);

    /**
     * Remove the specified entity types from the list of entity types that this
     * immunity is filtering against.
     *
     * @param entityTypes The entity types to remove.
     */
    public default void removeEntityTypes(Entity... entityTypes) {
        this.removeEntityTypes(Arrays.stream(entityTypes)
            .map((entityType) -> EntityList.getEntityString(entityType))
            .toArray(String[]::new));
    }

    /**
     * Clear the list of entity types that this immunity is filtering against.
     */
    public default void clearEntityTypes() {
        this.setEntityTypes(new String[0]);
    }

    /**
     * Check if this immunity protects against a given entity source.
     *
     * @param entity The entity source to check.
     *
     * @return {@code true} if the entity source is protected against;
     *         {@code false} otherwise.
     */
    public boolean checkProtectsAgainst(Entity entity);

    // #endregion
}
