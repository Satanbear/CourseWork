package test.model;

public class Paradigm {
    private int idParadigm;
    private String nameParadigm;

    public Paradigm(){ }

    public Paradigm(String nameParadigm){
        this.nameParadigm = nameParadigm;
    }

    public Paradigm(int idParadigm, String nameParadigm){
        this.idParadigm = idParadigm;
        this.nameParadigm = nameParadigm;
    }

    public int getIdParadigm(){ return idParadigm; }

    public void setIdParadigm(int idParadigm) { this.idParadigm = idParadigm; }

    public String getNameParadigm() { return nameParadigm; }

    public void setNameParadigm(String nameParadigm) { this.nameParadigm = nameParadigm; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paradigm{");
        sb.append("idParadigm=").append(idParadigm);
        sb.append(", nameParadigm=").append(nameParadigm);
        sb.append('}');
        return sb.toString();
    }
}
