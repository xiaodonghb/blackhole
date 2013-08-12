// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RollID.proto

package com.dp.blackhole.common.gen;

public final class RollIDPB {
  private RollIDPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RollIDOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string app_name = 1;
    /**
     * <code>required string app_name = 1;</code>
     */
    boolean hasAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    java.lang.String getAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getAppNameBytes();

    // required string app_server = 2;
    /**
     * <code>required string app_server = 2;</code>
     */
    boolean hasAppServer();
    /**
     * <code>required string app_server = 2;</code>
     */
    java.lang.String getAppServer();
    /**
     * <code>required string app_server = 2;</code>
     */
    com.google.protobuf.ByteString
        getAppServerBytes();

    // optional int64 period = 3;
    /**
     * <code>optional int64 period = 3;</code>
     */
    boolean hasPeriod();
    /**
     * <code>optional int64 period = 3;</code>
     */
    long getPeriod();

    // required int64 roll_ts = 4;
    /**
     * <code>required int64 roll_ts = 4;</code>
     */
    boolean hasRollTs();
    /**
     * <code>required int64 roll_ts = 4;</code>
     */
    long getRollTs();
  }
  /**
   * Protobuf type {@code blackhole.RollID}
   */
  public static final class RollID extends
      com.google.protobuf.GeneratedMessage
      implements RollIDOrBuilder {
    // Use RollID.newBuilder() to construct.
    private RollID(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RollID(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RollID defaultInstance;
    public static RollID getDefaultInstance() {
      return defaultInstance;
    }

    public RollID getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RollID(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              appName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              appServer_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              period_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              rollTs_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.common.gen.RollIDPB.internal_static_blackhole_RollID_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.common.gen.RollIDPB.internal_static_blackhole_RollID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.common.gen.RollIDPB.RollID.class, com.dp.blackhole.common.gen.RollIDPB.RollID.Builder.class);
    }

    public static com.google.protobuf.Parser<RollID> PARSER =
        new com.google.protobuf.AbstractParser<RollID>() {
      public RollID parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RollID(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RollID> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string app_name = 1;
    public static final int APP_NAME_FIELD_NUMBER = 1;
    private java.lang.Object appName_;
    /**
     * <code>required string app_name = 1;</code>
     */
    public boolean hasAppName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string app_server = 2;
    public static final int APP_SERVER_FIELD_NUMBER = 2;
    private java.lang.Object appServer_;
    /**
     * <code>required string app_server = 2;</code>
     */
    public boolean hasAppServer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string app_server = 2;</code>
     */
    public java.lang.String getAppServer() {
      java.lang.Object ref = appServer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appServer_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string app_server = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppServerBytes() {
      java.lang.Object ref = appServer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appServer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 period = 3;
    public static final int PERIOD_FIELD_NUMBER = 3;
    private long period_;
    /**
     * <code>optional int64 period = 3;</code>
     */
    public boolean hasPeriod() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 period = 3;</code>
     */
    public long getPeriod() {
      return period_;
    }

    // required int64 roll_ts = 4;
    public static final int ROLL_TS_FIELD_NUMBER = 4;
    private long rollTs_;
    /**
     * <code>required int64 roll_ts = 4;</code>
     */
    public boolean hasRollTs() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int64 roll_ts = 4;</code>
     */
    public long getRollTs() {
      return rollTs_;
    }

    private void initFields() {
      appName_ = "";
      appServer_ = "";
      period_ = 0L;
      rollTs_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasAppName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAppServer()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRollTs()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getAppServerBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, period_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, rollTs_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getAppServerBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, period_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, rollTs_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.common.gen.RollIDPB.RollID parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.common.gen.RollIDPB.RollID prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code blackhole.RollID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.common.gen.RollIDPB.RollIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.common.gen.RollIDPB.internal_static_blackhole_RollID_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.common.gen.RollIDPB.internal_static_blackhole_RollID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.common.gen.RollIDPB.RollID.class, com.dp.blackhole.common.gen.RollIDPB.RollID.Builder.class);
      }

      // Construct using com.dp.blackhole.common.gen.RollIDPB.RollID.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        appName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        appServer_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        period_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        rollTs_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.common.gen.RollIDPB.internal_static_blackhole_RollID_descriptor;
      }

      public com.dp.blackhole.common.gen.RollIDPB.RollID getDefaultInstanceForType() {
        return com.dp.blackhole.common.gen.RollIDPB.RollID.getDefaultInstance();
      }

      public com.dp.blackhole.common.gen.RollIDPB.RollID build() {
        com.dp.blackhole.common.gen.RollIDPB.RollID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.common.gen.RollIDPB.RollID buildPartial() {
        com.dp.blackhole.common.gen.RollIDPB.RollID result = new com.dp.blackhole.common.gen.RollIDPB.RollID(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appName_ = appName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.appServer_ = appServer_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.period_ = period_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.rollTs_ = rollTs_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.common.gen.RollIDPB.RollID) {
          return mergeFrom((com.dp.blackhole.common.gen.RollIDPB.RollID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.common.gen.RollIDPB.RollID other) {
        if (other == com.dp.blackhole.common.gen.RollIDPB.RollID.getDefaultInstance()) return this;
        if (other.hasAppName()) {
          bitField0_ |= 0x00000001;
          appName_ = other.appName_;
          onChanged();
        }
        if (other.hasAppServer()) {
          bitField0_ |= 0x00000002;
          appServer_ = other.appServer_;
          onChanged();
        }
        if (other.hasPeriod()) {
          setPeriod(other.getPeriod());
        }
        if (other.hasRollTs()) {
          setRollTs(other.getRollTs());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAppName()) {
          
          return false;
        }
        if (!hasAppServer()) {
          
          return false;
        }
        if (!hasRollTs()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.common.gen.RollIDPB.RollID parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.common.gen.RollIDPB.RollID) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string app_name = 1;
      private java.lang.Object appName_ = "";
      /**
       * <code>required string app_name = 1;</code>
       */
      public boolean hasAppName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public java.lang.String getAppName() {
        java.lang.Object ref = appName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          appName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAppNameBytes() {
        java.lang.Object ref = appName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder clearAppName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appName_ = getDefaultInstance().getAppName();
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }

      // required string app_server = 2;
      private java.lang.Object appServer_ = "";
      /**
       * <code>required string app_server = 2;</code>
       */
      public boolean hasAppServer() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string app_server = 2;</code>
       */
      public java.lang.String getAppServer() {
        java.lang.Object ref = appServer_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          appServer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string app_server = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAppServerBytes() {
        java.lang.Object ref = appServer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appServer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string app_server = 2;</code>
       */
      public Builder setAppServer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        appServer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string app_server = 2;</code>
       */
      public Builder clearAppServer() {
        bitField0_ = (bitField0_ & ~0x00000002);
        appServer_ = getDefaultInstance().getAppServer();
        onChanged();
        return this;
      }
      /**
       * <code>required string app_server = 2;</code>
       */
      public Builder setAppServerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        appServer_ = value;
        onChanged();
        return this;
      }

      // optional int64 period = 3;
      private long period_ ;
      /**
       * <code>optional int64 period = 3;</code>
       */
      public boolean hasPeriod() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 period = 3;</code>
       */
      public long getPeriod() {
        return period_;
      }
      /**
       * <code>optional int64 period = 3;</code>
       */
      public Builder setPeriod(long value) {
        bitField0_ |= 0x00000004;
        period_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 period = 3;</code>
       */
      public Builder clearPeriod() {
        bitField0_ = (bitField0_ & ~0x00000004);
        period_ = 0L;
        onChanged();
        return this;
      }

      // required int64 roll_ts = 4;
      private long rollTs_ ;
      /**
       * <code>required int64 roll_ts = 4;</code>
       */
      public boolean hasRollTs() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int64 roll_ts = 4;</code>
       */
      public long getRollTs() {
        return rollTs_;
      }
      /**
       * <code>required int64 roll_ts = 4;</code>
       */
      public Builder setRollTs(long value) {
        bitField0_ |= 0x00000008;
        rollTs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 roll_ts = 4;</code>
       */
      public Builder clearRollTs() {
        bitField0_ = (bitField0_ & ~0x00000008);
        rollTs_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.RollID)
    }

    static {
      defaultInstance = new RollID(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.RollID)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_RollID_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_RollID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014RollID.proto\022\tblackhole\"O\n\006RollID\022\020\n\010a" +
      "pp_name\030\001 \002(\t\022\022\n\napp_server\030\002 \002(\t\022\016\n\006per" +
      "iod\030\003 \001(\003\022\017\n\007roll_ts\030\004 \002(\003B\'\n\033com.dp.bla" +
      "ckhole.common.genB\010RollIDPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_RollID_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_RollID_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_RollID_descriptor,
              new java.lang.String[] { "AppName", "AppServer", "Period", "RollTs", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
