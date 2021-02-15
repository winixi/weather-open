package sh.evc.sdk.weather.open.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 积雪
 *
 * @author winixi
 * @date 2020/3/30 11:02 AM
 */
public class Snow {

  //最近1个小时的积雪量，mm
  @JsonProperty("1h")
  private Integer oneHour;

  //最近3个小时的积雪量，mm
  @JsonProperty("3h")
  private Integer threeHour;

  public Integer getOneHour() {
    return oneHour;
  }

  public void setOneHour(Integer oneHour) {
    this.oneHour = oneHour;
  }

  public Integer getThreeHour() {
    return threeHour;
  }

  public void setThreeHour(Integer threeHour) {
    this.threeHour = threeHour;
  }

  @Override
  public String toString() {
    return "Snow{" +
            "oneHour=" + oneHour +
            ", threeHour=" + threeHour +
            '}';
  }
}
