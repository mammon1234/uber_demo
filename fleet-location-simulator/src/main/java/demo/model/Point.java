package demo.model;

/**
 * Created by root on 11/18/16.
 */
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Denotes a point on the globe.
 */
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Point {
    private Double latitude;
    private Double longitude;

    @Override
    public String toString() {
        return "Point [lat/lang:" + latitude + "," + longitude + "]";
    }

}
