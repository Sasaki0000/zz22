package zz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zz2.service.DataService;
import zz2.support.RequestResult;

@CrossOrigin
@Controller
@RequestMapping("/api/test")
public class DataController {

    @Autowired
    public DataService dataService;

    @GetMapping(value = {"/SelectInformationById/{id}"})
//    @RequestMapping(value = "/SelectInformationById")
    @ResponseBody
//    @ApiOperation(value="...")
    RequestResult SelectInformationById(@PathVariable int id){
        RequestResult result= dataService.SelectInformationById(id);
        return result;
    }

//    @RequestMapping(value = "/selectListByListName",method = RequestMethod.POST)
//    @ResponseBody
//    RequestResult selectListByListName(String listName,int DataOrigin){
//        RequestResult result= dataService.selectListByListName(listName,DataOrigin);
//        return result;
//
//    }

    @RequestMapping(value = "/addList",method = RequestMethod.POST)
    @ResponseBody
    RequestResult addList(String listName,String bookName,int topList,double information,int dataOrigin){
        RequestResult result = dataService.addList(listName,bookName,topList,information,dataOrigin);
        return result;
    }

    @GetMapping(value = "/selectListByRuleId/{ruleId}")
    @ResponseBody
    RequestResult selectListByRuleId(@PathVariable int ruleId){
        RequestResult result= dataService.selectListByRuleId(ruleId);
        return result;
    }

    @RequestMapping(value = "/selectListByListName",method = RequestMethod.POST)
    @ResponseBody
    RequestResult selectListByListName(String listName,int ruleId){
        RequestResult result= dataService.selectListByListName(listName,ruleId);
        return result;
    }

}
