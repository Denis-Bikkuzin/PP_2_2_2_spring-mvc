package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Mercedes-Benz", 7000, 1),
            new Car("BMW", 6150, 2),
            new Car("Volkswagen", 3500, 3),
            new Car("Audi", 5100, 4),
            new Car("Opel", 3650, 5)

    ));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.stream()
                .limit(Long.parseLong(String.valueOf(count)))
                .collect(Collectors.toList());
    }

}
