package sh.evc.sdk.weather.open.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * 预报
 *
 * @author winixi
 * @date 2020/3/30 11:25 AM
 */
public class Forecast {

  //计算时间
  private Integer dt;

  //主要天气信息
  private Main main;

  //气象
  private ArrayList<Weather> weather;

  //云
  private Clouds clouds;

  //风
  private Wind wind;

  //时间 "2020-03-28 09:00:00"
  @JsonProperty("dt_txt")
  private String dtTxt;

  public Integer getDt() {
    return dt;
  }

  public void setDt(Integer dt) {
    this.dt = dt;
  }

  public Main getMain() {
    return main;
  }

  public void setMain(Main main) {
    this.main = main;
  }

  public ArrayList<Weather> getWeather() {
    return weather;
  }

  public void setWeather(ArrayList<Weather> weather) {
    this.weather = weather;
  }

  public Clouds getClouds() {
    return clouds;
  }

  public void setClouds(Clouds clouds) {
    this.clouds = clouds;
  }

  public Wind getWind() {
    return wind;
  }

  public void setWind(Wind wind) {
    this.wind = wind;
  }

  public String getDtTxt() {
    return dtTxt;
  }

  public void setDtTxt(String dtTxt) {
    this.dtTxt = dtTxt;
  }

  @Override
  public String toString() {
    return "Forecast{" +
            "dt=" + dt +
            ", main=" + main +
            ", weather=" + weather +
            ", clouds=" + clouds +
            ", wind=" + wind +
            ", dtTxt='" + dtTxt + '\'' +
            '}';
  }
}
