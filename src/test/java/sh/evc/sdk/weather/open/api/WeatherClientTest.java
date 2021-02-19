package sh.evc.sdk.weather.open.api;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.weather.open.api.config.WeatherConfigTest;
import sh.evc.sdk.weather.open.api.handler.ResponseHandlerTest;
import sh.evc.sdk.weather.open.client.WeatherClient;
import sh.evc.sdk.weather.open.config.WeatherConfig;
import sh.evc.sdk.weather.open.handler.ResponseHandler;
import sh.evc.sdk.weather.open.request.CurrentGetRequest;
import sh.evc.sdk.weather.open.request.ForecastGetRequest;
import sh.evc.sdk.weather.open.response.CurrentGetResponse;
import sh.evc.sdk.weather.open.response.ForecastGetResponse;
import sh.evc.sdk.weather.open.util.JsonFormat;

/**
 * 测试
 *
 * @author winixi
 * @date 2021/2/15 12:54 PM
 */
public class WeatherClientTest {

  public final static Logger log = LoggerFactory.getLogger(WeatherClientTest.class);

  private String lat = "31.104275188953306";
  private String lon = "121.376600481115";

  public WeatherClient client;
  public WeatherConfig config = new WeatherConfigTest();
  public ResponseHandler handler = new ResponseHandlerTest();

  @Before
  public void before() {
    client = new WeatherClient(config, handler);
  }

  /**
   * 当前
   */
  @Test
  public void current() {
    CurrentGetRequest request = new CurrentGetRequest(lat, lon);
    CurrentGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 预报
   */
  @Test
  public void forecast() {
    ForecastGetRequest request = new ForecastGetRequest(lat, lon);
    ForecastGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }
}
