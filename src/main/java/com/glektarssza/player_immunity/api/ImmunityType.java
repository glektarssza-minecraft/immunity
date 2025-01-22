package com.glektarssza.player_immunity.api;

/**
 * An enumeration of known immunity types.
 */
public enum ImmunityType {
    // #region Enumeration Values

    /**
     * Immunity from damage before reductions are applied or durability is
     * deducted.
     */
    DAMAGE,

    /**
     * Immunity from damage after reductions are applied or durability is
     * deducted.
     */
    HURT,

    /**
     * Immunity from status effects.
     */
    EFFECTS,

    /**
     * Immunity from being targeted by entities.
     */
    TARGETING,

    /**
     * Immunity from being knocked back.
     */
    KNOCK_BACK;

    // #endregion
}
