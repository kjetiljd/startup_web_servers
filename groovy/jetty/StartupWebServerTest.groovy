#!/usr/bin/env groovy

class StartupWebServerTest extends GroovyTestCase {
  void testRootGet() {
    def url = new URL("http://localhost:8080/")
    assert url.text =~ /Hello/
  }
}
