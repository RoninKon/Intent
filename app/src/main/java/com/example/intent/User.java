package com.example.intent;

import java.io.Serializable;

public class User implements Serializable {
    private String I_d;
    private String abTime;
    private String NachTime;
    private String money;
    private String p_lace;

    public User(String i_d, String abTime, String nachTime, String money, String p_lace) {
        this.I_d = i_d;
        this.abTime = abTime;
        this.NachTime = nachTime;
        this.money = money;
        this.p_lace = p_lace;
    }

    public String getI_d() {
        return I_d;
    }

    public void setI_d(String i_d) {
        this.I_d = i_d;
    }

    public String getAbTime() {
        return abTime;
    }

    public void setAbTime(String abTime) {
        this.abTime = abTime;
    }

    public String getNachTime() {
        return NachTime;
    }

    public void setNachTime(String nachTime) {
        this.NachTime = nachTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getP_lace() {
        return p_lace;
    }

    public void setP_lace(String p_lace) {
        this.p_lace = p_lace;
    }
}
