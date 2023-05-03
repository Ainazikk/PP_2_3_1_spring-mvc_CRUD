package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarServiceImpl carServiceImp;

    public CarController(CarServiceImpl carServiceImp) {this.carServiceImp = carServiceImp;}

    @GetMapping (value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        if(count == null) count = 5;
        model.addAttribute("cars", carServiceImp.listCars(count));
        return "car";
    }
}
