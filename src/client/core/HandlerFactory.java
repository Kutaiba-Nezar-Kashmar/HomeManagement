package client.core;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HandlerFactory
{
  private static HandlerFactory instance;
  private static final Lock lock = new ReentrantLock();

  public static HandlerFactory getInstance()
  {
    if (instance == null)
    {
      synchronized (lock)
      {
        instance = new HandlerFactory();
      }
    }
    return instance;
  }

}
