/**************************************************************************************** 
 * 众能联合数字技术有限公司 | All Rights Reserved                             *
 ****************************************************************************************/
package domain.apimetrics.collector;

import domain.apimetrics.collector.entity.vo.RequestInfo;
import domain.apimetrics.storage.MetricsStorage;
import org.apache.commons.lang3.StringUtils;

/**
 * @version 1.0<br>
 * @description: <br>
 * @author: <a href="bianchangcai@znlh.com">Bianchangcai</a>
 * @date: 2022-10-22 10:08
 */
public class MetricsCollector {

    // 基于接口而非实现编程
    private MetricsStorage metricsStorage;

    // 依赖注入
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    // 用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }

}
