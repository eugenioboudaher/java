package TratamentoDeErros;

import java.util.Objects;

public class AlunoReduce {
    
    public final String nomeString;
    public final double nota;
    public final boolean bomComportamento;
    
    public AlunoReduce(String nomeString, double nota, boolean bomComportamento) {
        this.nomeString = nomeString;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }
    
    public AlunoReduce(String nomeString, double nota) {
        this(nomeString, nota, true);
    }

    @Override
    public String toString() {
        return "AlunoReduce [nomeString=" + nomeString + 
               ", nota=" + nota + 
               ", bomComportamento=" + bomComportamento + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(bomComportamento, nomeString, nota);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AlunoReduce other = (AlunoReduce) obj;
        return bomComportamento == other.bomComportamento &&
               Objects.equals(nomeString, other.nomeString) &&
               Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
    }
}
