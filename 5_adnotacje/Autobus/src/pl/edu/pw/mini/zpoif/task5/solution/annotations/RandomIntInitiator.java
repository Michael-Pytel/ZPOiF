package pl.edu.pw.mini.zpoif.task5.solution.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER, ElementType.METHOD, ElementType.CONSTRUCTOR })
public @interface RandomIntInitiator {
	int from();
	int to();
}
