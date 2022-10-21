package zz2.entity;

public class Data {
    public int id;
    public String ListName;
    public String BookName;
    public int TopList;
    public Double Information;
    public int DataOrigin;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return ListName;
    }

    public void setListName(String listName) {
        ListName = listName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getTopList() {
        return TopList;
    }

    public void setTopList(int topList) {
        TopList = topList;
    }

    public Double getInformation() {
        return Information;
    }

    public void setInformation(Double information) {
        Information = information;
    }

    public int getDataOrigin() {
        return DataOrigin;
    }

    public void setDataOrigin(int dataOrigin) {
        DataOrigin = dataOrigin;
    }
}
