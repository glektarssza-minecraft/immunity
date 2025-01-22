package com.glektarssza.player_immunity.api;

import java.util.Arrays;

import javax.annotation.Nonnull;

import net.minecraft.util.DamageSource;

/**
 * An interface which provides a base for immunities that are filtered by the
 * damage that the immunity is protecting against.
 *
 */
public interface IDamageFilteredImmunity {
    // #region Methods

    /**
     * Get whether this immunity should consider direct sources.
     *
     * @return Whether this immunity should consider direct sources.
     */
    public boolean shouldConsiderDirectSources();

    /**
     * Get whether this immunity should consider indirect sources.
     *
     * @return Whether this immunity should consider indirect sources.
     */
    public boolean shouldConsiderIndirectSources();

    /**
     * Get the filter mode that this immunity is using.
     *
     * @return The filter mode that this immunity is using.
     */
    @Nonnull
    public FilterMode getFilterMode();

    /**
     * Get the list of damage types that this immunity is filtering against.
     */
    @Nonnull
    public String[] getDamageTypes();

    /**
     * Add a damage type to the list of damage types that this immunity is
     * filtering against.
     *
     * @param damageType The damage type to add.
     */
    public void addDamageType(String damageType);

    /**
     * Add a damage type to the list of damage types that this immunity is
     * filtering against.
     *
     * @param damageType The damage type to add.
     */
    public default void addDamageType(DamageSource damageType) {
        this.addDamageType(damageType.getDamageType());
    }

    /**
     * Remove a damage type from the list of damage types that this immunity is
     * filtering against.
     *
     * @param damageType The damage type to remove.
     */
    public void removeDamageType(String damageType);

    /**
     * Remove a damage type from the list of damage types that this immunity is
     * filtering against.
     *
     * @param damageType The damage type to remove.
     */
    public default void removeDamageType(DamageSource damageType) {
        this.removeDamageType(damageType.getDamageType());
    }

    /**
     * Set the specified damage types as the list of damage types that this
     * immunity is filtering against.
     *
     * @param damageTypes The damage types to set.
     */
    public void setDamageTypes(String... damageTypes);

    /**
     * Set the specified damage types as the list of damage types that this
     * immunity is filtering against.
     *
     * @param damageTypes The damage types to set.
     */
    public default void setDamageTypes(DamageSource... damageTypes) {
        this.setDamageTypes(Arrays.stream(damageTypes)
            .map(DamageSource::getDamageType)
            .toArray(String[]::new));
    }

    /**
     * Add the specified damage types to the list of damage types that this
     * immunity is filtering against.
     *
     * @param damageTypes The damage types to add.
     */
    public void addDamageTypes(String... damageTypes);

    /**
     * Add the specified damage types to the list of damage types that this
     * immunity is filtering against.
     *
     * @param damageTypes The damage types to add.
     */
    public default void addDamageTypes(DamageSource... damageTypes) {
        this.addDamageTypes(Arrays.stream(damageTypes)
            .map(DamageSource::getDamageType)
            .toArray(String[]::new));
    }

    /**
     * Remove the specified damage types from the list of damage types that this
     * immunity is filtering against.
     *
     * @param damageTypes The damage types to remove.
     */
    public void removeDamageTypes(String... damageTypes);

    /**
     * Remove the specified damage types from the list of damage types that this
     * immunity is filtering against.
     *
     * @param damageTypes The damage types to remove.
     */
    public default void removeDamageTypes(DamageSource... damageTypes) {
        this.removeDamageTypes(Arrays.stream(damageTypes)
            .map(DamageSource::getDamageType)
            .toArray(String[]::new));
    }

    /**
     * Clear the list of damage types that this immunity is filtering against.
     */
    public default void clearDamageTypes() {
        this.setDamageTypes(new String[0]);
    }

    /**
     * Check if this immunity protects against a given damage source.
     *
     * @param damageSource The damage source to check.
     *
     * @return {@code true} if the damage source is protected against;
     *         {@code false} otherwise.
     */
    public boolean checkProtectsAgainst(DamageSource damageSource);

    // #endregion
}
