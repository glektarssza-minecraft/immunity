package com.glektarssza.player_immunity.common;

/**
 * An enumeration which represents possible types of immunities.
 */
public enum ImmunityType {
    /**
     * Represents immunity to damage before reductions are applied.
     */
    DAMAGE,

    /**
     * Represents immunity to damage after reductions are applied.
     */
    HURT,

    /**
     * Represents immunity to targeting by entities.
     */
    TARGETING,

    /**
     * Represents immunity to status effects.
     */
    EFFECT,

    /**
     * Represents immunity to knock back.
     */
    KNOCK_BACK;
}
