package com.std21029.app.endpoint.rest.controller.health;

import com.std21029.app.PojaGenerated;
import com.std21029.app.repository.DummyRepository;
import com.std21029.app.repository.DummyUuidRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSumController {
  @GetMapping("/big-sum")
  public BigInteger bigSumAdd(@RequestParam String a, @RequestParam String b) {
    BigInteger bigIntA = new BigInteger(a);
    BigInteger bigIntB = new BigInteger(b);
    return bigIntA.add(bigIntB);
  }
}
