package sh.evc.sdk.weather.open.request;

import sh.evc.sdk.weather.open.dict.Lang;
import sh.evc.sdk.weather.open.dict.RequestMethod;
import sh.evc.sdk.weather.open.response.ForecastResponse;
import sh.evc.sdk.weather.open.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 预报
 *
 * @author winixi
 * @date 2021/2/15 12:55 PM
 */
public class ForecastRequest extends ApiRequest<ForecastResponse> {

  /**
   * 语言
   */
  private Lang lang = Lang.ZH_CN;

  /**
   * 纬度
   */
  private String lat;

  /**
   * 经度
   */
  private String lon;

  /**
   * 构造
   *
   * @param lang
   * @param lat
   * @param lon
   */
  public ForecastRequest(String lat, String lon) {
    this.lat = lat;
    this.lon = lon;
  }

  public void setLang(Lang lang) {
    this.lang = lang;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("lang", lang.getName());
    params.put("lat", lat);
    params.put("lon", lon);
    return params;
  }

  @Override
  public String getUri() {
    return "/data/2.5/forecast";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<ForecastResponse> getResponseClass() {
    return ForecastResponse.class;
  }
}
