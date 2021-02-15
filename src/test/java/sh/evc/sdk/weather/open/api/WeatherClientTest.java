package sh.evc.sdk.weather.open.api;

import org.junit.Test;
import sh.evc.sdk.weather.open.request.CurrentRequest;
import sh.evc.sdk.weather.open.request.ForecastRequest;
import sh.evc.sdk.weather.open.response.CurrentResponse;
import sh.evc.sdk.weather.open.response.ForecastResponse;
import sh.evc.sdk.weather.open.util.JsonFormat;

/**
 * 测试
 *
 * @author winixi
 * @date 2021/2/15 12:54 PM
 */
public class WeatherClientTest extends BaseTest {

  String lat = "31.104275188953306";
  String lon = "121.376600481115";

  /**
   * 当前
   */
  @Test
  public void current() {
    CurrentRequest request = new CurrentRequest(lat, lon);
    CurrentResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 预报
   */
  @Test
  public void forecast() {
    ForecastRequest request = new ForecastRequest(lat, lon);
    ForecastResponse response = client.execute(request);
    JsonFormat.print(response);
  }
}
