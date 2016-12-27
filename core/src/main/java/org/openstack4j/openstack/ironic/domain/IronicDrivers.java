package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.openstack4j.model.ironic.Drivers;
import org.openstack4j.model.ironic.DriversHosts;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * Created by mahepate on 9/12/2016.
 */
public class IronicDrivers implements Drivers {
    @JsonProperty("name")
    private String name;
    @JsonProperty("hosts")
    private List<String> hosts;
    @Override
    public List<String> getHosts() {
        return hosts;
    }
    @Override
    public String getName() {
        return name;
    }
    public static class driver extends ListResult<IronicDrivers>{
        @JsonProperty("drivers")
        private List<IronicDrivers> driversList;
        @Override
        protected List<IronicDrivers> value() {
            return driversList;
        }
    }
    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).omitNullValues()
                .add("name",name)
                .add("hosts",hosts)
                .toString();
    }
}
