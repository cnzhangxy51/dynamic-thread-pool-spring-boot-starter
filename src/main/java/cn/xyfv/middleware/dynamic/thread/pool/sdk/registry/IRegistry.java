package cn.xyfv.middleware.dynamic.thread.pool.sdk.registry;
import cn.xyfv.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * 注册中心接口
 * @author cnzhangxy
 * @since 2024-05-12 16:21
 */
public interface IRegistry {

    /**
     * 上报所有线程池参数配置
     * @param threadPoolEntities 线程池参数配置列表
     * @author cnzhangxy
     * @since 2024/7/31
     */
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    /**
    * 上报指定线程池参数配置
    * @param threadPoolConfigEntity 线程池参数配置
    * @author cnzhangxy
    * @since 2024/7/31
    */
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
