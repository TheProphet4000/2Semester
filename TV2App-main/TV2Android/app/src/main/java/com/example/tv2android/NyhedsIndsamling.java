package com.example.tv2android;

public class NyhedsIndsamling {
    private String overskrift;
    private String teaserTekst;
    private String linkTillStillBillede;
    private String udgivelsesDato;
    private boolean udgivelsesStatus;
    private boolean slettet;

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public void setTeaserTekst(String teaserTekst) {
        this.teaserTekst = teaserTekst;
    }

    public void setLinkTillStillBillede(String linkTillStillBillede) {
        this.linkTillStillBillede = linkTillStillBillede;
    }

    public void setUdgivelsesDato(String udgivelsesDato) {
        this.udgivelsesDato = udgivelsesDato;
    }

    public void setUdgivelsesStatus(boolean udgivelsesStatus) {
        this.udgivelsesStatus = udgivelsesStatus;
    }

    public void setSlettet(boolean slettet) {
        this.slettet = slettet;
    }


    public String getOverskrift() {
        return overskrift;
    }

    public String getTeaserTekst() {
        return teaserTekst;
    }

    public String getLinkTillStillBillede() {
        return linkTillStillBillede;
    }

    public String getUdgivelsesDato() {
        return udgivelsesDato;
    }

    public boolean Udgivet() {
        return udgivelsesStatus;
    }

    public boolean Slettet() {
        return slettet;
    }
}
