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
    
    @RequestMapping("info")
    public String info(){
        return InetAddress.getHostAddress();
    }
}
