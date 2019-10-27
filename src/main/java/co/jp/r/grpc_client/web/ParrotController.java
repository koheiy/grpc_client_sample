package co.jp.r.grpc_client.web;

import co.jp.r.grpc_client.proxy.Proxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ParrotController {

    private final Proxy proxy;

    public ParrotController(final Proxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping("purchase")
    public String purchase() {
        proxy.proxy();
        return "OK";
    }

    @GetMapping("purchase/s")
    public String purchaseStream() {
        proxy.proxyStream();
        return "OK";
    }
}
