package cn.xyfv.middleware.dynamic.thread.pool.sdk.domain;

import cn.xyfv.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @program: dynamic-thread-pool
 * @description: 动态线程池服务,用于获取应用中的线程池信息
 * @author: cnzhangxy
 * @create: 2024-05-30 20:12
 **/
public interface IDynamicThreadPoolService {
    /**
     * @Description: 查询所有线程池
     * @Param: []
     * @return: java.util.List<ThreadPoolConfigEntity>
     * @Author: cnzhangxy
     * @Date: 2024/5/30
     */
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    /**
     * @Description: 查询指定线程池的配置
     * @Param: [threadPoolName]
     * @return: ThreadPoolConfigEntity
     * @Author: cnzhangxy
     * @Date: 2024/5/30
     */
    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    /**
     * @Description: 更新指定线程池配置
     * @Param: [threadPoolConfigEntity]
     * @return: void
     * @Author: cnzhangxy
     * @Date: 2024/5/30
     */
    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
