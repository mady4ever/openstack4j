package org.openstack4j.model.ironic;

import org.openstack4j.model.ModelEntity;

/**
 * Created by mahepate on 9/9/2016.
 */
public interface Ports extends ModelEntity {
    String getAddress();
    String getCreated_at();
    String getInternal_info();
    String getLocal_link_connection();
    String getNode_uuid();
    String getPxe_enabled();
    String getUpdated_at();
    String getUuid();
}
