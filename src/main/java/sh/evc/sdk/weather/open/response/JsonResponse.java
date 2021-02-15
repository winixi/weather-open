package sh.evc.sdk.weather.open.response;

/**
 * 基本返回
 *
 * @author winixi
 * @date 2020/3/30 10:22 AM
 */
public class JsonResponse extends ApiResponse {

  /**
   * 内部参数,200
   */
  private Integer cod;

  /**
   * 消息
   */
  private String message;

  public Integer getCod() {
    return cod;
  }

  public void setCod(Integer cod) {
    this.cod = cod;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "BaseResponse{" +
            "cod=" + cod +
            ", message='" + message + '\'' +
            '}';
  }
}
