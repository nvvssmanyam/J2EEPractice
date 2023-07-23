package com.sample.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("*** Facotry Pattern Demo ***\n");
		IAnimalFactory animalFactory = new ConcreteFactory();
		
		IAnimal DuckType = animalFactory.GetAnimalType("Duck");
		DuckType.Speak();
		
		IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
		TigerType.Speak();
		
		IAnimal LionType = animalFactory.GetAnimalType("Lion");
		LionType.Speak();
	}
	
}
