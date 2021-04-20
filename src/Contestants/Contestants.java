package Contestants;

//import PriorityLevel.PriorityLevel;
import CombinationOfSubjects.combinationOfSubjects;

public class Contestants {
    private int identificationNumber;
    private String name;
    private String address;
    private int priorityLevel;
    private combinationOfSubjects combinationOfSubjects;

    public Contestants(String name, String address, int priorityLevel, combinationOfSubjects combinationOfSubjects,int identificationNumber) {
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.combinationOfSubjects = combinationOfSubjects;
        this.identificationNumber = identificationNumber;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public combinationOfSubjects getCombinationOfSubjects() {

        return combinationOfSubjects;
    }

    public void setCombinationOfSubjects(combinationOfSubjects combinationOfSubjects) {
        this.combinationOfSubjects = combinationOfSubjects;
    }

    @Override
    public String toString() {
        return "Contestants{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", combinationOfSubjects=" + combinationOfSubjects +
                ", identificationNumber"+identificationNumber +
                '}';
    }
}
