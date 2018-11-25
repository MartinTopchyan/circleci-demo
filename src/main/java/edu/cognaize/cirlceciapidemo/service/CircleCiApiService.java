package edu.cognaize.cirlceciapidemo.service;

import edu.cognaize.circleci.model.CircleCiModel;
import edu.cognaize.circleci.service.CircleCiService;
import org.springframework.stereotype.Service;

@Service
public class CircleCiApiService {

  private CircleCiService circleCiService = new CircleCiService();
  private CircleCiModel circleCiModel = new CircleCiModel("Martin Topchyan!!!");

  public void sayHello() {
    circleCiService.sayHello(circleCiModel);
  }
}
