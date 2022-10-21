package zz2.dao;


import zz2.entity.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DataMapper {
    List<Data> SelectInformationById(int id);
    List<Data> selectListByListName(String ListName,int DataOrigin);
    int addList(String listName,String bookName,int topList,double information,int dataOrigin);
    List<Data> selectListByRuleId(int ruleId);

}
