package com.example.trackit_covid19tracking;

public class state_modal {

   String Name,cas,rec,dea,active;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getDea() {
        return dea;
    }

    public void setDea(String dea) {
        this.dea = dea;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public state_modal(String name, String cas, String rec, String dea, String active) {
        Name = name;
        this.cas = cas;
        this.rec = rec;
        this.dea = dea;
        this.active=active;
    }
}
