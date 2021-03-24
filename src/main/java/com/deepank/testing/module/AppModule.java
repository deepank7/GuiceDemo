package com.deepank.testing.module;

import com.deepank.testing.services.DrawShape;
import com.deepank.testing.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
	}

}
