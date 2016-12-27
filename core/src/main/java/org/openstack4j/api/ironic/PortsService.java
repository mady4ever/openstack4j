package org.openstack4j.api.ironic;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.ironic.Ports;

import java.util.List;

/**
 * Created by mahepate on 9/9/2016.
 */
public interface PortsService extends RestService {
    List<? extends Ports> list();
    Ports get(String uuid);
    ActionResponse delete(String uuid);
}
