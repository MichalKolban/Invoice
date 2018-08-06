package Invoice;

public class Invoice {


    public static double Vat = 0.19;

    private Client client;
    private int id;
    private String date;
    private int income;


    public Invoice(Client client, int id, String date, int income){

        this.client = client;
        this.id = id;
        this.date = date;
        this.income = income;
    }

    public double Tax() {
        return (0.19 * income);
    }
}
