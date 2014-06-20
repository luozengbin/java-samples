package jp.jizai.sample.jmx;

import java.util.concurrent.atomic.AtomicInteger;

//MBeanの実体定義
public class SampleCounter implements SampleCounterMXBean {

    private static SampleCounter inst = new SampleCounter();

    private AtomicInteger cntSession = new AtomicInteger();
    private AtomicInteger succeeded = new AtomicInteger();
    private AtomicInteger failured = new AtomicInteger();

    private AccessInfo lastAccessInfo;

    public static SampleCounter getSampleCounter() {
        return inst;
    }

    public String getName() {
        return "SampleCounter";
    }

    public int getCountSession() {
        return cntSession.get();
    }

    public int getSucceededCount() {
        return succeeded.get();
    }

    public int getFailuredCount() {
        return failured.get();
    }

    public int succeeded() {
        return succeeded.incrementAndGet();
    }

    public int failured() {
        return failured.incrementAndGet();
    }
    
    public int sessionCreated() {
        return cntSession.incrementAndGet();
    }

    public int sessionDestroyed() {
        return cntSession.decrementAndGet();
    }

    public void setLastAccessInfo(AccessInfo lastAccessInfo) {
        this.lastAccessInfo = lastAccessInfo;
    }

    public AccessInfo getAccessInfo() {
        return lastAccessInfo;
    }
}
