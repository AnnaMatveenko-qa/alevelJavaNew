package ua.matveenko.hw13;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Box {
    private String from;
    private String material;
    private String color;
    @SerializedName("max-lifting-capacity")
    private MaxLiftingCapacity maxLiftingCapacity;
    private Map<String, String> cargo;
    @SerializedName("delivery-date")
    private String deliveryDate;
}
