
import fr.ujf_grenoble.l3miage.medical.Patient;
import java.util.ArrayList;

public class TestCabinetInfirmier {
    public static void main(String[] args) {
        
             System.out.println("TEST hello");
            Services services =  new Services();
            System.out.println("hello (Aurelien) = "  +services.hello("Aurelien"));
            
        
            System.out.println("TEST getStLength");
            System.out.println("taille bob = "  +services.getStrLength("bob"));
            
            System.out.println("TEST getNomCabinet");
            System.out.println("Nom du cabinet = "  +services.getNomCabinet());
            
            int idPatient = 001;
            System.out.println("TEST getListePatientsStr");
            System.out.println("getListePatientsStr("+idPatient+") = "  +services.getListePatientsStr(idPatient));
            
            System.out.println("TEST getListePatients");
            ArrayList<Patient> listePatients = (ArrayList<Patient>) services.getListePatients(idPatient);
            
            for(Patient p: listePatients)
            {
                System.out.println("Patient (id = "+idPatient+") = " + p.getNom() +" "+p.getPrénom());
            }
    }
    
    
    
}
