package com.glektarssza.player_immunity.common;

public enum EntityListMode {
    /**
     * Match only the entity in the list.
     *
     * This is equivalent to a more traditional "whitelist".
     */
    ONLY,

    /**
     * Match any entity except those in the list.
     *
     * This is equivalent to a more traditional "blacklist".
     */
    ANY_EXCEPT;
}
