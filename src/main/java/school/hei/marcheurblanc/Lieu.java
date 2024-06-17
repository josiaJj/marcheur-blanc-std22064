package school.hei.marcheurblanc;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Lieu {
    private String nom;
    @Override
    public String toString() {
        return nom;
    }
}