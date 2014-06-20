package jp.jizai.sample.jmx;

import javax.management.MXBean;

// MXBeanとして、Beanブラウザからアクセス可能なインタフェース定義
@MXBean
public interface SampleCounterMXBean {

    String getName();

    int getCountSession();

    int getSucceededCount();

    int getFailuredCount();

    AccessInfo getAccessInfo();
}
