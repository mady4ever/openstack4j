package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.openstack4j.model.ironic.ChassisCreate;
import org.openstack4j.model.ironic.builder.ChassisCreateBuilder;

/**
 * Created by mahepate on 9/13/2016.
 */

public class IronicChassisCreate implements ChassisCreate {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("description")
    private String description;

    @Override
    public ChassisCreateBuilder toBuilder() {
        return new ChassisCreateConcreteBuilder(this);
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public String getDescription() {
        return description;
    }
    public static ChassisCreateConcreteBuilder builder(){
        return new ChassisCreateConcreteBuilder();
    }


    public static class ChassisCreateConcreteBuilder implements ChassisCreateBuilder{
        IronicChassisCreate ironicChassisCreate;
        ChassisCreateConcreteBuilder(){
            this(new IronicChassisCreate());
        }
        ChassisCreateConcreteBuilder(IronicChassisCreate ironicChassisCreate)
        {
            this.ironicChassisCreate = ironicChassisCreate;
        }
        @Override
        public ChassisCreateBuilder description(String desription) {
            ironicChassisCreate.description = desription;
            return this;
        }

        @Override
        public ChassisCreate build() {
            return ironicChassisCreate;
        }

        @Override
        public ChassisCreateBuilder from(ChassisCreate in) {
            ironicChassisCreate = (IronicChassisCreate) in;
            return this;
        }
    }

}
