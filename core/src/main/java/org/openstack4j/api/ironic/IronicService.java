package org.openstack4j.api.ironic;

import org.openstack4j.common.RestService;

/**
 * Created by mahepate on 9/6/2016.
 */
public interface IronicService extends RestService{
    ChassisService chassis();
    NodesService nodes();
    PortsService ports();
    DriversService drivers();
}
