package zz2;

public class RandomNum {
    //生成指定范围随机数
//    public long getNum(long begin, long end) {
//        long rtn = begin + (long) (Math.random() * (end - begin));
//        if (rtn == begin || rtn == end) {
//            return getNum(begin, end);
//        }
//        return rtn;
//    }

    //生成指定范围随机数
    public int getNum(double start, double end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }
}
