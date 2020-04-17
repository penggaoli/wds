package com.webank.wedatasphere.appjoint.service.nodeservice;

import com.webank.wedatasphere.dss.appjoint.service.session.Session;
import org.apache.commons.collections.map.HashedMap;
import org.apache.http.Header;
import org.apache.http.cookie.Cookie;

import java.util.HashMap;
import java.util.Map;

public class DxpSession implements Session {
    private long lastAccessTime;
    private Cookie[] cookies;
    private Header[] headers;
    private String user;
    private Map<String,String> parameters = new HashMap<>();

    @Override
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public Cookie[] getCookies() {
        return this.cookies;
    }

    public void setCookies(Cookie[] cookies){
        this.cookies = cookies;
    }

    @Override
    public Header[] getHeaders() {
        return this.headers;
    }

    @Override
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override
    public long getLastAccessTime() {
        return this.lastAccessTime;
    }

    @Override
    public void updateLastAccessTime() {
        lastAccessTime = System.currentTimeMillis();
    }
}
