package ge.bog.training.info;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface RateInfoService {

    Map<String, Double> getRateInfo();
}
