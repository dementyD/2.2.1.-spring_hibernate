package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private String model;
    private Integer series;

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public Long getCar_id() {
        return id;
    }

    public void setCar_id(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
