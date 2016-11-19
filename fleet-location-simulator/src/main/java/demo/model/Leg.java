package demo.model;

/**
 * Created by root on 11/18/16.
 */
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Leg {
    private Integer id;
    private Point startPosition;
    private Point endPosition;
    private Double length;
    private Double heading;
}