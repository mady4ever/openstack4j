package org.openstack4j.openstack.ironic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.openstack4j.model.ironic.NodesProperties;

/**
 * Created by mahepate on 9/9/2016.
 */
public class IronicNodesProperties implements NodesProperties{
    @JsonProperty("memory_mb")
    private Integer memory_mb;
    @JsonProperty("cpu_arch")
    private String cpu_arch;
    @JsonProperty("local_gb")
    private Integer local_gb;
    private Integer cpus;

    public String getCpu_arch() {
        return cpu_arch;
    }

    public Integer getLocal_gb() {
        return local_gb;
    }

    public Integer getCpus() {
        return cpus;
    }

    public Integer getMemory_mb() {

        return memory_mb;
    }
    @Override
    public String toString()
    {
        return Objects.toStringHelper(this).omitNullValues()
                .add("memory_mb",memory_mb)
                .add("cpu_arch",cpu_arch)
                .add("cpu_arch",cpu_arch)
                .add("cpus",cpus)
                .toString();
    }
}
