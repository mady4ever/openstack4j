package org.openstack4j.api.ironic;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.ironic.Nodes;
import org.openstack4j.model.ironic.NodesCreate;
import org.openstack4j.model.ironic.Ports;
import org.openstack4j.openstack.ironic.domain.IronicPorts;

import java.util.List;

/**
 * Created by mahepate on 9/8/2016.
 */
public interface NodesService extends RestService{
    List<? extends Nodes> list();
    Nodes get(String uuid);
    List<? extends Ports> getPorts(String uuid);
    ActionResponse delete(String uuid);
    Nodes create(NodesCreate nodesCreate);
}
