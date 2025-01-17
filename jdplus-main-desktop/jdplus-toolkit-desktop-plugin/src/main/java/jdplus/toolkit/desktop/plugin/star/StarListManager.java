package jdplus.toolkit.desktop.plugin.star;

import jdplus.main.desktop.design.GlobalService;
import jdplus.toolkit.desktop.plugin.util.LazyGlobalService;
import jdplus.toolkit.base.tsp.DataSource;
import ec.util.various.swing.OnEDT;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@GlobalService
public final class StarListManager implements Iterable<DataSource> {

    @NonNull
    public static StarListManager get() {
        return LazyGlobalService.get(StarListManager.class, StarListManager::new);
    }

    private final Set<DataSource> list;

    private StarListManager() {
        list = new HashSet<>();
    }

    @OnEDT
    public void clear() {
        list.clear();
    }

    @OnEDT
    public void toggle(DataSource item) {
        if (list.contains(item))
            list.remove(item);
        else
            list.add(item);
    }

    @OnEDT
    @Override
    public Iterator<DataSource> iterator() {
        return list.iterator();
    }

    @OnEDT
    public boolean isStarred(DataSource dataSource) {
        return list.contains(dataSource);
    }
}
