package api.bodies.track;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExternalUrls {
    @SerializedName("spotify")
    @Expose
    public String spotify;
}
