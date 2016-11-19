package demo.service.impl;

/**
 * Created by root on 11/18/16.
 */
import demo.model.CurrentPosition;
import demo.service.PositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DefaultPositionService implements PositionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPositionService.class);

//    @Autowired
//    private KmlService kmlService;

    //    @Autowired
//    @LoadBalanced
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${com.ross.fleet.location.ingest}")
    private String fleetLocationIngest;

    public DefaultPositionService() {
        super();
    }

    //    @HystrixCommand(fallbackMethod = "processPositionInfoFallback")
    @Override
    public void processPositionInfo(long id, CurrentPosition currentPosition, boolean exportPositionsToKml,
                                    boolean sendPositionsToIngestionService) {

//        if (exportPositionsToKml) {
//            this.kmlService.updatePosition(id, currentPosition);
//        }

        if (sendPositionsToIngestionService) {
            this.restTemplate.postForLocation(fleetLocationIngest + "/api/locations", currentPosition);
        }

    }

    public void processPositionInfoFallback(long id, CurrentPosition currentPosition, boolean exportPositionsToKml,
                                            boolean sendPositionsToIngestionService) {
        LOGGER.error("Hystrix Fallback Method. Unable to send message for ingestion.");
    }

}
