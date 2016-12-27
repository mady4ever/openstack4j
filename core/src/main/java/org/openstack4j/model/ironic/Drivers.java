package org.openstack4j.model.ironic;

import org.openstack4j.model.ModelEntity;

import java.util.List;

/**
 * Created by mahepate on 9/12/2016.
 */
public interface Drivers extends ModelEntity {
    List<String> getHosts();
    String getName();
}
