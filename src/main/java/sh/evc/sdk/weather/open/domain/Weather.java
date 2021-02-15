package sh.evc.sdk.weather.open.domain;

/**
 * 天气
 *
 * @author winixi
 * @date 2020/3/30 10:51 AM
 */
public class Weather {

  //天气条件编号
  private Integer id;

  //天气参数组（雨，雪，极端等）
  private String main;

  //组内的天气情况。您可以使用您的语言获得输出
  private String description;

  //天气图标ID
  private String icon;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMain() {
    return main;
  }

  public void setMain(String main) {
    this.main = main;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  @Override
  public String toString() {
    return "Weather{" +
            "id=" + id +
            ", main='" + main + '\'' +
            ", description='" + description + '\'' +
            ", icon='" + icon + '\'' +
            '}';
  }
}
