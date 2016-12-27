package org.openstack4j.openstack.ironic.internal;

import org.openstack4j.api.ironic.*;
import org.openstack4j.api.Apis;

/**
 * Created by mahepate on 9/6/2016.
 */
public class IronicServiceImpl implements IronicService {

    @Override
    public ChassisService chassis() {
        return Apis.get(ChassisService.class);
    }

    @Override
    public NodesService nodes() {
        return Apis.get(NodesService.class);
    }
    @Override
    public PortsService ports(){
        return Apis.get(PortsService.class);
    }

    @Override
    public DriversService drivers() {
        return Apis.get(DriversService.class);
    }

}
