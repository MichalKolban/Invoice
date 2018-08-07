package Invoice;

public class InvoiceShop {



    public static void main(String[] args) {

        Client michael = new Client();
        michael.setName("Michael");
        michael.setLastName("Scott");

        Address addressMichael = new Address();
        addressMichael.setPostCode("94885-3030");
        addressMichael.setPostOffice("Scranton");

        Invoice invoice = new Invoice(michael,294,"4 May 2018", 859503.586);


        System.out.println("Podatnik : " + michael.getName() + " " + michael.getLastName());
        System.out.println("Rozliczenie z dnia : " + invoice.dateNow());
        System.out.println("Adres podatnika : " + addressMichael.getPostOffice() + " , " + addressMichael.getPostCode());
        System.out.println("Podatek wynosi : " + invoice.Tax());

        System.out.println();
        System.out.println("================");
        System.out.println();

        Client barry = new Client();
        barry.setName("Barry");
        barry.setLastName("Prince");

        Address addressBarry = new Address();
        addressBarry.setPostCode("856-485");
        addressBarry.setPostOffice("Los Angeles");

        Invoice invoiceBarry = new Invoice(barry,23,"May 5 2018",29304.8494);

        System.out.println(barry.getName() + " " + barry.getLastName());
        System.out.println(invoiceBarry.dateNow());
        System.out.println(addressBarry.getPostOffice() + " " + addressBarry.getPostCode());
        System.out.println("Podatek wynosi : " + invoiceBarry.Tax());
    }


}
