package org.openstack4j.model.ironic;

/**
 * Created by mahepate on 9/9/2016.
 */
public interface NodesDriver {
    String getIpmi_username();

    String getDeploy_kernel();

    String getIpmi_address();

    String getDeploy_ramdisk();

    String getIpmi_password();

}
