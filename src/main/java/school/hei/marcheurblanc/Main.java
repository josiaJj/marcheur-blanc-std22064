package school.hei.marcheurblanc;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Marcheur Bjarni = new Marcheur();
        Lieu lieu1 = new Lieu("HEI");
        Lieu lieu2 = new Lieu("ESTI");
        Lieu lieu3 = new Lieu("Pullman");
        Lieu lieu4 = new Lieu("Nexta");
        Bjarni.marcher(lieu1, lieu2);
        Bjarni.marcher(lieu2, lieu3);
        Bjarni.marcher(lieu3, lieu1);
    }
}