package org.openstack4j.openstack.ironic.internal;

import org.openstack4j.api.types.ServiceType;
import org.openstack4j.openstack.internal.BaseOpenStackService;
import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * Created by mahepate on 9/6/2016.
 */
public class BaseIronicServices extends BaseOpenStackService {
    protected BaseIronicServices(){
        super(ServiceType.BAREMETAL, EndpointFunction.instance);
    }

    private static class EndpointFunction implements Function<String, String> {

        static final EndpointFunction instance = new EndpointFunction();

        @Override
        public String apply(String input) {
            if (input == null || input.contains("/v"))
                return input;
            return input.concat(input.endsWith("/") ? "v1" : "/v1");
        }
    }

    protected <T> List<T> wrapList(T[] type) {
        if (type != null)
            return Lists.newArrayList(type);
        return Collections.emptyList();

    }
}
