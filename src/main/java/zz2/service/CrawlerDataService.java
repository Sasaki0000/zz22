package zz2.service;


import zz2.support.RequestResult;

public interface CrawlerDataService {
    //    RequestResult SelectBookbyIp(int id);
    RequestResult RandomSelectBook(String seriald);
    RequestResult selectWriterInformation(String name);
    RequestResult selectWriterBook(String name);
    RequestResult selectBookByBookName(String bookName);
    RequestResult selectAllBook();


}