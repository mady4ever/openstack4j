package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.openstack4j.model.identity.v3.Authentication;
import org.openstack4j.model.ironic.NodesDriver;

/**
 * Created by mahepate on 9/9/2016.
 */
public class IronicNodesDriver implements NodesDriver {
    @JsonProperty("ipmi_port")
    private Integer ipmi_port;
    @JsonProperty("ipmi_username")
    private String ipmi_username;
    @JsonProperty("deploy_kernel")
    private String deploy_kernel;
    @JsonProperty("ipmi_address")
    private String ipmi_address;
    @JsonProperty("deploy_ramdisk")
    private String deploy_ramdisk;
    @JsonProperty("ipmi_password")
    private String ipmi_password;

    public Integer getIpmi_port() {
        return ipmi_port;
    }
    public String getIpmi_username() {
        return ipmi_username;
    }

    public String getDeploy_kernel() {
        return deploy_kernel;
    }

    public String getIpmi_address() {
        return ipmi_address;
    }

    public String getDeploy_ramdisk() {
        return deploy_ramdisk;
    }

    public String getIpmi_password() {
        return ipmi_password;
    }
    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).omitNullValues()
                .add("ipmi_port",ipmi_port)
                .add("ipmi_username",ipmi_username)
                .add("deploy_kernel",deploy_kernel)
                .add("ipmi_address",ipmi_address)
                .add("deploy_ramdisk",deploy_ramdisk)
                .add("ipmi_password",ipmi_password)
                .toString();
    }
}
