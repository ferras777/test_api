package api;

import api.asserts.TrackAssertions;
import api.bodies.track.TrackBody;
import api.enums.Tracks;
import api.requests.TrackRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static api.enums.Tracks.*;

public class TrackTest {

    TrackRequests trackRequests = new TrackRequests();
    TrackAssertions trackAssertions = new TrackAssertions();

    @DataProvider(parallel = true)
    public Object[][] tracks() {
        return new Object[][]{
                {HYPE},
                {BREAKTHRU},
                {BRIGHTSIDE}
        };
    }

    @Test(description = "Preview download tracks", dataProvider = "tracks")
    public void checksContentTypePreviewTrack(Tracks track) {
        TrackBody trackBody = trackRequests.getTrackBody(track.getId());

        trackAssertions.checkContentTypeIsAudio(trackBody);
    }
}
