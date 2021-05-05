package me.alii.skeleton.managers.tasks;

import me.alii.skeleton.site.impl.AbstractSite;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author Alistair Smith
 * @since 05/05/2021
 **/
public class TaskManager implements ITaskManager {
    private final HashMap<UUID, AbstractSite> siteHashMap = new HashMap<>();

    @Override
    public void add(AbstractSite site) {
        this.siteHashMap.put(site.getId(), site);
    }

    @Override
    public void stop(UUID id) {
        AbstractSite site = siteHashMap.get(id);

        if (site == null) {
            return;
        }

        // TODO: Messaging here to tell mutiny to stop the thread
        this.siteHashMap.remove(id);
    }

    @Override
    public void delete() {
        throw new NotImplementedException();
    }

    @Override
    public void delete(UUID id) {
        throw new NotImplementedException();
    }
}
