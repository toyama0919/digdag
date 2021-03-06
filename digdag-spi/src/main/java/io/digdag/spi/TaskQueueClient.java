package io.digdag.spi;

import java.util.List;

public interface TaskQueueClient
{
    List<TaskRequest> lockSharedTasks(int limit, String agentId, int lockSeconds, long maxSleepMillis);

    // TODO lockTasks (of custom queue) is not implemented yet

    void taskHeartbeat(int siteId, List<String> lockedIds, String agentId, int lockSeconds)
        throws TaskStateException;
}
