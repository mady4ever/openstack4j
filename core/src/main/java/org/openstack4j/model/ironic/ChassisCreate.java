package org.openstack4j.model.ironic;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.ironic.builder.ChassisCreateBuilder;

/**
 * Created by mahepate on 9/13/2016.
 */
public interface ChassisCreate extends ModelEntity,Buildable<ChassisCreateBuilder> {
    String getUuid();
    String getDescription();
}
