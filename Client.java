package Invoice;


public class Client {



    public String CompanyName = "YoMamaSoFat" ;

    private String name;
    private String lastName;
    private Address address;



    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public Address address(){
        return address;
    }
    public void setAdress(Address adress){
        this.address = address;
    }


    public void introduceYourself() {
        System.out.println("My name is : " + FirstAndLastName());


    }

    private String FirstAndLastName () {
        return getName() + " " + getLastName();
    }
}
