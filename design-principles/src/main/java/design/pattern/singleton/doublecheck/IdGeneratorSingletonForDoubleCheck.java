/**************************************************************************************** 
 * 众能联合数字技术有限公司 | All Rights Reserved                             *
 ****************************************************************************************/
package design.pattern.singleton.doublecheck;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例模式：由双重检测方法实现
 *
 * @version 1.0<br>
 * @description: <br>
 * @author: <a href="bianchangcai@znlh.com">Bianchangcai</a>
 * @date: 2022-12-18 13:53
 */
public class IdGeneratorSingletonForDoubleCheck {

    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorSingletonForDoubleCheck instance;

    private IdGeneratorSingletonForDoubleCheck() {
    }

    public static IdGeneratorSingletonForDoubleCheck getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized (IdGeneratorSingletonForDoubleCheck.class) {
                if (instance == null) {
                    instance = new IdGeneratorSingletonForDoubleCheck();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
