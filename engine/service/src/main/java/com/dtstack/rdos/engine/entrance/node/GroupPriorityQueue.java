package com.dtstack.rdos.engine.entrance.node;

import com.dtstack.rdos.engine.execution.base.JobClient;
import com.dtstack.rdos.engine.execution.base.components.OrderLinkedBlockingQueue;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * 执行引擎对应的优先级队列信息
 * Date: 2018/1/15
 * Company: www.dtstack.com
 * @author xuchao
 */

public class GroupPriorityQueue {

    private static final String DEFAULT_GROUP_NAME = "default";

    /**key: groupName*/
    private Map<String, OrderLinkedBlockingQueue<JobClient>> groupPriorityQueueMap = Maps.newHashMap();

    public GroupPriorityQueue(){
        groupPriorityQueueMap.put(DEFAULT_GROUP_NAME, new OrderLinkedBlockingQueue<>());
    }

    public void add(JobClient jobClient){
        String groupName = jobClient.getGroupName();
        groupName = groupName == null ? DEFAULT_GROUP_NAME : groupName;
        OrderLinkedBlockingQueue<JobClient> queue = groupPriorityQueueMap.computeIfAbsent(groupName,
                k -> new OrderLinkedBlockingQueue<>());

        queue.add(jobClient);
    }

    public Map<String, OrderLinkedBlockingQueue<JobClient>> getGroupPriorityQueueMap() {
        return groupPriorityQueueMap;
    }

    public Collection<OrderLinkedBlockingQueue<JobClient>> getOrderList(){
        return groupPriorityQueueMap.values();
    }
}
