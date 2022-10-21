package zz2.service;

import zz2.support.RequestResult;

public interface PieDataService {
    RequestResult selectPieInformation(String pieName, int dataOrigin);
}
