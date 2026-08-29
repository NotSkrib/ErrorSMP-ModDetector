/*
 * Decompiled with CFR 0.152.
 */
package xyz.nim.modDetectorPlugin.hackcheck;

public record HackDefinition(String id, String display, Mode mode, String key, boolean punish, boolean required) {

    public static enum Mode {
        TRANSLATE,
        KEYBIND,
        METEOR;

    }
}

