package zz2.service;


import zz2.dao.CrawlerDartaMapper;
import zz2.entity.CrawlerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zz2.support.RequestResult;
import zz2.support.StatusEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CrawlerDataServiceImpl implements CrawlerDataService {
    @Autowired
    public CrawlerDartaMapper crawlerDartaMapper;
    @Override
    public RequestResult RandomSelectBook(String serial) {
        List<CrawlerData> booklist = crawlerDartaMapper.RandomSelectBook(serial);
        if (booklist.size() == 0){
            return RequestResult.e(StatusEnum.FAIL, null);
        }
        System.out.print(booklist.get(0));
        List<Map> maps = new ArrayList<>();
        for(int i=0;i<booklist.size();i++)
        {   Map<String, Object> map = new HashMap<>();
            map.put("id", booklist.get(i).getId());
            map.put("bookName", booklist.get(i).getBookName());
            map.put("authorName", booklist.get(i).getWriterName());
//            map.put("articalNumber", booklist.get(i).getArticalNumber());
            map.put("time",booklist.get(i).getTime());
            map.put("label", booklist.get(i).getLabel());
            map.put("wordsNum", booklist.get(i).getWords());
            map.put("recommonend", booklist.get(i).getRecommonend());
            map.put("weekCRecommonend", booklist.get(i).getWeekCRecommonend());
            map.put("click", booklist.get(i).getClick());
            map.put("serials",booklist.get(i).getSerials());
            map.put("imgUrl",booklist.get(i).getCoverLink());
            map.put("bookUrl",booklist.get(i).getBookLink());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK, maps);}//}

    @Override
    public RequestResult selectWriterInformation(String name) {
        List<CrawlerData> booklist2 = crawlerDartaMapper.selectWriterInformation(name);
        if (booklist2.size() == 0){
            return RequestResult.e(StatusEnum.FAIL, null);
        }
        Double authorWordsNum=0.0;
        int bookNum=booklist2.size();
        for(int i=0;i<booklist2.size();i++)
        {
            authorWordsNum=authorWordsNum+booklist2.get(i).getWords();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("authorName",name);
        map.put("authorWordsNum",authorWordsNum);
        map.put("bookNum",bookNum);
        return RequestResult.e(StatusEnum.OK,map);
    }
    @Override
    public RequestResult selectWriterBook(String name) {
        List<CrawlerData> booklist2 = crawlerDartaMapper.selectWriterBook(name);
        if (booklist2.size() == 0){
            return RequestResult.e(StatusEnum.FAIL, null);
        }
        List<Map> maps = new ArrayList<>();
        for(int i=0;i<booklist2.size();i++)
        {   Map<String, Object> map = new HashMap<>();
            map.put("id", booklist2.get(i).getId());
            map.put("bookName", booklist2.get(i).getBookName());
            map.put("authorName", booklist2.get(i).getWriterName());
//            map.put("articalNumber", booklist2.get(i).getArticalNumber());
            map.put("time",booklist2.get(i).getTime());
            map.put("label", booklist2.get(i).getLabel());
            map.put("wordsNum", booklist2.get(i).getWords());
            map.put("recommonend", booklist2.get(i).getRecommonend());
            map.put("weekCRecommonend", booklist2.get(i).getWeekCRecommonend());
            map.put("click", booklist2.get(i).getClick());
            map.put("serials",booklist2.get(i).getSerials());
            map.put("imgUrl",booklist2.get(i).getCoverLink());
            map.put("bookUrl",booklist2.get(i).getBookLink());
//            map.put("interduce",booklist2.get(i).getBookLink());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK, maps);
    }
    @Override
    public RequestResult selectBookByBookName(String bookName) {
        List<CrawlerData> bookList = crawlerDartaMapper.selectBookByBookName(bookName);
        if (bookList.size() == 0){
            return RequestResult.e(StatusEnum.FAIL, null);
        }
        List<Map> maps = new ArrayList<>();
        for(int i=0;i<bookList.size();i++)
        {   Map<String, Object> map = new HashMap<>();
            map.put("id", bookList.get(i).getId());
            map.put("bookName", bookList.get(i).getBookName());
            map.put("authorName", bookList.get(i).getWriterName());
//            map.put("articalNumber", bookList.get(i).getArticalNumber());
            map.put("time",bookList.get(i).getTime());
            map.put("label", bookList.get(i).getLabel());
            map.put("wordsNum", bookList.get(i).getWords());
            map.put("recommonend", bookList.get(i).getRecommonend());
            map.put("weekCRecommonend", bookList.get(i).getWeekCRecommonend());
            map.put("click", bookList.get(i).getClick());
            map.put("serials",bookList.get(i).getSerials());
            map.put("imgUrl",bookList.get(i).getCoverLink());
            map.put("bookUrl",bookList.get(i).getBookLink());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK, maps);
    }

    @Override
    public RequestResult selectAllBook() {
        List<CrawlerData> bookList = crawlerDartaMapper.selectAllBook();
        if (bookList.size() == 0){
            return RequestResult.e(StatusEnum.FAIL, null);
        }
        List<Map> maps = new ArrayList<>();
        for(int i=0;i<bookList.size();i++)
        {   Map<String, Object> map = new HashMap<>();
            map.put("id", bookList.get(i).getId());
            map.put("bookName", bookList.get(i).getBookName());
            map.put("authorName", bookList.get(i).getWriterName());
//            map.put("articalNumber", bookList.get(i).getArticalNumber());
            map.put("time",bookList.get(i).getTime());
            map.put("label", bookList.get(i).getLabel());
            map.put("wordsNum", bookList.get(i).getWords());
            map.put("recommonend", bookList.get(i).getRecommonend());
            map.put("weekCRecommonend", bookList.get(i).getWeekCRecommonend());
            map.put("click", bookList.get(i).getClick());
            map.put("serials",bookList.get(i).getSerials());
            map.put("imgUrl",bookList.get(i).getCoverLink());
            map.put("bookUrl",bookList.get(i).getBookLink());
            maps.add(map);
        }
        return RequestResult.e(StatusEnum.OK, maps);
    }

}
