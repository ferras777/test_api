package api.asserts;

import api.bodies.artist.ArtistBody;
import api.enums.Artists;
import org.testng.Assert;

public class ArtistAsserts {

    public void checkResponseRightName(ArtistBody artistBody, Artists artist) {
        Assert.assertEquals(artistBody.getName(), artist.getNAME(), "Wrong name");
    }


}
