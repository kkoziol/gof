package pl.kk.fso.car;


import pl.kk.fso.car.parts.ACType;
import pl.kk.fso.car.parts.Color;
import pl.kk.fso.car.parts.RadioType;
import pl.kk.fso.car.parts.TyresType;

public interface CarBuilder {

	public CarBuilder startNewCar();
	
	public CarBuilder withAC(ACType withAC);

	public CarBuilder paintInColor(Color color);

	public CarBuilder setSeats(int seats);

	public CarBuilder mountTyresType(TyresType tyresType);

	public CarBuilder mountRadioSystem(RadioType radio);

	public CarBuilder withGps(boolean withGps);

	public CarBuilder withComputer(boolean withComputer);

    Car build();
}