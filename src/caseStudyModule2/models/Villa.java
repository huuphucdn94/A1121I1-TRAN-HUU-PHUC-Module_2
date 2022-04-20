package caseStudyModule2.models;

public class Villa extends Facility {
    private String standardVilla;
    private double area;
    private int floor;

    public Villa(){

    }

    public Villa(String standardVilla, double area, int floor) {
        this.standardVilla = standardVilla;
        this.area = area;
        this.floor = floor;
    }

    public Villa(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double area,
                 int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.area = area;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardVilla='" + standardVilla + '\'' +
                ", area=" + area +
                ", floor=" + floor +
                '}';
    }
}
