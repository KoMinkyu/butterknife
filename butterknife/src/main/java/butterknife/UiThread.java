package butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by minkyu on 15. 3. 31..
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface UiThread {
  long delay() default 0;
}
