package co.jp.r.grpc_client.proxy;

// TODO:
//import org.springframework.stereotype.Component;

import co.jp.r.grpc.proxy.ParrotClientGrpc;
import co.jp.r.grpc.proxy.ParrotPurchaseRequest;
import co.jp.r.grpc.proxy.ParrotPurchaseResponse;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Component;

@Component
public class Proxy {

    private final ParrotClientGrpc.ParrotClientBlockingStub blockingStub;
    private final ParrotClientGrpc.ParrotClientStub stub;

    public Proxy(ManagedChannel channel) {
        this.blockingStub = ParrotClientGrpc.newBlockingStub(channel);
        this.stub = ParrotClientGrpc.newStub(channel);
    }

    public void proxy() {
        // Requestは適当
        ParrotPurchaseRequest request =
                ParrotPurchaseRequest.newBuilder()
                        .setRequestDate("2019/09/09 23:44:00")
                        .setAmount(999999)
                        .setTransactionId("b25dff27-4386-4a56-8030-fd2eed9753b2")
                 .build();

        ParrotPurchaseResponse response =
                this.blockingStub.purchase(request);

        System.out.println("TransactionID: " + response.getTransactionId());
        System.out.println("ResponseCode: " + response.getResponseCode());
    }

    public void proxyStream() {
        // Requestは適当
        ParrotPurchaseRequest request =
                ParrotPurchaseRequest.newBuilder()
                        .setRequestDate("2019/09/09 23:44:00")
                        .setAmount(20000)
                        .setTransactionId("208e0fd8-0d2c-4eee-84ec-b971361c3e90")
                        .build();

        StreamObserver<ParrotPurchaseRequest> observer = stub.purchaseStream(new StreamObserver<ParrotPurchaseResponse>() {

            @Override
            public void onNext(ParrotPurchaseResponse parrotPurchaseResponse) {
                System.out.println("Response: " + parrotPurchaseResponse.getTransactionId() + "," + parrotPurchaseResponse.getResponseCode());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        });
        observer.onNext(request);
    }
}
