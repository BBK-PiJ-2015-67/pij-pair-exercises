public class HospitalManager {
    private Patient patientList = null;

    public static void main(String[] args) {

        HospitalManager hm = new HospitalManager();

        Patient dave = new Patient("Dave", 32, "Hives");
        hm.patientList = dave;

        Patient bob = new Patient("Bob", 87, "Arrythmia");
        hm.patientList.addPatient(bob);

        Patient sara = new Patient("Sara", 72, "Heart disease");
        hm.patientList.addPatient(sara);

        Patient jill = new Patient("Jill", 99, "Age");
        hm.patientList.addPatient(jill);

        Patient jane = new Patient("Jane", 12, "Gentle warts");
        hm.patientList.addPatient(jane);

        Patient moh = new Patient("Mohammed", 22, "Psychosis");
        hm.patientList.addPatient(moh);

        hm.patientList.prettyPrintAll();

        System.out.println("Deleting Sara, Jane");

        hm.patientList.deletePatient(sara);
        hm.patientList.deletePatient(jane);

        hm.patientList.prettyPrintAll();

        System.out.println("Adding Jack");

        Patient jack = new Patient("Jack", 57, "Agoraphobia");
        hm.patientList.addPatient(jack);

        hm.patientList.prettyPrintAll();

        System.out.println("Deleting Mohammed");

        hm.patientList.deletePatient(moh);

        hm.patientList.prettyPrintAll();

        System.out.println("Deleting Dave");

        hm.patientList.prettyPrintAll();
    }
}

