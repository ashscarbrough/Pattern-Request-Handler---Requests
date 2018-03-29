public class Request
{
  private final String requestType;
  private final String requestDescription;

  private boolean handled;

  public Request(final String requestType, final String requestDescription)
  {
    this.requestType = requestType;
    this.requestDescription = requestDescription;
    this.handled = false;
  }

  public String getRequestType()
  {
    return requestType;
  }
  
  public String getRequestDescription()
  {
    return requestDescription;
  }

  public void markHandled()
  {
    this.handled = true;
  }

  public boolean isHandled()
  {
    return this.handled;
  }
}