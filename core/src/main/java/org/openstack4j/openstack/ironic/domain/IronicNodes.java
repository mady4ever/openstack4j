package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.openstack4j.model.ironic.Nodes;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * Created by mahepate on 9/8/2016.
 */
public class IronicNodes implements Nodes {
    @JsonProperty("instance_uuid")
    private String instance_uuid;
    private String uuid;
    private boolean maintenance;
    @JsonProperty("provision_state")
    private String provision_state;
    @JsonProperty("power_state")
    private String power_state;
    @JsonProperty("name")
    private String name;
    @JsonProperty("target_power_state")
    private String target_power_state;
    @JsonProperty("target_provision_state")
    private String target_provision_state;
    @JsonProperty("last_error")
    private String last_error;
    @JsonProperty("updated_at")
    private String updated_at;
    @JsonProperty("maintenance_reason")
    private String maintenance_reason;
    @JsonProperty("console_enabled")
    private String console_enabled;
    @JsonProperty("provision_updated_at")
    private String provision_updated_at;
    private String driver;
    private String reservation;
    @JsonProperty("properties")
    private IronicNodesProperties properties;
    @JsonProperty("driver_info")
    private IronicNodesDriver driver_info;
    @JsonProperty("chassis_uuid")
    private String chassis_uuid;
    @JsonProperty("created_at")
    private String created_at;
    public String getChassis_uuid() {
        return chassis_uuid;
    }
    public String getCreated_at() {
        return created_at;
    }
    public IronicNodesDriver getDriver_info() {
        return driver_info;
    }
    public String getInstance_uuid() {

        return instance_uuid;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public String getProvision_state() {
        return provision_state;
    }

    public String getPower_state() {
        return power_state;
    }

    public String getTarget_power_state() {
        return target_power_state;
    }

    public String getTarget_provision_state() {
        return target_provision_state;
    }

    public String getLast_error() {
        return last_error;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getMaintenance_reason() {
        return maintenance_reason;
    }

    public String getConsole_enabled() {
        return console_enabled;
    }

    public String getProvision_updated_at() {
        return provision_updated_at;
    }

    public String getDriver() {
        return driver;
    }

    public String getReservation() {
        return reservation;
    }

    public IronicNodesProperties getProperties() {
        return properties;
    }

    @Override
    public String getUUID() {
        return uuid;
    }

    @Override
    public boolean getMaintenance() {
        return maintenance;
    }

    @Override
    public String getProvisionState() {
        return provision_state;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPowerState() {
        return power_state;
    }

    @Override
    public String getInstanceUUID() {
        return instance_uuid;
    }
    public static class nodes extends ListResult<IronicNodes>{
        @JsonProperty("nodes")
        private List<IronicNodes> nodesList;
        @Override
        protected List<IronicNodes> value() {
            return nodesList;
        }
    }
    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).omitNullValues()
                .add("uuid", uuid)
                .add("maintenance",maintenance)
                .add("power_state",power_state)
                .add("instance_uuid",instance_uuid)
                .add("provision_state",provision_state)
                .add("properties",properties)
                .add("target_power_state",target_power_state)
                .add("target_provision_state",target_provision_state)
                .add("last_error",last_error)
                .add("updated_at",updated_at)
                .add("maintenance_reason",maintenance_reason)
                .add("console_enabled",console_enabled)
                .add("provision_updated_at",provision_updated_at)
                .add("driver",driver)
                .add("driver_info",driver_info)
                .add("reservation",reservation)
                .add("chassis_uuid",chassis_uuid)
                .add("created_at",created_at)
                .add("name",name).toString();
    }
}
