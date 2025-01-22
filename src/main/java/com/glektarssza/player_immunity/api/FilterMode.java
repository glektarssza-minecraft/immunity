package com.glektarssza.player_immunity.api;

/**
 * An enumeration which provides the different kinds of filtering modes that are
 * supported.
 */
public enum FilterMode {
    /**
     * Only the specified items are considered.
     *
     * Identical to a more traditional "whitelist" approach.
     */
    ONLY,

    /**
     * All items are considered except for those specified.
     *
     * Identical to a more traditional "blacklist" approach.
     */
    ALL_EXCEPT;
}
