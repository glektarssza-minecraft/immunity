package com.glektarssza.player_immunity.api;

/**
 * An interface which provides a base for different types of immunities.
 */
public interface IImmunityBase {
    // #region Public Methods

    /**
     * Get the type of immunity.
     *
     * @return The type of immunity.
     */
    ImmunityType getType();

    // #endregion
}
