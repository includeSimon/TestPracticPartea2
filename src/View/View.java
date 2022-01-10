package View;

import Repository.BestellungRepository;
import Repository.ProduktRepository;

public class View {
    private ProduktRepository produktRepo;
    private BestellungRepository bestellungRepo;

    public void welcomeMessage(){
        System.out.println("1. show product by index number \n");
        System.out.println("2. show all products\n");
        System.out.println("3. update product\n");
        System.out.println("4. delete product\n");
        System.out.println("5. exit");
    }

    public void main(){
        int choice = 5;
        welcomeMessage();
        
    }
}
