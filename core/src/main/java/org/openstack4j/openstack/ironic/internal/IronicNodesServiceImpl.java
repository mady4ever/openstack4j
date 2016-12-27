package org.openstack4j.openstack.ironic.internal;

import org.openstack4j.api.ironic.NodesService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.ironic.Nodes;
import org.openstack4j.model.ironic.NodesCreate;
import org.openstack4j.model.ironic.Ports;
import org.openstack4j.openstack.ironic.domain.IronicNodes;
import org.openstack4j.openstack.ironic.domain.IronicPorts;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by mahepate on 9/8/2016.
 */
public class IronicNodesServiceImpl extends BaseIronicServices implements NodesService {

    @Override
    public List<? extends Nodes> list() {
        return get(IronicNodes.nodes.class,uri("/nodes")).execute().getList();
    }

    @Override
    public Nodes get(String uuid) {
        return get(IronicNodes.class,uri("/nodes/%s",uuid)).execute();
    }

    @Override
    public List<? extends Ports> getPorts(String uuid) {
        return get(IronicPorts.ports.class,uri("/nodes/%s/ports",uuid)).execute().getList();
    }

    @Override
    public ActionResponse delete(String uuid) {
        checkNotNull(uuid);
        return deleteWithResponse(uri("/nodes/%s",uuid)).execute();
    }

    @Override
    public Nodes create(NodesCreate nodesCreate) {
        checkNotNull(nodesCreate);
        return post(IronicNodes.class,uri("/nodes"))
                .entity(nodesCreate)
                .execute();
    }
}
