public class Officer extends RequestHandler
{
  public Officer(RequestHandler handler)
  {
    super(handler);  //call parent class constructor
  }

  @Override
  public void handleRequest(Request req)
  {
    if (req.getRequestType()=="evaluate a plan")
    {
      printHandling(req);
      req.markHandled();
    }
    else
    {
      super.handleRequest(req); //call generic method
    }
  }

  @Override
  public String toString()
  {
    return "Officer";
  }

}
