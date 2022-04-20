package caseStudyModule2.models;

public class Booking {
    private int idBooking;
    private String startDate;
    private String endDATE;
    private Customer customer;
    private Facility facility;
    public Booking(){

    }

    public Booking(int idBooking, String startDate, String endDATE, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDATE = endDATE;
        this.customer = customer;
        this.facility = facility;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDATE() {
        return endDATE;
    }

    public void setEndDATE(String endDATE) {
        this.endDATE = endDATE;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDATE='" + endDATE + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
