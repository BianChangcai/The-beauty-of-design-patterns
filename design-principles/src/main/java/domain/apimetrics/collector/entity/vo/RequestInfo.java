/**************************************************************************************** 
 * 众能联合数字技术有限公司 | All Rights Reserved                             *
 ****************************************************************************************/
package domain.apimetrics.collector.entity.vo;

/**
 * @version 1.0<br>
 * @description: <br>
 * @author: <a href="bianchangcai@znlh.com">Bianchangcai</a>
 * @date: 2022-10-22 13:26
 */
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private long timestamp;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

}
