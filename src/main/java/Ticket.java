public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String departPoint;
    private String arriPoint;
    private int airTime;

    public Ticket(int id, int price, String departPoint, String arriPoint, int airTime) {
        this.id = id;
        this.price = price;
        this.departPoint = departPoint;
        this.arriPoint = arriPoint;
        this.airTime = airTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartPoint() {
        return departPoint;
    }

    public void setDepartPoint(String departPoint) {
        this.departPoint = departPoint;
    }

    public String getArriPoint() {
        return arriPoint;
    }

    public void setArriPoint(String arriPoint) {
        this.arriPoint = arriPoint;
    }

    public int getAirTime() {
        return airTime;
    }

    public void setAirTime(int airTime) {
        this.airTime = airTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price > o.price) return 1;
        else if (this.price < o.price) return -1;
        else return 0;
    }
}
