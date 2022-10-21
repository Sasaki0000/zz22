package zz2.service;


import zz2.support.AccessResults;
import zz2.support.RequestResult;

public interface DataService {
    RequestResult SelectInformationById(int id);

    AccessResults selectList(int num, int universal);

    RequestResult selectListByListName(String listName,int DataOrigin);

    RequestResult addList(String listName, String bookName, int topList, double information, int dataOrigin);

    RequestResult selectListByRuleId(int ruleId);

}
