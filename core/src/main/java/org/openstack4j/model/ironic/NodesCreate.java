package org.openstack4j.model.ironic;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.ironic.builder.NodesCreateBuilder;
import org.openstack4j.openstack.ironic.domain.IronicNodesDriver;
import org.openstack4j.openstack.ironic.domain.IronicNodesProperties;

/**
 * Created by mahepate on 9/16/2016.
 */
public interface NodesCreate extends ModelEntity,Buildable<NodesCreateBuilder> {
    String getUUID();
    String getDriver();
    IronicNodesDriver getDriver_info();
    IronicNodesProperties getProperties();
    String getName();
    String getChassis_uuid();

}
