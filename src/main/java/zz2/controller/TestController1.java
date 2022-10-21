package zz2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zz2.support.RequestResult;
import zz2.support.StatusEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@CrossOrigin
//@RestController
@Controller
@RequestMapping("/api/test")
public class TestController1 {
    //    @Autowired
//    private User user;
//
//    @RequestMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        return user.getName();
//    }

    @GetMapping(value = {"/play1/{id}"})
    @ResponseBody
    public RequestResult test(@PathVariable int id){
        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        System.out.println("进行访问");
        return RequestResult.e(StatusEnum.OK, map);
    }

    @RequestMapping(value="/play2",method = RequestMethod.POST)
    @ResponseBody
    public RequestResult play2 (Integer id){

        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        System.out.println("进行访问");
        return RequestResult.e(StatusEnum.OK, map);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public RequestResult login(String username, String password) {
//        System.out.println(username);
//        System.out.println(password);
//        Map<String, Object> map = new HashMap<>();
//        map.put("username", username);
//        map.put("password", password);
//        System.out.println("进行登录");
//        if (Objects.equals(username, "admin") && Objects.equals(password, "111111")) {
//            System.out.println("1111");
//        }
//        return RequestResult.e(StatusEnum.SIGN_IN_OK, map);

        if (Objects.equals(username, "admin") && Objects.equals(password, "111111")) {
            Map<String, Object> map = new HashMap<>();
            map.put("result", true);
            System.out.println("进行登录");
            return RequestResult.e(StatusEnum.SIGN_IN_OK, map);
        } else {
            Map<String, Object> map = new HashMap<>();
            map.put("result", false);
            return RequestResult.e(StatusEnum.SIGN_IN_INPUT_FAIL, map);
        }

    }
}
