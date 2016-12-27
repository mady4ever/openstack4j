package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.google.common.base.Objects;
import org.openstack4j.model.ironic.DriversProperties;

/**
 * Created by mahepate on 9/12/2016.
 */
public class IronicDriversProperties implements DriversProperties {
    @JsonProperty("deploy_forces_oob_reboot")
    private String deploy_forces_oob_reboot;
    @JsonProperty("deploy_kernel")
    private String deploy_kernel;
    @JsonProperty("deploy_ramdisk")
    private String deploy_ramdisk;
    @JsonProperty("image_http_proxy")
    private String image_http_proxy;
    @JsonProperty("image_https_proxy")
    private String image_https_proxy;
    @JsonProperty("image_no_proxy")
    private String image_no_proxy;
    @JsonProperty("ipmi_address")
    private String ipmi_address;
    @JsonProperty("ipmi_bridging")
    private String ipmi_bridging;
    @JsonProperty("ipmi_force_boot_device")
    private String ipmi_force_boot_device;
    @JsonProperty("ipmi_local_address")
    private String ipmi_local_address;
    @JsonProperty("ipmi_password")
    private String ipmi_password;
    @JsonProperty("ipmi_port")
    private String ipmi_port;
    @JsonProperty("ipmi_priv_level")
    private String ipmi_priv_level;
    @JsonProperty("ipmi_protocol_version")
    private String ipmi_protocol_version;
    @JsonProperty("ipmi_target_address")
    private String ipmi_target_address;
    @JsonProperty("ipmi_target_channel")
    private String ipmi_target_channel;
    @JsonProperty("ipmi_terminal_port")
    private String ipmi_terminal_port;
    @JsonProperty("ipmi_transit_address")
    private String ipmi_transit_address;
    @JsonProperty("ipmi_transit_channel")
    private String ipmi_transit_channel;
    @JsonProperty("ipmi_username")
    private String ipmi_username;

    public String getDeploy_forces_oob_reboot() {
        return deploy_forces_oob_reboot;
    }

    public String getDeploy_kernel() {
        return deploy_kernel;
    }

    public String getDeploy_ramdisk() {
        return deploy_ramdisk;
    }

    public String getImage_http_proxy() {
        return image_http_proxy;
    }

    public String getImage_https_proxy() {
        return image_https_proxy;
    }

    public String getImage_no_proxy() {
        return image_no_proxy;
    }

    public String getIpmi_address() {
        return ipmi_address;
    }

    public String getIpmi_bridging() {
        return ipmi_bridging;
    }

    public String getIpmi_force_boot_device() {
        return ipmi_force_boot_device;
    }

    public String getIpmi_local_address() {
        return ipmi_local_address;
    }

    public String getIpmi_password() {
        return ipmi_password;
    }

    public String getIpmi_port() {
        return ipmi_port;
    }

    public String getIpmi_priv_level() {
        return ipmi_priv_level;
    }

    public String getIpmi_protocol_version() {
        return ipmi_protocol_version;
    }

    public String getIpmi_target_address() {
        return ipmi_target_address;
    }

    public String getIpmi_target_channel() {
        return ipmi_target_channel;
    }

    public String getIpmi_terminal_port() {
        return ipmi_terminal_port;
    }

    public String getIpmi_transit_address() {
        return ipmi_transit_address;
    }

    public String getIpmi_transit_channel() {
        return ipmi_transit_channel;
    }

    public String getIpmi_username() {
        return ipmi_username;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).omitNullValues()
                .add("deploy_forces_oob_reboot",deploy_forces_oob_reboot)
                .add("deploy_kernel",deploy_kernel)
                .add("deploy_ramdisk",deploy_ramdisk)
                .add("image_http_proxy",image_http_proxy)
                .add("image_https_proxy",image_https_proxy)
                .add("image_no_proxy",image_no_proxy)
                .add("ipmi_address",ipmi_address)
                .add("ipmi_bridging",ipmi_bridging)
                .add("ipmi_force_boot_device",ipmi_force_boot_device)
                .add("ipmi_local_address",ipmi_local_address)
                .add("ipmi_password",ipmi_password)
                .add("ipmi_port",ipmi_port)
                .add("ipmi_priv_level",ipmi_priv_level)
                .add("ipmi_protocol_version",ipmi_protocol_version)
                .add("ipmi_target_address",ipmi_target_address)
                .add("ipmi_target_channel",ipmi_target_channel)
                .add("ipmi_terminal_port",ipmi_terminal_port)
                .add("ipmi_transit_address",ipmi_transit_address)
                .add("ipmi_transit_channel",ipmi_transit_channel)
                .add("ipmi_username",ipmi_username)
                .toString();
    }
}
