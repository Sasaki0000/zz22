package zz2.entity;

public class CrawlerData {
    public int id;
    public String bookName;
    public String writerName;
    public int articalNumber;
    public String label;
    public String serials;
    public double words;
    public double recommonend;
    public double weekCRecommonend;
    public double click;
    public String time;
    public String coverLink;
    public String bookLink;

    @Override
    public String toString() {
        return "CrawlerData{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", writerName='" + writerName + '\'' +
                ", articalNumber=" + articalNumber +
                ", label='" + label + '\'' +
                ", serials='" + serials + '\'' +
                ", words=" + words +
                ", recommonend=" + recommonend +
                ", weekCRecommonend=" + weekCRecommonend +
                ", click=" + click +
                ", time='" + time + '\'' +
                ", coverLink='" + coverLink + '\'' +
                ", bookLink='" + bookLink + '\'' +
                '}';
    }

    public String getSerials() {
        return serials;
    }

    public void setSerials(String serials) {
        this.serials = serials;
    }

    public String getCoverLink() {
        return coverLink;
    }

    public void setCoverLink(String coverLink) {
        this.coverLink = coverLink;
    }

    public String getBookLink() {
        return bookLink;
    }

    public void setBookLink(String bookLink) {
        this.bookLink = bookLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getArticalNumber() {
        return articalNumber;
    }

    public void setArticalNumber(int articalNumber) {
        this.articalNumber = articalNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getWords() {
        return words;
    }

    public void setWords(double words) {
        this.words = words;
    }

    public double getRecommonend() {
        return recommonend;
    }

    public void setRecommonend(double recommonend) {
        this.recommonend = recommonend;
    }

    public double getWeekCRecommonend() {
        return weekCRecommonend;
    }

    public void setWeekCRecommonend(double weekCRecommonend) {
        this.weekCRecommonend = weekCRecommonend;
    }

    public double getClick() {
        return click;
    }

    public void setClick(double click) {
        this.click = click;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}