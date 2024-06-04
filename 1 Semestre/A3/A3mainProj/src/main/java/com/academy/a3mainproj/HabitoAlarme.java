package com.academy.a3mainproj;

public class HabitoAlarme {
    private int fk_habito_id;
    private int fk_timer_id;
    
    HabitoAlarme(int fk_habito_id, int fk_timer_id){
        this.fk_habito_id = fk_habito_id;
        this.fk_timer_id = fk_timer_id;
    }
    
    public int getFk_habito_id() {
        return fk_habito_id;
    }
    
    public void setFk_habito_id(int fk_habito_id) {
        this.fk_habito_id = fk_habito_id;
    }

    public int getFk_timer_id() {
        return fk_timer_id;
    }

    public void setFk_timer_id(int fk_timer_id) {
        this.fk_timer_id = fk_timer_id;
    }
}
