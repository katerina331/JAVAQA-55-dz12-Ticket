import java.util.Arrays;

public class TicketManager {
    Repository repo = new Repository();

    public void add(Ticket item) {
        repo.add(item);
    }

    public void delId(int id) {
        repo.delId(id);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        int i = 0;
        for (Ticket product : repo.findAll()) {
            if ((product.getDepartPoint().contains(from)) && (product.getArriPoint().contains(to))) {
                Ticket[] temp = new Ticket[result.length + 1];
                if (result.length > 0) for (int j = 0; j < result.length; j++) {
                    temp[j] = result[j];
                }
                temp[temp.length - 1] = repo.items[i];
                result = temp;
            }
            i++;
        }

        Arrays.sort(result);
        return result;
    }
}
