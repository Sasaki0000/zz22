package zz2.dao;


import zz2.entity.CrawlerData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CrawlerDartaMapper {
    List<CrawlerData> RandomSelectBook(String serial);//serial 连载情况
    List<CrawlerData> selectWriterInformation(String name);
    List<CrawlerData> selectWriterBook(String name);
    List<CrawlerData> selectBookByBookName(String bookName);
    List<CrawlerData> selectAllBook();

}