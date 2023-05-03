package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> listCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Ferrari", 1989));
        cars.add(new Car(2, "BMW", 2021));
        cars.add(new Car(3, "Audi", 2010));
        cars.add(new Car(4, "Bently", 2000));
        cars.add(new Car(5, "Acura", 1999));
        return cars.stream().limit(count).toList();
    }
}
