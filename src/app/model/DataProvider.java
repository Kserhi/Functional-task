package app.model;

import app.entitis.ContactEntiti;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public List<ContactEntiti> getData() {
        return Arrays.asList(
                new ContactEntiti("Pavlo", "12442"),
                new ContactEntiti("Andri", "325332"),
                new ContactEntiti("Serhii", "254224"),
                new ContactEntiti("Petro", "335532")
        );


    }
}
