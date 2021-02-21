package tomcat.container;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardHost;

/**
 * {@linkplain StandardHost}
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/20 10:19 下午
 */
public class StandardHostStu {

    /**
     * {@linkplain StandardHost#initInternal()}
     * 无
     *
     */
    public void  initInternal(){

    }


    /**
     * {@linkplain StandardHost#startInternal()}
     * 在Pipeline 中添加 {@linkplain org.apache.catalina.core.StandardHostValve}
     * 执行 child 的start 方法 {@linkplain StandardContext#start()}
     *
     */
    public void  startInternal(){

    }

}
