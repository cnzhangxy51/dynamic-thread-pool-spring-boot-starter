package cn.xyfv.middleware.dynamic.thread.pool.sdk.registry;
import cn.xyfv.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author cnzhangxy
 * @description 注册中心接口
 * @create 2024-05-12 16:21
 */
public interface IRegistry {

    /**
     * @Description: 上报所有线程池参数配置
     * @Param: [threadPoolEntities]
     * @return: void
     * @Author: cnzhangxy
     * @Date: 2024/7/31
     */
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    /**
    * @Description: 上报指定线程池参数配置
    * @Param: [threadPoolConfigEntity]
    * @return: void
    * @Author: cnzhangxy
    * @Date: 2024/7/31
    */
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
