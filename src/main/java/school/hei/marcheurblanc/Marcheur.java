package school.hei.marcheurblanc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Marcheur {
    private String nom;
    private String paysDorigine;
    private List<Rue> listeTrajetsParcourus = new ArrayList<>();


    public Rue marcher(Lieu lieuDepart, Lieu lieuArriveeFinal) {

        while(lieuArrivee == lieuArriveeFinal) {

        }
        Rue rue = new Rue(lieuDepart, lieuArrivee);
        listeTrajetsParcourus.add(rue);
        System.out.println(listeTrajetsParcourus);
        return rue;
    }

}
