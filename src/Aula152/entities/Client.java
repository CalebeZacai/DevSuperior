package Aula152.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String clientName;
    private String clientEmail;
    private Date clientBirthDate;

    public Client(String clientName, String clientEmail, Date clientBirthDate) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientBirthDate = clientBirthDate;
    }

    public String getName() {
        return clientName;
    }

    public void setName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return clientEmail;
    }

    public void setEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Date getBirthDate() {
        return clientBirthDate;
    }

    public void setBirthDate(Date clientBirthDate) {
        this.clientBirthDate = clientBirthDate;
    }

    public String toString() {
        return clientName
                + " (" + sdf.format(clientBirthDate)
                + ") - "
                + clientEmail;
    }
}
