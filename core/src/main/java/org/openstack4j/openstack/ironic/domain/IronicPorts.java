package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.omg.CORBA.StringHolder;
import org.omg.CORBA.portable.Streamable;
import org.openstack4j.model.ironic.Ports;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * Created by mahepate on 9/9/2016.
 */
public class IronicPorts implements Ports {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("address")
    private String address;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("internal_info")
    private String internal_info;
    @JsonProperty("local_link_connection")
    private String local_link_connection;
    @JsonProperty("node_uuid")
    private String node_uuid;
    @JsonProperty("pxe_enabled")
    private String pxe_enabled;
    @JsonProperty("updated_at")
    private String updated_at;

    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public String getCreated_at() {
        return created_at;
    }
    @Override
    public String getInternal_info() {
        return internal_info;
    }
    @Override
    public String getLocal_link_connection() {
        return local_link_connection;
    }


    @Override
    public String getNode_uuid() {
        return node_uuid;
    }



    public String getPxe_enabled() {
        return pxe_enabled;
    }


    @Override
    public String getUpdated_at() {
        return updated_at;
    }



    @Override
    public String getUuid() {
        return uuid;
    }



    public static class ports extends ListResult<IronicPorts>{
        @JsonProperty("ports")
        private List<IronicPorts> portsList;
        @Override
        protected List<IronicPorts> value() {
            return portsList;
        }
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).omitNullValues()
                .add("address",address)
                .add("uuid",uuid)
                .add("created_at",created_at)
                .add("internal_info",internal_info)
                .add("local_link_connection",local_link_connection)
                .add("node_uuid",node_uuid)
                .add("pxe_enabled",pxe_enabled)
                .toString();
    }
}
