package ge.bog.training.info;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/info")
public class InfoController {

    public InfoController(RateInfoService rateInfoService) {
        this.rateInfoService = rateInfoService;
    }

    private RateInfoService rateInfoService;

    @GetMapping("/ccy/{ccy}")
    ResponseEntity<Double> getRateInfo(@PathVariable String ccy) {
        Double result = rateInfoService.getRateInfo().get(ccy);

        if (result == null) {
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
