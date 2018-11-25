package edu.cognaize.cirlceciapidemo;

import edu.cognaize.cirlceciapidemo.service.CircleCiApiService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CirlceciApiDemoApplicationTests {

  @Autowired
  CircleCiApiService circleCiApiService;

  @Test
  public void circleciServiceTest() {
    circleCiApiService.sayHello();
    Assert.assertTrue(true);
  }

}
