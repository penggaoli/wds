package com.webank.wedatasphere.appjoint;

import com.webank.wedatasphere.appjoint.service.DxpSecurityService;
import com.webank.wedatasphere.dss.appjoint.AppJoint;
import com.webank.wedatasphere.dss.appjoint.exception.AppJointErrorException;
import com.webank.wedatasphere.dss.appjoint.execution.NodeExecution;
import com.webank.wedatasphere.dss.appjoint.service.NodeService;
import com.webank.wedatasphere.dss.appjoint.service.ProjectService;
import com.webank.wedatasphere.dss.appjoint.service.SecurityService;

import java.util.Map;

public class DxpAppjoint implements AppJoint {
    private SecurityService securityService;


    @Override
    public String getAppJointName() {
        return "dxp";
    }

    @Override
    public void init(String baseUrl, Map<String, Object> params) throws AppJointErrorException {
        securityService = new DxpSecurityService();
        securityService.setBaseUrl(baseUrl);
    }

    @Override
    public SecurityService getSecurityService() {
        return securityService;
    }

    @Override
    public ProjectService getProjectService() {
        return null;
    }

    @Override
    public NodeService getNodeService() {
        return null;
    }

    @Override
    public NodeExecution getNodeExecution() {
        return null;
    }
}
