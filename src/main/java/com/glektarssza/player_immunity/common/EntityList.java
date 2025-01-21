package com.glektarssza.player_immunity.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import net.minecraft.util.ResourceLocation;

/**
 * An object that encapsulates a list of entities.
 */
public class EntityList {
    // #region Public Properties

    /**
     * A list of entities resource locations which this list matches against.
     */
    public final List<ResourceLocation> entityResourceLocations;

    /**
     * The matching mode this entity list is in.
     */
    public EntityListMode mode;

    // #endregion

    // #region Constructors

    /**
     * Create a new instance.
     *
     * Initialize this instance with no matching entities and in "match only
     * entities in the list" mode.
     */
    public EntityList() {
        this.mode = EntityListMode.ONLY;
        this.entityResourceLocations = new LinkedList<ResourceLocation>();
    }

    /**
     * Create a new instance.
     *
     * Initialize this instance with the provided entity resource locations and
     * in "match only entities in the list" mode.
     *
     * @param entityResourceLocations The initial set of entity resource
     *        locations to seed the list with.
     */
    public EntityList(ResourceLocation... entityResourceLocations) {
        this.entityResourceLocations = new LinkedList<ResourceLocation>(
            Arrays.asList(entityResourceLocations));
    }

    /**
     * Create a new instance.
     *
     * Initialize this instance with the provided entity resource locations and
     * matching mode.
     *
     * @param mode The matching mode to set the new instance to.
     * @param entityResourceLocations The initial set of entity resource
     *        locations to seed the list with.
     */
    public EntityList(EntityListMode mode,
        ResourceLocation... entityResourceLocations) {
        this.mode = mode;
        this.entityResourceLocations = new LinkedList<ResourceLocation>(
            Arrays.asList(entityResourceLocations));
    }

    /**
     * Create a new instance.
     *
     * Initialize this instance with the provided entity resource locations and
     * in "match only entities in the list" mode.
     *
     * @param entityResourceLocations The initial set of entity resource
     *        locations to seed the list with.
     */
    public EntityList(EntityListMode mode,
        List<ResourceLocation> entityResourceLocations) {
        this.mode = mode;
        this.entityResourceLocations = new LinkedList<ResourceLocation>(
            entityResourceLocations);
    }

    /**
     * Create a new instance.
     *
     * Initialize this instance with the provided entity resource locations and
     * matching mode.
     *
     * @param entityResourceLocations The initial set of entity resource
     *        locations to seed the list with.
     */
    public EntityList(List<ResourceLocation> entityResourceLocations) {
        this.entityResourceLocations = new LinkedList<ResourceLocation>(
            entityResourceLocations);
    }

    // #endregion

    // #region Public Methods

    // #endregion
}
