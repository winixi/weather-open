package sh.evc.sdk.weather.open.response;

import sh.evc.sdk.weather.open.domain.*;

import java.util.ArrayList;

/**
 * 当前天气
 *
 * @author winixi
 * @date 2020/3/30 10:23 AM
 */
public class CurrentGetResponse extends JsonResponse {

  /**
   * 城市编号
   */
  private Integer id;

  /**
   * 城市名称
   */
  private String name;

  /**
   * 时区
   */
  private Integer timezone;

  /**
   * 坐标
   */
  private Coord coord;

  /**
   * 天气
   */
  private ArrayList<Weather> weather;

  /**
   * 内部参数
   */
  private String base;

  /**
   * 主要信息
   */
  private Main main;

  /**
   * 能见度
   */
  private Integer visibility;

  /**
   * 风
   */
  private Wind wind;

  /**
   * 云
   */
  private Clouds clouds;

  /**
   * 数据计算时间
   */
  private Integer dt;

  /**
   * 系统信息
   */
  private Sys sys;

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

  public Integer getTimezone() {
    return timezone;
  }

  public void setTimezone(Integer timezone) {
    this.timezone = timezone;
  }

  public Coord getCoord() {
    return coord;
  }

  public void setCoord(Coord coord) {
    this.coord = coord;
  }

  public ArrayList<Weather> getWeather() {
    return weather;
  }

  public void setWeather(ArrayList<Weather> weather) {
    this.weather = weather;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public Main getMain() {
    return main;
  }

  public void setMain(Main main) {
    this.main = main;
  }

  public Integer getVisibility() {
    return visibility;
  }

  public void setVisibility(Integer visibility) {
    this.visibility = visibility;
  }

  public Wind getWind() {
    return wind;
  }

  public void setWind(Wind wind) {
    this.wind = wind;
  }

  public Clouds getClouds() {
    return clouds;
  }

  public void setClouds(Clouds clouds) {
    this.clouds = clouds;
  }

  public Integer getDt() {
    return dt;
  }

  public void setDt(Integer dt) {
    this.dt = dt;
  }

  public Sys getSys() {
    return sys;
  }

  public void setSys(Sys sys) {
    this.sys = sys;
  }

  @Override
  public String toString() {
    return "CurrentResponse{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", timezone=" + timezone +
            ", coord=" + coord +
            ", weather=" + weather +
            ", base='" + base + '\'' +
            ", main=" + main +
            ", visibility=" + visibility +
            ", wind=" + wind +
            ", clouds=" + clouds +
            ", dt=" + dt +
            ", sys=" + sys +
            "} " + super.toString();
  }
}
