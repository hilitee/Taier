package com.dtstack.rdos.engine.service.db.mapper;

import com.dtstack.rdos.engine.service.db.dataobject.RdosEngineJobCache;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Reason:
 * Date: 2017/11/6
 * Company: www.dtstack.com
 * @author xuchao
 */

public interface RdosEngineJobCacheMapper {

    int insert(@Param("jobId")String jobId,  @Param("engineType") String engineType,
               @Param("computeType") Integer computeType, @Param("stage") int stage,
               @Param("jobInfo")String jobInfo, @Param("nodeAddress") String nodeAddress);

    int delete(@Param("jobId")String jobId);

    RdosEngineJobCache getOne(@Param("jobId")String jobId);

    int updateStage(@Param("jobId") String jobId, @Param("stage") Integer stage,@Param("nodeAddress") String nodeAddress);

    List<RdosEngineJobCache> listByStage(@Param("nodeAddress") String nodeAddress,@Param("stage") int stage);
}
