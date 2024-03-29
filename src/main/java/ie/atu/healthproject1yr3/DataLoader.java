package ie.atu.healthproject1yr3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PatientRepository patientRepository;

    @Autowired
    public DataLoader(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public void run(String... args) throws Exception

    {
        //creating data for my database
        Patient testData = new Patient(1L, "Amy", "McCarthy", "Female", "12345", 24, "0851134567", "Amy@atu.ie", "Mervue, Galway");
        Patient testData2 = new Patient(2L, "Brian", "Sexton", "Male", "21345", 28, "0851638767", "Brian@atu.ie", "Ennis, Clare");
        Patient testData3 = new Patient(3L, "Cathy", "Cogan", "Female", "312345", 19,  "0874653891", "Cathy@atu.ie", "Westport, Mayo");
        patientRepository.save(testData);
        patientRepository.save(testData2);
        patientRepository.save(testData3);
    }
}
