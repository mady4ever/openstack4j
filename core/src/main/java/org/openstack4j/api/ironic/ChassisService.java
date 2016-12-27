package org.openstack4j.api.ironic;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.ironic.Chassis;
import org.openstack4j.model.ironic.ChassisCreate;

import java.util.List;

/**
 * Created by mahepate on 9/6/2016.
 */
public interface ChassisService extends RestService {
    List<? extends Chassis> list();
    Chassis get(String uuid);
    ActionResponse delete(String uuid);
    Chassis create(ChassisCreate chassisCreate);
}
