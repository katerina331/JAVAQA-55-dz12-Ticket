public class Repository {
    Ticket[] items = new Ticket[0];

    public void add(Ticket item) {
        Ticket[] temp = new Ticket[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[temp.length - 1] = item;
        items = temp;
    }

    public Ticket[] findAll() {
        return items;
    }

    public void delId(int id) {
        Ticket[] temp = new Ticket[items.length - 1];
        int i = 0;
        for (Ticket item : items) {
            if (item.getId() != id) {
                temp[i] = item;
                i++;
            }
        }
        items = temp;
    }
}
