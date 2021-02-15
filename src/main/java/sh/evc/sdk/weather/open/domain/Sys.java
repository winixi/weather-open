package sh.evc.sdk.weather.open.domain;

/**
 * 系统数据
 *
 * @author winixi
 * @date 2020/3/30 11:04 AM
 */
public class Sys {

  //内部参数
  private Integer type;

  //内部参数
  private Integer id;

  //内部参数
  private Integer message;

  //国家/地区代码（GB，JP等）
  private String country;

  //日出时间，Unix，UTC
  private Integer sunrise;

  //日落时间，Unix，UTC
  private Integer sunset;

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMessage() {
    return message;
  }

  public void setMessage(Integer message) {
    this.message = message;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getSunrise() {
    return sunrise;
  }

  public void setSunrise(Integer sunrise) {
    this.sunrise = sunrise;
  }

  public Integer getSunset() {
    return sunset;
  }

  public void setSunset(Integer sunset) {
    this.sunset = sunset;
  }

  @Override
  public String toString() {
    return "Sys{" +
            "type=" + type +
            ", id=" + id +
            ", message=" + message +
            ", country='" + country + '\'' +
            ", sunrise=" + sunrise +
            ", sunset=" + sunset +
            '}';
  }
}
