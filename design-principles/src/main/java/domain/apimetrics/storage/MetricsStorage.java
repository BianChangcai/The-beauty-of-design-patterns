/**************************************************************************************** 
 * 众能联合数字技术有限公司 | All Rights Reserved                             *
 ****************************************************************************************/
package domain.apimetrics.storage;

import domain.apimetrics.collector.entity.vo.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0<br>
 * @description: <br>
 * @author: <a href="bianchangcai@znlh.com">Bianchangcai</a>
 * @date: 2022-10-22 13:10
 */
public interface MetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    // 获取指定接口的指定时间范围内的请求信息
    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    // 获取指定时间范围内的接口请求信息
    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);

}
