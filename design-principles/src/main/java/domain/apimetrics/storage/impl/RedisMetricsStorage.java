/**************************************************************************************** 
 * 众能联合数字技术有限公司 | All Rights Reserved                             *
 ****************************************************************************************/
package domain.apimetrics.storage.impl;

import domain.apimetrics.collector.entity.vo.RequestInfo;
import domain.apimetrics.storage.MetricsStorage;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0<br>
 * @description: <br>
 * @author: <a href="bianchangcai@znlh.com">Bianchangcai</a>
 * @date: 2022-10-22 13:41
 */
public class RedisMetricsStorage implements MetricsStorage {

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

}
