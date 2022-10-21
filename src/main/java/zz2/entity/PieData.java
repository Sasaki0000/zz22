package zz2.entity;

public class PieData {
    public int id;
    public String pieName;
    public String dataName;
    public double percentge;
    public int dataOrigin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPieName() {
        return pieName;
    }

    public void setPieName(String pieName) {
        this.pieName = pieName;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public double getPercentge() {
        return percentge;
    }

    public void setPercentge(double percentge) {
        this.percentge = percentge;
    }

    public int getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(int dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    @Override
    public String toString() {
        return "PieData{" +
                "id=" + id +
                ", pieName='" + pieName + '\'' +
                ", dataName='" + dataName + '\'' +
                ", percentge=" + percentge +
                ", dataOrigin=" + dataOrigin +
                '}';
    }
}
