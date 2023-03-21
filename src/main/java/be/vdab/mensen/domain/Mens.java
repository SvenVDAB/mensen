package be.vdab.mensen.domain;

public class Mens {
    private long id;
    private String voornaam;
    private String familienaam;

    public Mens(long id, String voornaam, String familienaam) {
        this.id = id;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public long getId() {
        return id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }
}
