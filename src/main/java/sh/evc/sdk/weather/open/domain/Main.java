package sh.evc.sdk.weather.open.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 主要信息
 *
 * @author winixi
 * @date 2020/3/30 10:54 AM
 */
public class Main {

  //温度。单位默认值：开尔文，公制：摄氏，英制：华氏度。
  private Double temp;

  //温度。该温度参数说明了人类对天气的感知。单位默认值：开尔文，公制：摄氏，英制：华氏度。
  @JsonProperty("feels_like")
  private Double feelsLike;

  //此刻的最低温度。这是与当前温度的偏差，
  // 这对于地理上已扩展的大城市和特大城市而言是可能的（可选使用这些参数）。单位默认值：开尔文，公制：摄氏，英制：华氏度。
  @JsonProperty("temp_min")
  private Double tempMin;

  //目前的最高温度。这是与当前温度的偏差，
  // 这对于地理上已扩展的大城市和特大城市而言是可能的（可选使用这些参数）。单位默认值：开尔文，公制：摄氏，英制：华氏度。
  @JsonProperty("temp_max")
  private Double tempMax;

  //大气压力（在海平面上，如果没有sea_level或grnd_level数据），hPa
  private Double pressure;

  //湿度％
  private Double humidity;

  //海平面上的大气压，hPa
  @JsonProperty("sea_level")
  private Double seaLevel;

  //地面大气压，hPa
  @JsonProperty("grnd_level")
  private Double grndLevel;

  public Double getTemp() {
    return temp;
  }

  public void setTemp(Double temp) {
    this.temp = temp;
  }

  public Double getFeelsLike() {
    return feelsLike;
  }

  public void setFeelsLike(Double feelsLike) {
    this.feelsLike = feelsLike;
  }

  public Double getTempMin() {
    return tempMin;
  }

  public void setTempMin(Double tempMin) {
    this.tempMin = tempMin;
  }

  public Double getTempMax() {
    return tempMax;
  }

  public void setTempMax(Double tempMax) {
    this.tempMax = tempMax;
  }

  public Double getPressure() {
    return pressure;
  }

  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }

  public Double getHumidity() {
    return humidity;
  }

  public void setHumidity(Double humidity) {
    this.humidity = humidity;
  }

  public Double getSeaLevel() {
    return seaLevel;
  }

  public void setSeaLevel(Double seaLevel) {
    this.seaLevel = seaLevel;
  }

  public Double getGrndLevel() {
    return grndLevel;
  }

  public void setGrndLevel(Double grndLevel) {
    this.grndLevel = grndLevel;
  }

  @Override
  public String toString() {
    return "Main{" +
            "temp=" + temp +
            ", feelsLike=" + feelsLike +
            ", tempMin=" + tempMin +
            ", tempMax=" + tempMax +
            ", pressure=" + pressure +
            ", humidity=" + humidity +
            ", seaLevel=" + seaLevel +
            ", grndLevel=" + grndLevel +
            '}';
  }
}
