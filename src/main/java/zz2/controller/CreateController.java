package zz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zz2.service.CreateService;
import zz2.support.RequestResult;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
@CrossOrigin
@Controller
@RequestMapping("/api/test")
public class CreateController {
    @Autowired
    public CreateService createService;

    @RequestMapping(value = "/setRule",method = RequestMethod.POST)
    @ResponseBody
//    @ApiOperation(value="获取用户信息")
    public RequestResult setRule(double dataSize, double maxRecommend,double maxClick,
                                 double maxWeekRecommend, double fristWordNum,
                                 double secondWordNum, double thirdWordNum, double fourthWordNum) {
        RequestResult result = createService.setRule(dataSize,maxRecommend,maxClick,maxWeekRecommend
                ,fristWordNum,secondWordNum,thirdWordNum,fourthWordNum);
        return result;
    }



//    @RequestMapping(value = "/getRule",method = RequestMethod.POST)
//    @ResponseBody
//    public RequestResult getRule(int id){
//        RequestResult result=createService.getRule(id);
//
////        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm");
////        String dateStringPaese = date.format(Calendar.getInstance().getTime());
////        System.out.println(dateStringPaese);
//
//        return result;
//    }

    @GetMapping(value = "/deleteRule/{id}")
    @ResponseBody
    public RequestResult deleteRule(@PathVariable int id){
        RequestResult result=createService.deleteRule(id);
        return result;
    }

    @GetMapping(value = "/getRule")
    @ResponseBody
    public RequestResult getRule(){
        RequestResult result=createService.getRule();
        return result;
    }
}
