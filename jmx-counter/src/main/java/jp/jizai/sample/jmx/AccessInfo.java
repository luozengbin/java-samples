package jp.jizai.sample.jmx;

import java.beans.ConstructorProperties;

public class AccessInfo {

    private long time;
    String sessionId;

    @ConstructorProperties({ "time", "sessionId" })
    public AccessInfo(long time, String sessionId) {
        super();
        this.time = time;
        this.sessionId = sessionId;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
