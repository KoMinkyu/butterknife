package butterknife.internal;

/**
 * Created by minkyu on 15. 4. 2..
 */
public class ThreadMethodParameter {
  static final ThreadMethodParameter[] NONE = new ThreadMethodParameter[0];

  private final String type;
  private final String name;

  ThreadMethodParameter(String type, String name) {
    this.type = type;
    this.name = name;
  }

  String getType() {
    return type;
  }

  String getName() {
    return name;
  }

  public boolean requiresCast(String toType) {
    return !type.equals(toType);
  }
}
