package me.alii.skeleton.managers.tasks;

import me.alii.skeleton.site.impl.AbstractSite;

import java.util.UUID;

/**
 * @author Alistair Smith
 * @since 05/05/2021
 **/
public interface ITaskManager {
    void add(AbstractSite task);

    void stop(UUID id);

    void delete();
    void delete(UUID id);
}
