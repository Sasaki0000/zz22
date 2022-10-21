package zz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zz2.service.PieDataService;
import zz2.support.RequestResult;
@CrossOrigin
@Controller
@RequestMapping("/api/test")
    public class PieDataController {
        @Autowired
        public PieDataService pieDataService;
        @RequestMapping(value = "/selectPieInformation",method = RequestMethod.POST)
        @ResponseBody
        RequestResult selectPieInformation(String pieName, int dataOrigin){
            RequestResult result=pieDataService.selectPieInformation(pieName,dataOrigin);
            return result;
        }
    }
