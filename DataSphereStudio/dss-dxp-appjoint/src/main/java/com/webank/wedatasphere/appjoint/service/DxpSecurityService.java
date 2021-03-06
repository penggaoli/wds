package com.webank.wedatasphere.appjoint.service;

import com.webank.wedatasphere.appjoint.service.nodeservice.DxpSession;
import com.webank.wedatasphere.dss.appjoint.exception.AppJointErrorException;
import com.webank.wedatasphere.dss.appjoint.service.AppJointUrlImpl;
import com.webank.wedatasphere.dss.appjoint.service.SecurityService;
import com.webank.wedatasphere.dss.appjoint.service.session.Session;

public class DxpSecurityService extends AppJointUrlImpl implements SecurityService {
    @Override
    public Session login(String user) throws AppJointErrorException {
        DxpSession dxpSession = new DxpSession();
        dxpSession.setUser(user);
        dxpSession.getParameters().put("j_username","sysadmin");
        dxpSession.getParameters().put("j_password","2pwia2526oqjcMZfyqIonQ==");
        return dxpSession;
    }

    @Override
    public void logout(String user) throws AppJointErrorException {

    }
}
