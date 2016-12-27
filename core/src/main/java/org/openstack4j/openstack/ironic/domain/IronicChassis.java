package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.Objects;
import org.openstack4j.model.ironic.Chassis;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * Created by mahepate on 9/6/2016.
 */

public class IronicChassis implements Chassis {
    private String uuid;
    private String description;
    @Override
    public String getUUID() {
        return uuid;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).omitNullValues().add("uuid", uuid).add("description",description).toString();
    }

    public static class Chassis extends ListResult<IronicChassis>{

        @JsonProperty("chassis")
        private  List<IronicChassis > chassisList;
        @Override
        protected List<IronicChassis> value() {
            return chassisList;
        }
    }
}
