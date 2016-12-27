package org.openstack4j.model.ironic;


/**
 * Created by mahepate on 9/12/2016.
 */
public interface DriversProperties {
    String getDeploy_forces_oob_reboot();

    String getDeploy_kernel();

    String getDeploy_ramdisk();

    String getImage_http_proxy();

    String getImage_https_proxy();

    String getImage_no_proxy();

    String getIpmi_address();

    String getIpmi_bridging();

    String getIpmi_force_boot_device();
    String getIpmi_local_address();

    String getIpmi_password();

    String getIpmi_port();

    String getIpmi_priv_level();

    String getIpmi_protocol_version();

    String getIpmi_target_address();

    String getIpmi_target_channel();

    String getIpmi_terminal_port();

    String getIpmi_transit_address();

    String getIpmi_transit_channel();

    String getIpmi_username();
}
