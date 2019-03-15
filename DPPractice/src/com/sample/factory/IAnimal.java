package com.sample.factory;

interface IAnimal {
	void Speak();
}

class Duck implements IAnimal {

	@Override
	public void Speak() {
		System.out.println("Duck says Pack-pack");
	}
	
}

class Tiger implements IAnimal {
	@Override
	public void Speak() {
		System.out.println("Tiger says Halum..Halum");
	}
}
