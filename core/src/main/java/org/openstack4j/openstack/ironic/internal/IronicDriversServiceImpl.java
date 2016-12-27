package org.openstack4j.openstack.ironic.internal;

import org.openstack4j.api.ironic.DriversService;
import org.openstack4j.model.ironic.Drivers;
import org.openstack4j.model.ironic.DriversProperties;
import org.openstack4j.openstack.ironic.domain.IronicDrivers;
import org.openstack4j.openstack.ironic.domain.IronicDriversProperties;

import java.util.List;

/**
 * Created by mahepate on 9/12/2016.
 */
public class IronicDriversServiceImpl extends BaseIronicServices implements DriversService {

    @Override
    public List<? extends Drivers> list() {
        return get(IronicDrivers.driver.class,uri("/drivers")).execute().getList();
    }

    @Override
    public Drivers get(String name) {
        return get(IronicDrivers.class,uri("/drivers/%s",name)).execute();
    }
    @Override
    public DriversProperties getProperties(String name)
    {
        return get(IronicDriversProperties.class,uri("/drivers/%s/properties",name)).execute();
    }
}
