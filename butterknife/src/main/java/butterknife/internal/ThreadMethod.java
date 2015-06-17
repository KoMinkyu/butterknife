package butterknife.internal;

/**
 * Created by minkyu on 15. 3. 31..
 */
public @interface ThreadMethod {
  /** Name of the looper method for which this annotation applies. */
  String name();

  /** List of method parameters. If the type is not a primitive it must be fully-qualified. */
  String[] parameters() default { };

  /** Primative or fully-qualified return type of the looper method. May also be {@code void}. */
  String returnType() default "void";

  /** If {@link #returnType()} is not {@code void} this value is returned when no binding exists. */
  String defaultReturn() default "null";
}
