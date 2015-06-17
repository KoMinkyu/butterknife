package butterknife.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by minkyu on 15. 3. 31..
 */
public class ThreadMethodBinding {
  private final String name;
  private final List<ThreadMethodParameter> parameters;

  ThreadMethodBinding(String name, List<ThreadMethodParameter> parameters) {
    this.name = name;
    this.parameters =
      Collections.unmodifiableList(new ArrayList<ThreadMethodParameter>(parameters));
  }

  public String getName() {
    return this.name;
  }

  public List<ThreadMethodParameter> getParameters() {
    return parameters;
  }

  public String getDescription() {
    return "method '" + name + "'";
  }
}
