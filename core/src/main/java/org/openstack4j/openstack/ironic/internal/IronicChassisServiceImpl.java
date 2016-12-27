package org.openstack4j.openstack.ironic.internal;
import static com.google.common.base.Preconditions.checkNotNull;
import org.openstack4j.api.ironic.ChassisService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.ironic.Chassis;
import org.openstack4j.model.ironic.ChassisCreate;
import org.openstack4j.openstack.ironic.domain.IronicChassis;

import java.util.List;

/**
 * Created by mahepate on 9/6/2016.
 */
public class IronicChassisServiceImpl extends BaseIronicServices implements ChassisService {
    @Override
    public List<? extends Chassis> list() {
         return get(IronicChassis.Chassis.class, uri("/chassis")).execute().getList();
    }

    @Override
    public Chassis get(String uuid) {
        checkNotNull(uuid);
        return get(IronicChassis.class,uri("/chassis/%s",uuid)).execute();
    }

    @Override
    public ActionResponse delete(String uuid) {
        checkNotNull(uuid);
        return deleteWithResponse(uri("/chassis/%s",uuid)).execute();
    }

    @Override
    public Chassis create(ChassisCreate chassisCreate) {
        checkNotNull(chassisCreate);
        return post(IronicChassis.class,uri("/chassis"))
                .entity(chassisCreate)
                .execute();

    }

}
