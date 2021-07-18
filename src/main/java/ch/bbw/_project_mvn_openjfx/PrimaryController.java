package ch.bbw._project_mvn_openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtVorname;
    @FXML
    private TextField txtEmail;
    @FXML
    private DatePicker geburtsdatum;
    @FXML
    private Slider groesse;
    @FXML
    private TextField gewicht;
    @FXML
    private TextField strasse;
    @FXML
    private TextField plz;
    @FXML
    private TextField ort;
    @FXML
    private TextField telefonnr;
    @FXML
    private Slider schuheGroesse;
    @FXML
    private ChoiceBox<String> fahrstil;
    @FXML
    private DatePicker ausleihdatum;
    @FXML
    private DatePicker zurueckam;
    @FXML
    private ToggleGroup level;
    @FXML
    private ToggleGroup miete;
    @FXML
    private ToggleGroup geschlecht;

    /**
     * Fields
     */
    // Customer List
    private ObservableList<Customer> customers = FXCollections.observableArrayList();

    private final ObservableList<String> fahrstilList = FXCollections.observableArrayList(
            "Tiefschnee", "Freestyle", "All-Mountain","Touren");

    /**
     * some customers
     * <p>
     * mit Liste
     *
     * @return
     */
    private ObservableList<Customer> getCustomers() {
        ObservableList<Customer> customers = FXCollections.observableArrayList(
                //	new Customer("Giovanni", "Cucuzza", "gc@bbw.ch","055 555 55 55",,,,,,,, );
        );
        return customers;

    }

    /**
     * initialisierungsmethode von FXML
     */
    @FXML
    private void initialize() {
        // set data
        fahrstil.setItems(fahrstilList);
    }

    @FXML
    public void onButtonSave() {
        System.out.println("button klicked");


        if(!validateIsNumPlz()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ungültige Postleitzahl");
            alert.setHeaderText("Ungültige Postleitzahl");
            alert.setContentText("Ihre/n Email Postleitzahl ist nicht gültig. Bitte geben \n Sie eine gültige PLZ ein!");

            alert.showAndWait();
        }  else if (!validateIsNumGewicht()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ungültiger Gewicht");
            alert.setHeaderText("Ungültige Gewicht");
            alert.setContentText("Bitte geben Sie einen Zahl ein!");

            alert.showAndWait();
        } else {
            Customer customer = new Customer();

            customer.setLastname(txtName.getText());
            customer.setFirstname(txtVorname.getText());
            customer.setEmail(txtEmail.getText());
            customer.setTelephone(telefonnr.getText());
            customer.setAddress(strasse.getText());
            customer.setPlz(Integer.parseInt(plz.getText()));
            customer.setLocation(ort.getText());
            customer.setRentalType(miete.getSelectedToggle().toString());
            customer.setLevel(level.getSelectedToggle().toString());
            customer.setGender(geschlecht.getSelectedToggle().toString());
            customer.setBirthdate(geburtsdatum.getValue());
            customer.setHeight(groesse.getValue());
            customer.setWeight(Double.parseDouble(gewicht.getText()));
            customer.setShoeSize((int) schuheGroesse.getValue());
            customer.setStyle(fahrstil.getValue());
            customer.setRentedOut(ausleihdatum.getValue());
            customer.setReturnedOn(zurueckam.getValue());

            customers.add(customer);
        }

        for (Customer customer1 : customers) {
            System.out.println(customer1.toString());
        }
    }

    private boolean validateIsNumPlz() {
        String regex = "^[0-9]+([,.][0-9]+)?$";
        return plz.getText().matches(regex);
    }

    private boolean validateIsNumGewicht() {
        String regex = "^[0-9]+([,.][0-9]+)?$";
        return gewicht.getText().matches(regex);
    }


}
