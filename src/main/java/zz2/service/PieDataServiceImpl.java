package zz2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zz2.dao.PieDataMapper;
import zz2.entity.PieData;
import zz2.support.RequestResult;
import zz2.support.StatusEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PieDataServiceImpl implements PieDataService{
    @Autowired
    public PieDataMapper pieDataMapper;
    @Override
    public RequestResult selectPieInformation(String pieName, int dataOrigin) {
        List<PieData> Datalist = pieDataMapper.selectPieInformation(pieName,dataOrigin);
        if (Datalist.size() == 0){
            return RequestResult.e(StatusEnum.FAIL, null);
        }
//        System.out.print(Datalist.get(0));
        List<Map> maps = new ArrayList<>();
        for(int i=0;i<Datalist.size();i++)
        {   //System.out.print(i);
            System.out.println(Datalist.get(i).percentge);
            Map<String, Object> map = new HashMap<>();
            map.put("id", Datalist.get(i).getId());
            map.put("pieName",Datalist.get(i).getPieName());
            map.put("dataName",Datalist.get(i).getDataName());
            map.put("percentge",Datalist.get(i).getPercentge());
            map.put("dataOrigin",Datalist.get(i).getDataOrigin());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK, maps);}//}
}
