package algodat;

import java.io.Serializable;

public class Data implements Serializable {
    public String fname, lname;        //First name and last name
    public String bday;                //Date of Birth, format "DD-MM-YYYY"
    public int inum;                   //insurance number;

    public Data(String fname, String lname, String bday, int inum){
        setFirstName(fname);
        setLastName(lname);
        setBirthday(bday);
        setInsuranceNumber(inum);
    }
    //Getter
    public String getFirstName(){ return fname; }
    public String getLastName(){ return lname; }
    public String getBirthday(){ return bday; }
    public int getInsuranceNumber(){ return inum; }

    //Setter
    public void setFirstName(String fname){ this.fname = fname; }
    public void setLastName(String lname){ this.lname = lname; }
    public void setBirthday(String bday){ this.bday = bday; }
    public void setInsuranceNumber(int inum){ this.inum = inum; }

    @Override
    public String toString() {
        return "Vorname: " + getFirstName() + "\n" +
                "Nachname: " + getLastName() + "\n" +
                "Geburtsdatum: " + getBirthday() + "\n" +
                "Versicherungsnummer: " + getInsuranceNumber() + "\n";
    }
}
