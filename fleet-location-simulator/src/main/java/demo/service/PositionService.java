package demo.service;

/**
 * Created by root on 11/18/16.
 */
import demo.model.CurrentPosition;

public interface PositionService {

    void processPositionInfo(long id,
                             CurrentPosition currentPosition,
                             boolean exportPositionsToKml,
                             boolean sendPositionsToIngestionSerice);

}