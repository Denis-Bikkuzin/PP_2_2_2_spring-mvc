package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDaoImp carDaoImp;

    @Autowired
    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Override
    public List<Car> getCars(int number) {
        return carDaoImp.getCars(number);
    }
}
