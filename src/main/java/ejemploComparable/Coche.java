package ejemploComparable;

import java.io.Serializable;

public class Coche  implements Comparable<Coche>{
    private String matricula;
    private int bastidor;

    public Coche(String matricula, int bastidor) {
        this.matricula = matricula;
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public int compareTo(Coche o) {
        return this.matricula.compareTo(o.getMatricula());
    }

}
