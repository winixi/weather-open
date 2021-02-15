package sh.evc.sdk.weather.open.domain;

/**
 * 城市
 *
 * @author winixi
 * @date 2020/3/30 11:21 AM
 */
public class City {

  //城市编号
  private Integer id;

  //城市名称
  private String name;

  //城市坐标
  private Coord coord;

  //国家/地区代码（GB，JP等）
  private String country;

  //从UTC转换秒数
  private Integer timezone;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Coord getCoord() {
    return coord;
  }

  public void setCoord(Coord coord) {
    this.coord = coord;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Integer getTimezone() {
    return timezone;
  }

  public void setTimezone(Integer timezone) {
    this.timezone = timezone;
  }

  @Override
  public String toString() {
    return "City{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", coord=" + coord +
            ", country='" + country + '\'' +
            ", timezone=" + timezone +
            '}';
  }
}
