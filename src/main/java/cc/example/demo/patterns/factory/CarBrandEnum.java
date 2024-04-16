package cc.example.demo.patterns.factory;

import lombok.Getter;

@Getter
public enum CarBrandEnum {
    BMW("BMW"),
    BENZ("BENZ");

    final String brand;

    CarBrandEnum(String brand) {
        this.brand = brand;
    }

}
