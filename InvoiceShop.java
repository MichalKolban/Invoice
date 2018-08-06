package Invoice;

public class InvoiceShop {



    public static void main(String[] args) {

        Client michael = new Client();
        michael.setName("Michael");
        michael.setLastName("Scott");

        Address addressMichael = new Address();
        addressMichael.setPostCode("94885-3030");
        addressMichael.setPostOffice("Scranton");

        Invoice invoice = new Invoice(michael,1902,"20 May 2018",23500 );


        System.out.println("Podatnik : " + michael.getName() + " " + michael.getLastName());
        System.out.println(addressMichael.getPostOffice() + " " + addressMichael.getPostCode());
        System.out.println("Podatek wynosi : " + invoice.Tax());


    }
}
