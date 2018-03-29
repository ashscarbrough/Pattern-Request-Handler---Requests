public class App
{
  public static void main(String[] args)
  {
	  RequestHandler RH1 = new Worker(null);
	  RequestHandler RH2 = new Officer(RH1);
	  RequestHandler RH3 = new Commander(RH2);
	  
	  RequestHandler chain = RH3;
	  
	  Request r1 = new Request("evaluate a plan", "evaluate the healthcare reform plan");
	  Request r2 = new Request("execute a plan", "execute globalization plan");
	  Request r3 = new Request("design a plan", "design the new P2P network");

    chain.handleRequest(r1);
    chain.handleRequest(r2);
    chain.handleRequest(r3);
  }
}
