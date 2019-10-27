// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: parrot.proto

package co.jp.r.grpc.proxy;

/**
 * Protobuf type {@code parrot.proxy.ParrotPurchaseRequest}
 */
public  final class ParrotPurchaseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:parrot.proxy.ParrotPurchaseRequest)
    ParrotPurchaseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParrotPurchaseRequest.newBuilder() to construct.
  private ParrotPurchaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParrotPurchaseRequest() {
    transactionId_ = "";
    requestDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ParrotPurchaseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ParrotPurchaseRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            transactionId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            requestDate_ = s;
            break;
          }
          case 24: {

            amount_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return co.jp.r.grpc.proxy.Parrot.internal_static_parrot_proxy_ParrotPurchaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return co.jp.r.grpc.proxy.Parrot.internal_static_parrot_proxy_ParrotPurchaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            co.jp.r.grpc.proxy.ParrotPurchaseRequest.class, co.jp.r.grpc.proxy.ParrotPurchaseRequest.Builder.class);
  }

  public static final int TRANSACTIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object transactionId_;
  /**
   * <code>string transactionId = 1;</code>
   */
  public java.lang.String getTransactionId() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionId_ = s;
      return s;
    }
  }
  /**
   * <code>string transactionId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTransactionIdBytes() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTDATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object requestDate_;
  /**
   * <code>string requestDate = 2;</code>
   */
  public java.lang.String getRequestDate() {
    java.lang.Object ref = requestDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestDate_ = s;
      return s;
    }
  }
  /**
   * <code>string requestDate = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRequestDateBytes() {
    java.lang.Object ref = requestDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private int amount_;
  /**
   * <code>int32 amount = 3;</code>
   */
  public int getAmount() {
    return amount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTransactionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transactionId_);
    }
    if (!getRequestDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestDate_);
    }
    if (amount_ != 0) {
      output.writeInt32(3, amount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTransactionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transactionId_);
    }
    if (!getRequestDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestDate_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, amount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof co.jp.r.grpc.proxy.ParrotPurchaseRequest)) {
      return super.equals(obj);
    }
    co.jp.r.grpc.proxy.ParrotPurchaseRequest other = (co.jp.r.grpc.proxy.ParrotPurchaseRequest) obj;

    if (!getTransactionId()
        .equals(other.getTransactionId())) return false;
    if (!getRequestDate()
        .equals(other.getRequestDate())) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId().hashCode();
    hash = (37 * hash) + REQUESTDATE_FIELD_NUMBER;
    hash = (53 * hash) + getRequestDate().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(co.jp.r.grpc.proxy.ParrotPurchaseRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code parrot.proxy.ParrotPurchaseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:parrot.proxy.ParrotPurchaseRequest)
      co.jp.r.grpc.proxy.ParrotPurchaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.jp.r.grpc.proxy.Parrot.internal_static_parrot_proxy_ParrotPurchaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.jp.r.grpc.proxy.Parrot.internal_static_parrot_proxy_ParrotPurchaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.jp.r.grpc.proxy.ParrotPurchaseRequest.class, co.jp.r.grpc.proxy.ParrotPurchaseRequest.Builder.class);
    }

    // Construct using co.jp.r.grpc.proxy.ParrotPurchaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      transactionId_ = "";

      requestDate_ = "";

      amount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return co.jp.r.grpc.proxy.Parrot.internal_static_parrot_proxy_ParrotPurchaseRequest_descriptor;
    }

    @java.lang.Override
    public co.jp.r.grpc.proxy.ParrotPurchaseRequest getDefaultInstanceForType() {
      return co.jp.r.grpc.proxy.ParrotPurchaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public co.jp.r.grpc.proxy.ParrotPurchaseRequest build() {
      co.jp.r.grpc.proxy.ParrotPurchaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public co.jp.r.grpc.proxy.ParrotPurchaseRequest buildPartial() {
      co.jp.r.grpc.proxy.ParrotPurchaseRequest result = new co.jp.r.grpc.proxy.ParrotPurchaseRequest(this);
      result.transactionId_ = transactionId_;
      result.requestDate_ = requestDate_;
      result.amount_ = amount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof co.jp.r.grpc.proxy.ParrotPurchaseRequest) {
        return mergeFrom((co.jp.r.grpc.proxy.ParrotPurchaseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(co.jp.r.grpc.proxy.ParrotPurchaseRequest other) {
      if (other == co.jp.r.grpc.proxy.ParrotPurchaseRequest.getDefaultInstance()) return this;
      if (!other.getTransactionId().isEmpty()) {
        transactionId_ = other.transactionId_;
        onChanged();
      }
      if (!other.getRequestDate().isEmpty()) {
        requestDate_ = other.requestDate_;
        onChanged();
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      co.jp.r.grpc.proxy.ParrotPurchaseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (co.jp.r.grpc.proxy.ParrotPurchaseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object transactionId_ = "";
    /**
     * <code>string transactionId = 1;</code>
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transactionId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transactionId = 1;</code>
     */
    public Builder setTransactionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string transactionId = 1;</code>
     */
    public Builder clearTransactionId() {
      
      transactionId_ = getDefaultInstance().getTransactionId();
      onChanged();
      return this;
    }
    /**
     * <code>string transactionId = 1;</code>
     */
    public Builder setTransactionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transactionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object requestDate_ = "";
    /**
     * <code>string requestDate = 2;</code>
     */
    public java.lang.String getRequestDate() {
      java.lang.Object ref = requestDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string requestDate = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRequestDateBytes() {
      java.lang.Object ref = requestDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requestDate = 2;</code>
     */
    public Builder setRequestDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string requestDate = 2;</code>
     */
    public Builder clearRequestDate() {
      
      requestDate_ = getDefaultInstance().getRequestDate();
      onChanged();
      return this;
    }
    /**
     * <code>string requestDate = 2;</code>
     */
    public Builder setRequestDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestDate_ = value;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <code>int32 amount = 3;</code>
     */
    public int getAmount() {
      return amount_;
    }
    /**
     * <code>int32 amount = 3;</code>
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 amount = 3;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:parrot.proxy.ParrotPurchaseRequest)
  }

  // @@protoc_insertion_point(class_scope:parrot.proxy.ParrotPurchaseRequest)
  private static final co.jp.r.grpc.proxy.ParrotPurchaseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new co.jp.r.grpc.proxy.ParrotPurchaseRequest();
  }

  public static co.jp.r.grpc.proxy.ParrotPurchaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParrotPurchaseRequest>
      PARSER = new com.google.protobuf.AbstractParser<ParrotPurchaseRequest>() {
    @java.lang.Override
    public ParrotPurchaseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ParrotPurchaseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ParrotPurchaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParrotPurchaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public co.jp.r.grpc.proxy.ParrotPurchaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
