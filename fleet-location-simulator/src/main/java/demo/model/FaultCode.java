package demo.model;

/**
 * Created by root on 11/18/16.
 */
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FaultCode {

    private String engineMake;
    private String faultCode;
    private String faultCodeId;
    private String faultCodeClassification;
    private String description;
    private String repairInstructions;
    private String fmi;
    private String sa;
    private String spn;

}
