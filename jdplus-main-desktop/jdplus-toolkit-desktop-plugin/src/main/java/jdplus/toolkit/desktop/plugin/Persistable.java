package jdplus.toolkit.desktop.plugin;

import org.checkerframework.checker.nullness.qual.NonNull;

public interface Persistable {

    @NonNull
    Config getConfig();

    void setConfig(@NonNull Config config) throws IllegalArgumentException;
}
