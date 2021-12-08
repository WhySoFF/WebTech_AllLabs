package by.bsuir.ArtemShel.task9.util;

import by.bsuir.ArtemShel.task9.classes.Basket;

import java.util.LinkedList;

import by.bsuir.ArtemShel.task9.classes.Ball;

public class DoTask {

	 public static double getBallsWeight(Basket basket) {
	        double weight = 0;

	        if (basket == null) {
	            throw new IllegalArgumentException("Basket shouldn't be null");
	        }

	        for (Ball ball : basket.getBallsList()) {
	            weight += ball.getWeight();
	        }
	        return weight;
	    }
	 
	
	 
	 private static LinkedList<Ball> getBallsListByColour(Basket basket, String colour) {
		 	LinkedList<Ball> ballsList = new LinkedList<>();

	        if (basket == null) {
	            throw new IllegalArgumentException("Basket shouldn't be null");
	        }
	        if ((colour == null) || colour.isEmpty()) {
	            throw new IllegalArgumentException("Colour shoudn't be null");
	        }

	        for (Ball ball : basket.getBallsList()) {
	        	
	            if (ball.getColour().toLowerCase().equals(colour.toLowerCase())) {
	                ballsList.add(ball);
	            }
	        }
	        return ballsList;
	    }
	 
	 
	 public static int getCountOfColoredBalls(Basket basket, String colour) throws IllegalArgumentException  {
		 
		 return getBallsListByColour(basket, colour).size();
	 }
}
