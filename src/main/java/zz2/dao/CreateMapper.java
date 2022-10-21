package zz2.dao;


import zz2.entity.Rule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CreateMapper {
    int setRule(double dataSize, double maxRecommend,double maxClick ,double maxWeekRecommend,
                double Words1, double Words2, double Words3, double Words4,String dateStringPaese);

    List<Rule> getRule();


    int deleteRule(int id);
}
