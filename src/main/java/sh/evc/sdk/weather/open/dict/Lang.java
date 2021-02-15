package sh.evc.sdk.weather.open.dict;

/**
 * 语言
 *
 * @author winixi
 * @date 2021/2/15 12:57 PM
 */
public enum Lang {

  /**
   * 简体中文
   */
  ZH_CN("zh_cn");

  private String name;

  Lang(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
