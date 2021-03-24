package com.deepank.testing.requests;

import com.deepank.testing.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequests {
	DrawShape d;
	
	@Inject
	public SquareRequests(DrawShape d) {
		this.d = d;
	}
	
	public void makeRequests() {
		d.draw();
	}
}
