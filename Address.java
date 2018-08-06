package Invoice;

public class Address {

    private String postOffice;
    private String postCode;


    public String getPostOffice(){
        return postOffice;
    }
    public void setPostOffice (String postOffice){
        this.postOffice = postOffice;
    }
    public String getPostCode(){
        return postCode;
    }
    public void setPostCode (String postCode){
        this.postCode = postCode;
    }

    private String wholeAddress(){
        return (getPostOffice() + " " + getPostCode());
    }

}
