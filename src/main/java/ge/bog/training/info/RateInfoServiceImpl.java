package ge.bog.training.info;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RateInfoServiceImpl implements RateInfoService {

    private Map<String, Double> rateInfo = new HashMap<>();

    {
        rateInfo.put("USD", 3.30);
        rateInfo.put("EUR", 4.05);
        rateInfo.put("GBP", 4.55);
    }

    @Override
    public Map<String, Double> getRateInfo() {
        return rateInfo;
    }
}
