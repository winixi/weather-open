package sh.evc.sdk.weather.open.domain;

/**
 * 风
 *
 * @author winixi
 * @date 2020/3/30 10:33 AM
 */
public class Wind {

  //风速。单位默认值：米/秒，公制：米/秒，英制：英里/小时。
  private Integer speed;

  //风向，度（气象）
  private Integer deg;

  public Integer getSpeed() {
    return speed;
  }

  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  public Integer getDeg() {
    return deg;
  }

  public void setDeg(Integer deg) {
    this.deg = deg;
  }

  @Override
  public String toString() {
    return "Wind{" +
            "speed=" + speed +
            ", deg=" + deg +
            '}';
  }
}
