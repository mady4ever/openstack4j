package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.ironic.NodesCreate;
import org.openstack4j.model.ironic.builder.NodesCreateBuilder;

/**
 * Created by mahepate on 9/16/2016.
 */
public class IronicNodesCreate implements NodesCreate {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("driver_info")
    private IronicNodesDriver driver_info;
    @JsonProperty("driver")
    private String driver;
    @JsonProperty("properties")
    private IronicNodesProperties properties;
    @JsonProperty("chassis_uuid")
    private String chassis_uuid;
    @Override
    public NodesCreateBuilder toBuilder() {
        return new NodesCreateConcreteBuilder(this);
    }

    @Override
    public String getUUID() {
        return uuid;
    }

    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public IronicNodesDriver getDriver_info() {
        return driver_info;
    }

    @Override
    public IronicNodesProperties getProperties() {
        return properties;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getChassis_uuid() {
        return chassis_uuid;
    }
    public static NodesCreateConcreteBuilder builder(){
        return new NodesCreateConcreteBuilder();
    }
    public static class NodesCreateConcreteBuilder implements NodesCreateBuilder{
        IronicNodesCreate ironicNodesCreate;
        NodesCreateConcreteBuilder(){
            this(new IronicNodesCreate());
        }
        NodesCreateConcreteBuilder(IronicNodesCreate ironicNodesCreate) {
            this.ironicNodesCreate = ironicNodesCreate;
        }

        @Override
        public NodesCreateBuilder chassis_uuid(String chassis_uuid) {
            ironicNodesCreate.chassis_uuid = chassis_uuid;
            return this;
        }

        @Override
        public NodesCreateBuilder driver(String driver) {
            ironicNodesCreate.driver = driver;
            return this;
        }

        @Override
        public NodesCreateBuilder driver_info(IronicNodesDriver ironicNodesDriver) {
            ironicNodesCreate.driver_info = ironicNodesDriver;
            return this;
        }

        @Override
        public NodesCreateBuilder name(String name) {
            ironicNodesCreate.name = name;
            return this;
        }

        @Override
        public NodesCreateBuilder properties(IronicNodesProperties ironicNodesProperties) {
            ironicNodesCreate.properties = ironicNodesProperties;
            return this;
        }

        @Override
        public NodesCreate build() {
            return ironicNodesCreate;
        }

        @Override
        public NodesCreateBuilder from(NodesCreate in) {
            ironicNodesCreate = (IronicNodesCreate) in;
            return this;
        }
    }
}
