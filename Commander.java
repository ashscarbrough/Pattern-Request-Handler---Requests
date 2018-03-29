public class Commander extends RequestHandler
{
  public Commander(RequestHandler handler)
  {
    super(handler); //call parent class constructor
  }

  @Override
  public void handleRequest(Request req)
  {
    if (req.getRequestType()=="design a plan")
    {
      printHandling(req);
      req.markHandled();
    }
    else
    {
      super.handleRequest(req); //call generic method
    }
  }

  public String toString()
  {
    return "Commander";
  }
}
