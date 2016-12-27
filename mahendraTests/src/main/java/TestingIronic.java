
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.identity.v2.Tenant;
import org.openstack4j.model.identity.v2.User;
import org.openstack4j.model.ironic.*;
import org.openstack4j.model.ironic.builder.ChassisCreateBuilder;
import org.openstack4j.model.telemetry.Meter;
import org.openstack4j.openstack.OSFactory;
import org.openstack4j.openstack.heat.domain.HeatSoftwareConfig;
import org.openstack4j.openstack.ironic.domain.IronicNodesDriver;

import static org.openstack4j.api.Builders.ironic;

/**
 * Created by mahepate on 9/8/2016.
 */
public class TestingIronic {
    public static void main(String[] args)
    {
        OSFactory.enableHttpLoggingFilter(true);
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "DEBUG");
        System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "ERROR");

        OSClient.OSClientV2 os = OSFactory.builderV2()
                .endpoint("http://10.203.61.235:5000/v2.0")
                .credentials("admin","password")
                .tenantName("admin")
                .authenticate();
        System.out.println("Is Ironic supported\t" + os.supportsIronic());

        //for(Chassis c: os.ironic().chassis().list())
        //{
         //   System.out.println("Chassis List \t"+c.getUUID() + "\t" + c.getDescription());
        //}
        //System.out.println(os.ironic().chassis().get("dcca8046-87dd-437d-b78e-079d43a8e237"));
        /*
        for(Nodes n: os.ironic().nodes().list())
        {
            System.out.print(n.getName() +"\t");
            System.out.print(n.getInstanceUUID()+"\t");
            System.out.print(n.getMaintenance()+"\t");
            System.out.print(n.getPowerState()+"\t");
            System.out.print(n.getProvisionState()+"\t");
            System.out.print(n.getUUID()+"\t");
            System.out.println("\n");
        }*/
        //System.out.println(os.ironic().nodes().get("80d26e01-c0d5-4867-8c72-2e47c010bcb2").getDriver_info());
        /*
        for(Ports p: os.ironic().ports().list())
        {
            System.out.println(p.toString());
        }
        System.out.println(os.ironic().nodes().getPorts("7f49ca49-4dc6-45a3-bf66-4bee75e95757"));
        */
     /*
        for(Drivers d: os.ironic().drivers().list())
        {
           System.out.println(d.getName() + "\t" + d.getHosts());
        }
        System.out.println(os.ironic().drivers().get("pxe_ssh"));
        */
      //System.out.println(os.ironic().drivers().getProperties("agent_ipmitool"));
        //System.out.println(os.ironic().chassis().delete("5cb94657-4686-4732-a8ea-dd4c6e2de8af"));
        //System.out.println(os.ironic().nodes().list().get(0));
        //System.out.println(os.ironic().nodes().get("7f49ca49-4dc6-45a3-bf66-4bee75e95757"));

        //ChassisCreate chassis = Builders.ironicChassis().description("testing").build();
        //Chassis chassis1 = os.ironic().chassis().create(chassis);
        //System.out.println(chassis1.getUUID());
        //System.out.println(os.ironic().chassis().delete(chassis1.getUUID()));
        NodesCreate nodes = Builders.ironicNodes()
                .chassis_uuid("b3673f9e-8fd0-45d0-b943-5abe0557b728")
                .driver("agent_ipmitool")
                .driver_info(new IronicNodesDriver().)
                .name("")
                .properties()
                .build();
    }

}
