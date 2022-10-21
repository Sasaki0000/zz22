package zz2.service;

import zz2.dao.DataMapper;
import zz2.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zz2.support.AccessResults;
import zz2.support.RequestResult;
import zz2.support.StatusEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    public DataMapper dataMapper;

    @Override
    public RequestResult SelectInformationById(int id) {
        List<Data> dataList = dataMapper.SelectInformationById(id);
        if (dataList.size()==0){

            return RequestResult.e(StatusEnum.FAIL,null);
        }
        System.out.println(dataList.get(0));
        Map<String,Object> map = new HashMap<>();
//        map.put("nodes",dataList.get(0));
        map.put("id", dataList.get(0).getId());
        map.put("listName",dataList.get(0).getListName());
        map.put("bookName",dataList.get(0).getBookName());
        map.put("topList",dataList.get(0).getTopList());
        map.put("Information",dataList.get(0).getInformation());
        map.put("dataOrigin",dataList.get(0).getDataOrigin());
        return RequestResult.e(StatusEnum.OK,map);
    }

    @Override
    public AccessResults selectList(int num, int universal){
        List<Data> dataList=dataMapper.SelectInformationById(num);
        if (dataList.size()==0){
            return new AccessResults(-1,"没有获取到相关榜单信息",null);
        }
        else
        {
            List<Map> maps = new ArrayList<>();
            for (Data data:dataList){
                Map<String,Object> map = new HashMap<>();
                map.put("id", data.getId());
                map.put("listName",data.getListName());
                map.put("bookName",data.getBookName());
                map.put("topList",data.getTopList());
                map.put("Information",data.getInformation());
                map.put("dataOrigin",data.getDataOrigin());
                maps.add(map);
            }
            return new AccessResults(0,"获取信息成功",maps);
        }
    }

    @Override
    public RequestResult selectListByListName(String listName,int DataOrigin) {
        List<Data> dataList = dataMapper.selectListByListName(listName,DataOrigin);
        if (dataList.size()==0){
            return RequestResult.e(StatusEnum.FAIL,null);
        }
        System.out.println(dataList.get(0));
        List<Map> maps = new ArrayList<>();
        for (Data data:dataList){
            Map<String,Object> map = new HashMap<>();
            map.put("id", data.getId());
            map.put("listName",data.getListName());
            map.put("bookName",data.getBookName());
            map.put("topList",data.getTopList());
            map.put("Information",data.getInformation());
            map.put("dataOrigin",data.getDataOrigin());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK,maps);
    }

    @Override
    public RequestResult addList(String listName,String bookName,int topList,double information,int dataOrigin){
        int ret = dataMapper.addList(listName,bookName,topList,information,dataOrigin);
        if(ret != 1){
            return RequestResult.e(StatusEnum.FAIL,null);
        }
        return RequestResult.e(StatusEnum.OK,null);
    }

    @Override
    public RequestResult selectListByRuleId(int ruleId) {
        List<Data> dataList = dataMapper.selectListByRuleId(ruleId);
        if (dataList.size()==0){
            return RequestResult.e(StatusEnum.FAIL,null);
        }
        System.out.println(dataList.get(0));
        List<Map> maps = new ArrayList<>();
        for (Data data:dataList){
            Map<String,Object> map = new HashMap<>();
            map.put("id", data.getId());
            map.put("listName",data.getListName());
            map.put("info",data.getBookName());
//            map.put("number",data.getTopList());
            map.put("number",data.getInformation());
            map.put("dataOrigin",data.getDataOrigin());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK,maps);
    }

}
