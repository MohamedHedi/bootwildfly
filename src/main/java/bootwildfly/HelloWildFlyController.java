package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
    
    @RequestMapping("version")
    public String version(){
        return ("My Version : 4.0.0");
    }
    
    @RequestMapping("whoami")
    protected String whoami() throws Exception {
        // Handling UnknownHostException: name or service not known
        String hostName;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        }
        catch(Exception e) {
            hostName = e.getMessage().split(":")[0];
        }

        return "I'm " + hostName; 
    }
}
