package ai.chalk.client;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Gadget {
    public String name;
    public double amount;
    public List<ChargeFlux> fluctuations;
}
