package sh.evc.sdk.weather.open.response;

import sh.evc.sdk.weather.open.domain.City;
import sh.evc.sdk.weather.open.domain.Forecast;

import java.util.ArrayList;

/**
 * 预测5天返回，40条3小时数据
 *
 * @author winixi
 * @date 2020/3/30 10:23 AM
 */
public class ForecastResponse extends JsonResponse {

  /**
   * 返回记录条数
   */
  private Integer cnt;

  /**
   * 小时预报
   */
  private ArrayList<Forecast> list;

  //城市数据
  private City city;

  public Integer getCnt() {
    return cnt;
  }

  public void setCnt(Integer cnt) {
    this.cnt = cnt;
  }

  public ArrayList<Forecast> getList() {
    return list;
  }

  public void setList(ArrayList<Forecast> list) {
    this.list = list;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "ForecastResponse{" +
            "cnt=" + cnt +
            ", list=" + list +
            ", city=" + city +
            "} " + super.toString();
  }
}
