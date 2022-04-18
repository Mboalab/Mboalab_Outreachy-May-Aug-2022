package com.startapp.common.b;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface f {
    public boolean a() default false;

    public Class b() default "Ljava/lang/Object;";

    public Class c() default "Ljava/lang/String;";

    public Class d() default "Ljava/lang/String;";

    public Class e() default "Ljava/lang/String;";

    public String f() default "";
}

