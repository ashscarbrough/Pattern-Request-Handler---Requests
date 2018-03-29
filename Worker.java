public class Worker extends RequestHandler
{
  public Worker(RequestHandler handler)
  {
    super(handler);
  }

  @Override
  public void handleRequest(Request req)
  {
    if (req.getRequestType()=="execute a plan")
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
    return "Worker";
  }
}
