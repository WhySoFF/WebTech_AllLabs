package by.bsuir.ArtemShel.JunitTests.task9Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task9.classes.Ball;
import by.bsuir.ArtemShel.task9.classes.Basket;
import by.bsuir.ArtemShel.task9.util.DoTask;

class Task9Test {

		Basket basket = new Basket();
	@BeforeEach
    void setUpBasket(){
        
        basket.addBall(new Ball("red", 10));
        basket.addBall(new Ball("blue", 17.2));
        basket.addBall(new Ball("blue", 4.7));
        basket.addBall(new Ball("blue", 1.1));
    }

    @Test
    void getBallsWeight() {
 

    	Assertions.assertEquals(33.0, DoTask.getBallsWeight(basket),0.01);


        Assertions.assertEquals(3, DoTask.getCountOfColoredBalls(basket, "blue"));
    }

  
   

}
