package com.sample.factory;

public abstract class IAnimalFactory {

	public abstract IAnimal GetAnimalType(String type) throws Exception;
	
}
