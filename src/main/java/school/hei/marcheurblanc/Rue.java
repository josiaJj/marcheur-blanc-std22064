package school.hei.marcheurblanc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@ToString
public class Rue {
    Lieu lieu1 = new Lieu();
    Lieu lieu2 = new Lieu();
    @Override
    public String toString() {
        return lieu1 + " vers " + lieu2;
    }
}
