package org.openstack4j.model.ironic;

import org.openstack4j.model.ModelEntity;

/**
 * Created by mahepate on 9/6/2016.
 */
public interface Chassis extends ModelEntity {

    /*
        get UUID of Chassis.
        @return uuid
     */
    String getUUID();
    /*
        get Description of the Chassis.
        @return description
     */
    String getDescription();
    /*
        set Description of Chassis.
     */
}
