package service.controller;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.entity.User;
import service.repository.UserRepository;


/**
* @Description: 用户
* @author gaobin
* @createDate 2018/4/5 16:47
*/
@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    EurekaClient eurekaClient;
    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable Long id){
       return userRepository.findOne(id);
   }
   @RequestMapping("/add")
    public String addUser(){
        User user = new User();
        user.setName("高彬");
        user.setUsername("user1");
        userRepository.save(user);
        return  "success";
   }
    @GetMapping("/eureka-instance")
    public String serviceUrl(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("SERVICE",false);
        return instanceInfo.getHomePageUrl();
    }


}