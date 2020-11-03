package api.bodies.error;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ErrorBody {

    @SerializedName("error")
    private Error error;

    @Getter
    public static class Error {

        @SerializedName("status")
        private int status;

        @SerializedName("message")
        private String message;
    }
}