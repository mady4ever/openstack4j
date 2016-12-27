package org.openstack4j.openstack.ironic.builder;

import org.openstack4j.model.ironic.ChassisCreate;
import org.openstack4j.model.ironic.builder.ChassisCreateBuilder;
import org.openstack4j.model.ironic.builder.IronicServiceBuilders;
import org.openstack4j.model.ironic.builder.NodesCreateBuilder;
import org.openstack4j.openstack.ironic.domain.IronicChassisCreate;
import org.openstack4j.openstack.ironic.domain.IronicNodesCreate;

/**
 * Created by mahepate on 9/13/2016.
 */
public class IronicBuilders implements IronicServiceBuilders {
    @Override
    public ChassisCreateBuilder chassis() {
        return IronicChassisCreate.builder();
    }

    @Override
    public NodesCreateBuilder nodes() {
        return IronicNodesCreate.builder();
    }
}
