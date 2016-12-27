package org.openstack4j.model.ironic.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ironic.ChassisCreate;

/**
 * Created by mahepate on 9/13/2016.
 */
public interface ChassisCreateBuilder extends Buildable.Builder<ChassisCreateBuilder,ChassisCreate> {
    ChassisCreateBuilder description(String description);
}
