package zz2.service;


import zz2.support.RequestResult;

public interface CreateService {
    RequestResult setRule(double dataSize, double maxRecommend, double maxClick,
                          double maxWeekRecommend, double Words1,
                          double Words2, double Words3, double Words4);

    RequestResult getRule();

    RequestResult deleteRule(int id);
}
