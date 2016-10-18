package beans;

import org.springframework.beans.factory.FactoryBean;

public class carFactory<Car> implements FactoryBean<Car>{
	
	public  String carname;
	public  void setCarname(String carname) {
		this.carname = carname;
	}
		@Override
	public Car getObject() throws Exception 
	{
		Car c=(Car)Class.forName(carname).newInstance();
		return c;
	}

	@Override
	public Class<Car> getObjectType() {
		
		try 
		{
		  return (Class<Car>) Class.forName(carname).getClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
// make the Car singleton 
	@Override
	public boolean isSingleton() {
		return true;
	}

}
