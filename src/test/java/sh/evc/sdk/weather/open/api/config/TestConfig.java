package sh.evc.sdk.weather.open.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.weather.open.config.WeatherConfig;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * 测试配置
 *
 * @author winixi
 * @date 2021/1/21 4:43 PM
 */
public class TestConfig implements WeatherConfig {

  private final static Logger logger = LoggerFactory.getLogger(TestConfig.class);

  private String appId;

  public TestConfig() {
    InputStream in = this.getClass().getResourceAsStream("/config.properties");
    try {
      InputStreamReader inputStreamReader = new InputStreamReader(in, StandardCharsets.UTF_8);
      Properties props = new Properties();
      props.load(inputStreamReader);
      appId = props.getProperty("appId");

    } catch (IOException e) {
      logger.error("读取配置错误", e);
    }
  }

  @Override
  public String getAppId() {
    return appId;
  }

}
