package org.openstack4j.api.ironic;

import org.openstack4j.common.RestService;
import org.openstack4j.model.ironic.Drivers;
import org.openstack4j.model.ironic.DriversProperties;
import org.openstack4j.openstack.ironic.domain.IronicDrivers;
import org.openstack4j.openstack.ironic.domain.IronicDriversProperties;

import java.util.List;

/**
 * Created by mahepate on 9/12/2016.
 */
public interface DriversService extends RestService {
    List<? extends Drivers> list();
    Drivers get(String name);
    DriversProperties getProperties(String name);
}
