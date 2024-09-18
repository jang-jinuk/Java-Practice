package enumeration.test.http;

public enum HttpStatus {
  OK(200, "OK"),
  BAD_REQUEST(400, "Bad Request"),
  NOT_FOUND(404, "Not Found"),
  INTERNAL_SERVER_ERROR(500, "Internal Server Error");

  private int code;
  private String message;

  HttpStatus(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public static HttpStatus findByCode(int code) {
    switch (code) {
      case 200:
        return OK;
      case 400:
        return BAD_REQUEST;
      case 404:
        return NOT_FOUND;
      case 500:
        return INTERNAL_SERVER_ERROR;
    }
    return null;
  }

  public String isSuccess() {
    if (code >= 200 && code <= 299) {
      return "true";
    }
    return "false";
  }
}
