package zz2.service;


import zz2.entity.CreateData;
import zz2.dao.CreateMapper;
import zz2.entity.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zz2.support.RequestResult;
import zz2.support.StatusEnum;
import zz2.support.WtoL;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CreateServiceImpl implements CreateService{

    @Autowired
    public CreateMapper createMapper;
//    public CreateData createData;

    @Override
    public RequestResult setRule(double dataSize, double maxRecommend, double maxClick,
                                 double maxWeekRecommend, double Words1,
                                 double Words2, double Words3, double Words4) {
//        if(Words1+Words2+Words3+Words4!=1){
//            return RequestResult.e(StatusEnum.FAIL,null);
//        }
        //调用//调用生产数据
        CreateData.Randomer(dataSize,maxRecommend,maxClick,maxWeekRecommend
                ,Words1,Words2,Words3,Words4);

        WtoL wtol = new WtoL();
        boolean res = wtol.update();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateStringPaese = date.format(Calendar.getInstance().getTime());
//        System.out.println(dateStringPaese);

        int ret = createMapper.setRule(dataSize,maxRecommend,maxClick,maxWeekRecommend
                ,Words1,Words2,Words3,Words4,dateStringPaese);
        if (ret!=1){
            return RequestResult.e(StatusEnum.FAIL,null);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("ret", ret);
        return RequestResult.e(StatusEnum.OK,map);
    }


    @Override
    public RequestResult getRule(){
        List<Rule> rule=createMapper.getRule();
        if(rule.size()==0){
            return RequestResult.e(StatusEnum.FAIL,null);
        }
        List<Map> maps = new ArrayList<>();
        for(int i=0;i<rule.size();i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", rule.get(i).getId());
            map.put("dataSize", rule.get(i).getDataSize());
            map.put("maxRecommend", rule.get(i).getMaxRecommend());
            map.put("maxClick", rule.get(i).getMaxClick());
            map.put("maxWeekRecommend", rule.get(i).getMaxWeekRecommend());
            map.put("fristWordNum", rule.get(i).getWords1());
            map.put("secondWordNum", rule.get(i).getWords2());
            map.put("thirdWordNum", rule.get(i).getWords3());
            map.put("fourthWordNum", rule.get(i).getWords4());
            map.put("createdDate", rule.get(i).getCreateDate());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK, maps);
    }



    @Override
    public RequestResult deleteRule(int id){
        int ret = createMapper.deleteRule(id);
        if (ret!=1){
            return RequestResult.e(StatusEnum.FAIL);
        }
        return RequestResult.e(StatusEnum.OK);
    }


}
