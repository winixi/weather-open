package sh.evc.sdk.weather.open.domain;

/**
 * 云
 *
 * @author winixi
 * @date 2020/3/30 11:01 AM
 */
public class Clouds {

  //浊度，％
  private Integer all;

  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  @Override
  public String toString() {
    return "Clouds{" +
            "all=" + all +
            '}';
  }
}
