package com.glektarssza.player_immunity.api;

import java.util.NoSuchElementException;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagString;

import net.minecraftforge.common.util.INBTSerializable;

/**
 * An enumeration of the known types of immunities.
 */
public enum ImmunityType implements INBTSerializable<NBTTagString> {
    // #region Enumeration Values

    /**
     * Immunity to damage before modifiers are applied and durability is
     * reduced.
     */
    DAMAGE,

    /**
     * Immunity to damage after modifiers are applied and durability is reduced.
     */
    HURT,

    /**
     * Immunity to status effects.
     */
    EFFECT,

    /**
     * Immunity to being targeted by entities.
     */
    TARGETING,

    /**
     * Immunity to being knocked back.
     */
    KNOCK_BACK;

    // #endregion

    // #region Static Fields

    /**
     * An array of all the values of the enumeration.
     */
    public static final ImmunityType[] VALUES = values();

    // #endregion

    // #region Static Methods

    /**
     * Try to get an immunity type from a string.
     *
     * @param name The name of the immunity type to try to try to get. Must be
     *        an exact match to the value returned by {@link #toString}.
     *
     * @return The immunity type that corresponds to the value of the given
     *         {@code name} parameter; {@code null} otherwise.
     */
    @Nullable
    public static ImmunityType tryFromString(String name) {
        for (ImmunityType type : VALUES) {
            if (type.toString().equals(name)) {
                return type;
            }
        }
        return null;
    }

    /**
     * Get an immunity type from a string.
     *
     * @param name The name of the immunity type to get. Must be an exact match
     *        to the value returned by {@link #toString}.
     *
     * @return The immunity type that corresponds to the given {@code name}
     *         parameter.
     *
     * @throws NoSuchElementException Thrown if no immunity type matching the
     *         given {@code name} parameter could be found.
     */
    public static ImmunityType fromString(String name)
        throws NoSuchElementException {
        ImmunityType type = tryFromString(name);
        if (type == null) {
            throw new NoSuchElementException(
                String.format("No immunity type found matching name '%s'",
                    name));
        }
        return type;
    }

    /**
     * Try to get an immunity type from a string.
     *
     * @param data The NBT string holding the name of the immunity type to try
     *        to get. Must be an exact match to the value returned by
     *        {@link #toString}.
     *
     * @return The immunity type that corresponds to the name held in the given
     *         {@code data} parameter; {@code null} otherwise.
     */
    @Nullable
    public static ImmunityType tryFromNBT(NBTTagString data) {
        return tryFromString(data.getString());
    }

    /**
     * Get an immunity type from a NBT string.
     *
     * @param data The NBT string holding the name of the immunity type to get.
     *        Must be an exact match to the value returned by {@link #toString}.
     *
     * @return The immunity type that corresponds to the name held in the given
     *         {@code data} parameter.
     *
     * @throws NoSuchElementException Thrown if no immunity type matching the
     *         name held in the given {@code data} parameter could be found.
     */
    public static ImmunityType fromNBT(NBTTagString data)
        throws NoSuchElementException {
        return fromString(data.getString());
    }

    // #endregion

    // #region Instance Methods

    /**
     * Get the name of this instance, in lower case.
     *
     * @return The name of this instance, in lower case.
     */
    @Override
    public String toString() {
        return name().toLowerCase();
    }

    /**
     * Serialize this instance to an NBT tag.
     *
     * @return An NBT tag representing this instance.
     */
    @Override
    public NBTTagString serializeNBT() {
        return new NBTTagString(toString());
    }

    /**
     * Deserialize this instance from an NBT tag.
     *
     * @param nbt The NBT tag to deserialize data into this instance from.
     *
     * @implNote This method is a no-op as enumeration values are immutable.
     *
     *           Use the {@link #tryFromNBT} or {@link #fromNBT} methods to get
     *           an value from a NBT tag.
     */
    @Override
    public void deserializeNBT(NBTTagString nbt) {
        // -- No-op
    }

    // #endregion
}
