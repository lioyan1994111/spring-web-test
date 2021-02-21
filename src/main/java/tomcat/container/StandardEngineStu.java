package tomcat.container;

import org.apache.catalina.core.ContainerBase;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;

/**
 *
 * {@linkplain StandardEngine}
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/20 10:08 下午
 */
public class StandardEngineStu {

    /**
     * {@linkplain StandardEngine#initInternal()}
     *
     * 调用父类的initInternal 方法{@linkplain ContainerBase#initInternal()}
     * 调用child 的start 方法 {@linkplain StandardHost#start()}
     *
     */
    public void  startInternal(){

    }
}
