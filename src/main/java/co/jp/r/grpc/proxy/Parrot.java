// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: parrot.proto

package co.jp.r.grpc.proxy;

public final class Parrot {
  private Parrot() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parrot_proxy_ParrotPurchaseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parrot_proxy_ParrotPurchaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parrot_proxy_ParrotPurchaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parrot_proxy_ParrotPurchaseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014parrot.proto\022\014parrot.proxy\"S\n\025ParrotPu" +
      "rchaseRequest\022\025\n\rtransactionId\030\001 \001(\t\022\023\n\013" +
      "requestDate\030\002 \001(\t\022\016\n\006amount\030\003 \001(\005\"E\n\026Par" +
      "rotPurchaseResponse\022\025\n\rtransactionId\030\001 \001" +
      "(\t\022\024\n\014responseCode\030\002 \001(\t2\312\001\n\014ParrotClien" +
      "t\022W\n\010Purchase\022#.parrot.proxy.ParrotPurch" +
      "aseRequest\032$.parrot.proxy.ParrotPurchase" +
      "Response\"\000\022a\n\016PurchaseStream\022#.parrot.pr" +
      "oxy.ParrotPurchaseRequest\032$.parrot.proxy" +
      ".ParrotPurchaseResponse\"\000(\0010\001B\026\n\022co.jp.r" +
      ".grpc.proxyP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_parrot_proxy_ParrotPurchaseRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_parrot_proxy_ParrotPurchaseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parrot_proxy_ParrotPurchaseRequest_descriptor,
        new java.lang.String[] { "TransactionId", "RequestDate", "Amount", });
    internal_static_parrot_proxy_ParrotPurchaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_parrot_proxy_ParrotPurchaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parrot_proxy_ParrotPurchaseResponse_descriptor,
        new java.lang.String[] { "TransactionId", "ResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
