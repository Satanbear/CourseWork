package test.model;

public class Language {
    private int idLanguage;
    private String nameLanguage;
    private String nameParadigm;
    private String level;
    private String type;

    public Language(){ }

    public Language(String nameLanguage){
        this.nameLanguage = nameLanguage;
    }

    public Language(String nameParadigm, String level, String type){
        this.nameParadigm = nameParadigm;
        this.level = level;
        this.type = type;
    }

    public Language(String nameLanguage, String nameParadigm, String level, String type){
        this.nameParadigm = nameParadigm;
        this.nameLanguage = nameLanguage;
        this.level = level;
        this.type = type;
    }

    public Language(int idLanguage, String nameLanguage, String nameParadigm, String level, String type){
        this.idLanguage = idLanguage;
        this.nameLanguage = nameLanguage;
        this.nameParadigm = nameParadigm;
        this.level = level;
        this.type = type;
    }

    public int getIdLanguage() { return idLanguage; }

    public void setIdLanguage(int idLanguage) { this.idLanguage = idLanguage; }

    public String getNameLanguage() { return nameLanguage; }

    public void setNameLanguage(String nameLanguage) { this.nameLanguage = nameLanguage; }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getNameParadigm() { return nameParadigm; }

    public void setNameParadigm(String nameParadigm) { this.nameParadigm = nameParadigm; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Language{");
        sb.append("idLanguage=").append(idLanguage);
        sb.append(", nameLanguage=").append(nameLanguage);
        sb.append(", nameParadigm=").append(nameParadigm);
        sb.append(", level=").append(level);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
