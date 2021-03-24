package com.deepank.testing.main;

import com.deepank.testing.module.AppModule;
import com.deepank.testing.requests.SquareRequests;
import com.deepank.testing.services.DrawShape;
import com.deepank.testing.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {

	private static final String SQUARE_REQ = "SQUARE";
	
	private static void sendRequest(String sq) {
		if(sq.equals(SQUARE_REQ)) {
//			DrawShape d = new DrawSquare();
//			DrawShape d = injector.getInstance(DrawShape.class);
//			SquareRequests request = new SquareRequests(d);
			Injector injector = Guice.createInjector(new AppModule());
			SquareRequests request = injector.getInstance(SquareRequests.class);
			request.makeRequests();
		}
	}
	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);
	}

}
