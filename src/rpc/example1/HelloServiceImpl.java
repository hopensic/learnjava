package rpc.example1;

public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHi(String name) {
    return "Hi, " + name;
  }
}
