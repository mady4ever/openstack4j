package org.openstack4j.model.ironic.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ironic.NodesCreate;
import org.openstack4j.openstack.ironic.domain.IronicNodesDriver;
import org.openstack4j.openstack.ironic.domain.IronicNodesProperties;

/**
 * Created by mahepate on 9/16/2016.
 */
public interface NodesCreateBuilder extends Buildable.Builder<NodesCreateBuilder,NodesCreate> {
    NodesCreateBuilder chassis_uuid(String chassis_uuid);
    NodesCreateBuilder driver(String driver);
    NodesCreateBuilder driver_info(IronicNodesDriver ironicNodesDriver);
    NodesCreateBuilder name(String name);
    NodesCreateBuilder properties(IronicNodesProperties ironicNodesProperties);
}
