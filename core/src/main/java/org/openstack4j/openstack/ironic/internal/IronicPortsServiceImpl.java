package org.openstack4j.openstack.ironic.internal;

import org.openstack4j.api.ironic.PortsService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.ironic.Ports;
import org.openstack4j.openstack.ironic.domain.IronicPorts;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by mahepate on 9/9/2016.
 */
public class IronicPortsServiceImpl extends BaseIronicServices implements PortsService{
    @Override
    public List<? extends Ports> list() {
        return get(IronicPorts.ports.class,uri("/ports")).execute().getList();
    }

    @Override
    public Ports get(String uuid) {
        checkNotNull(uuid);
        return get(IronicPorts.class,uri("/ports/%s",uuid)).execute();
    }

    @Override
    public ActionResponse delete(String uuid) {
        checkNotNull(uuid);
        return deleteWithResponse(uri("/ports/%s",uuid)).execute();
    }
}
