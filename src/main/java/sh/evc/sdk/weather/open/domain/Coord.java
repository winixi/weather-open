package sh.evc.sdk.weather.open.domain;

/**
 * 坐标
 *
 * @author winixi
 * @date 2020/3/30 10:49 AM
 */
public class Coord {

  //经度
  private Double lon;

  //纬度
  private Double lat;

  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  @Override
  public String toString() {
    return "Coord{" +
            "lon=" + lon +
            ", lat=" + lat +
            '}';
  }
}
