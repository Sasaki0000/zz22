package zz2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import zz2.entity.PieData;

import java.util.List;
@Repository
@Mapper
public interface PieDataMapper {
        List<PieData> selectPieInformation(String pieName, int dataOrigin);
}
