package com.dtstack.engine.base;

import java.sql.Timestamp;
import java.util.Map;

/**
 * @author yuebai
 * @date 2020-06-15
 */
public class BaseConfig {

    private boolean openKerberos;

    private String remoteDir;

    private String principalFile;

    private Map<String, String> sftpConf;

    private String krbName;

    private String principalPath;

    private String principalName;

    private Timestamp kerberosFileTimestamp;

    public Timestamp getKerberosFileTimestamp() {
        return kerberosFileTimestamp;
    }

    public void setKerberosFileTimestamp(Timestamp kerberosFileTimestamp) {
        this.kerberosFileTimestamp = kerberosFileTimestamp;
    }

    public String getPrincipalPath() {
        return principalPath;
    }

    public void setPrincipalPath(String principalPath) {
        this.principalPath = principalPath;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getKrbName() {
        return krbName;
    }

    public void setKrbName(String krbName) {
        this.krbName = krbName;
    }

    public boolean isOpenKerberos() {
        return openKerberos;
    }

    public void setOpenKerberos(boolean openKerberos) {
        this.openKerberos = openKerberos;
    }

    public String getRemoteDir() {
        return remoteDir;
    }

    public void setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir;
    }

    public String getPrincipalFile() {
        return principalFile;
    }

    public void setPrincipalFile(String principalFile) {
        this.principalFile = principalFile;
    }

    public Map<String, String> getSftpConf() {
        return sftpConf;
    }

    public void setSftpConf(Map<String, String> sftpConf) {
        this.sftpConf = sftpConf;
    }

}
