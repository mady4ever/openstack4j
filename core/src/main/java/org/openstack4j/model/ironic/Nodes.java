package org.openstack4j.model.ironic;

import org.openstack4j.model.ModelEntity;
import org.openstack4j.openstack.ironic.domain.IronicNodesDriver;
import org.openstack4j.openstack.ironic.domain.IronicNodesProperties;

/**
 * Created by mahepate on 9/8/2016.
 */
public interface Nodes extends ModelEntity {
    /**
     * Get UUID of Node
     * @return returns UUID of Node
     */
    String getUUID();

    /**
     * Get Maintenance label of Node
     * @return Maintenance of Node
     */
    boolean getMaintenance();

    /**
     * Get Provision State of Node
     * @return ProvisionState of Node
     */
    String getProvisionState();

    /**
     * Get Name of Node
     * @return Name of Node
     */
    String getName();

    /**
     * Get Power State of Node
     * @return Power State of Node
     */
    String getPowerState();

    /**
     * Get Instance UUID of Node.
     * @return Instance UUID of Node.
     */
    String getInstanceUUID();

    /**
     * Get Created Time
     * @return creation Time of Node
     */
    String getCreated_at();
    boolean isMaintenance();
    String getProvision_state();
    String getPower_state();
    String getTarget_power_state();
    String getTarget_provision_state();
    String getLast_error();
    String getUpdated_at();
    String getMaintenance_reason();
    String getConsole_enabled();
    String getProvision_updated_at();
    String getDriver();
    String getReservation();
    IronicNodesProperties getProperties();
    IronicNodesDriver getDriver_info();
}
