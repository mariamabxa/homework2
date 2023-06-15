import java.util.Objects;

class Patient {
    private String id;
    private String name;
    private int age;
    private double amountDue;

    public Patient(String id, String name, int age, double amountDue) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Amount Due: $" + amountDue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Patient patient = (Patient) obj;
        return age == patient.age &&
                Double.compare(patient.amountDue, amountDue) == 0 &&
                Objects.equals(id, patient.id) &&
                Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, amountDue);
    }
}

class InsuredPatient extends Patient {
    private String insuranceCompany;
    private double insuranceCoverage;

    public InsuredPatient(String id, String name, int age, double amountDue, String insuranceCompany, double insuranceCoverage) {
        super(id, name, age, amountDue);
        this.insuranceCompany = insuranceCompany;
        this.insuranceCoverage = insuranceCoverage;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Insurance Company: " + insuranceCompany + "\n" +
                "Insurance Coverage: " + (insuranceCoverage * 100) + "%";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        InsuredPatient insuredPatient = (InsuredPatient) obj;
        return Double.compare(insuredPatient.insuranceCoverage, insuranceCoverage) == 0 &&
                Objects.equals(insuranceCompany, insuredPatient.insuranceCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), insuranceCompany, insuranceCoverage);
    }
}
