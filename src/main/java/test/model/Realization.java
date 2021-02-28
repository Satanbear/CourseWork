package test.model;

public class Realization {
    private int idRealization;
    private String nameRealization;
    private String compile;
    private String nameLanguage;

    public Realization(){ }

    public Realization(String nameLanguage, String nameRealization, String compile){
        this.nameLanguage = nameLanguage;
        this.nameRealization = nameRealization;
        this.compile = compile;
    }

    public Realization(String nameRealization, String compile){
        this.nameRealization = nameRealization;
        this.compile = compile;
    }

    public Realization(int idRealization, String nameLanguage, String nameRealization, String compile){
        this.idRealization = idRealization;
        this.nameLanguage = nameLanguage;
        this.nameRealization = nameRealization;
        this.compile = compile;
    }

    public int getIdRealization() { return idRealization; }

    public void setIdRealization(int idRealization) { this.idRealization = idRealization; }

    public String getCompile() { return compile; }

    public void setCompile(String compile) { this.compile = compile; }

    public String getNameRealization() { return nameRealization; }

    public void setNameRealization(String nameRealization) { this.nameRealization = nameRealization; }

    public String getNameLanguage() { return nameLanguage; }

    public void setNameLanguage(String nameLanguage) { this.nameLanguage = nameLanguage; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Realization{");
        sb.append("idRealization=").append(idRealization);
        sb.append(", nameLanguage=").append(nameLanguage);
        sb.append(", nameRealization=").append(nameRealization);
        sb.append(", compile=").append(compile);
        sb.append('}');
        return sb.toString();
    }
}
