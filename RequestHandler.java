/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 8
 */

public abstract class RequestHandler
{
  private RequestHandler nextHandler;

  public RequestHandler(RequestHandler next)
  {
    this.nextHandler = next;
  }

  public void handleRequest(Request req)
  {  
	  this.nextHandler.handleRequest(req); // request will be passed on to the next Handler in chain
  }

  protected void printHandling(Request req)
  {
    System.out.println(this + " is handling request: " +  req.getRequestDescription());
  }

  public abstract String toString();
}
