package com.parkinglotlld.vechile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


abstract class Vechile {
    String liecencPlate;
    String vechileType;

    //Parameteric Constructor
    public Vechile(String liecencPlate, String vechileType) {
        this.liecencPlate = liecencPlate;
        this.vechileType = vechileType;
    }

    public String getLiecencPlate() {
        return liecencPlate;
    }

    public String getVechileType() {
        return vechileType;
    }
    public abstract double calculateFee(int hourStayed);
}
