// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

/**
 * <pre>
 * The top-level message sent by the client for the `SynthesizeSpeech` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1.SynthesizeSpeechRequest}
 */
public  final class SynthesizeSpeechRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1.SynthesizeSpeechRequest)
    SynthesizeSpeechRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SynthesizeSpeechRequest.newBuilder() to construct.
  private SynthesizeSpeechRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SynthesizeSpeechRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SynthesizeSpeechRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.cloud.texttospeech.v1.SynthesisInput.Builder subBuilder = null;
            if (input_ != null) {
              subBuilder = input_.toBuilder();
            }
            input_ = input.readMessage(com.google.cloud.texttospeech.v1.SynthesisInput.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(input_);
              input_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder subBuilder = null;
            if (voice_ != null) {
              subBuilder = voice_.toBuilder();
            }
            voice_ = input.readMessage(com.google.cloud.texttospeech.v1.VoiceSelectionParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(voice_);
              voice_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.cloud.texttospeech.v1.AudioConfig.Builder subBuilder = null;
            if (audioConfig_ != null) {
              subBuilder = audioConfig_.toBuilder();
            }
            audioConfig_ = input.readMessage(com.google.cloud.texttospeech.v1.AudioConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audioConfig_);
              audioConfig_ = subBuilder.buildPartial();
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
    return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.class, com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private com.google.cloud.texttospeech.v1.SynthesisInput input_;
  /**
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
   */
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
   */
  public com.google.cloud.texttospeech.v1.SynthesisInput getInput() {
    return input_ == null ? com.google.cloud.texttospeech.v1.SynthesisInput.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
   */
  public com.google.cloud.texttospeech.v1.SynthesisInputOrBuilder getInputOrBuilder() {
    return getInput();
  }

  public static final int VOICE_FIELD_NUMBER = 2;
  private com.google.cloud.texttospeech.v1.VoiceSelectionParams voice_;
  /**
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
   */
  public boolean hasVoice() {
    return voice_ != null;
  }
  /**
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
   */
  public com.google.cloud.texttospeech.v1.VoiceSelectionParams getVoice() {
    return voice_ == null ? com.google.cloud.texttospeech.v1.VoiceSelectionParams.getDefaultInstance() : voice_;
  }
  /**
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
   */
  public com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder getVoiceOrBuilder() {
    return getVoice();
  }

  public static final int AUDIO_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.texttospeech.v1.AudioConfig audioConfig_;
  /**
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
   */
  public boolean hasAudioConfig() {
    return audioConfig_ != null;
  }
  /**
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
   */
  public com.google.cloud.texttospeech.v1.AudioConfig getAudioConfig() {
    return audioConfig_ == null ? com.google.cloud.texttospeech.v1.AudioConfig.getDefaultInstance() : audioConfig_;
  }
  /**
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
   */
  public com.google.cloud.texttospeech.v1.AudioConfigOrBuilder getAudioConfigOrBuilder() {
    return getAudioConfig();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    if (voice_ != null) {
      output.writeMessage(2, getVoice());
    }
    if (audioConfig_ != null) {
      output.writeMessage(3, getAudioConfig());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInput());
    }
    if (voice_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVoice());
    }
    if (audioConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAudioConfig());
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest other = (com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest) obj;

    boolean result = true;
    result = result && (hasInput() == other.hasInput());
    if (hasInput()) {
      result = result && getInput()
          .equals(other.getInput());
    }
    result = result && (hasVoice() == other.hasVoice());
    if (hasVoice()) {
      result = result && getVoice()
          .equals(other.getVoice());
    }
    result = result && (hasAudioConfig() == other.hasAudioConfig());
    if (hasAudioConfig()) {
      result = result && getAudioConfig()
          .equals(other.getAudioConfig());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    if (hasVoice()) {
      hash = (37 * hash) + VOICE_FIELD_NUMBER;
      hash = (53 * hash) + getVoice().hashCode();
    }
    if (hasAudioConfig()) {
      hash = (37 * hash) + AUDIO_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAudioConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The top-level message sent by the client for the `SynthesizeSpeech` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1.SynthesizeSpeechRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1.SynthesizeSpeechRequest)
      com.google.cloud.texttospeech.v1.SynthesizeSpeechRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.class, com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (inputBuilder_ == null) {
        input_ = null;
      } else {
        input_ = null;
        inputBuilder_ = null;
      }
      if (voiceBuilder_ == null) {
        voice_ = null;
      } else {
        voice_ = null;
        voiceBuilder_ = null;
      }
      if (audioConfigBuilder_ == null) {
        audioConfig_ = null;
      } else {
        audioConfig_ = null;
        audioConfigBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor;
    }

    public com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.getDefaultInstance();
    }

    public com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest build() {
      com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest buildPartial() {
      com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest result = new com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest(this);
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      if (voiceBuilder_ == null) {
        result.voice_ = voice_;
      } else {
        result.voice_ = voiceBuilder_.build();
      }
      if (audioConfigBuilder_ == null) {
        result.audioConfig_ = audioConfig_;
      } else {
        result.audioConfig_ = audioConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest) {
        return mergeFrom((com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest other) {
      if (other == com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (other.hasVoice()) {
        mergeVoice(other.getVoice());
      }
      if (other.hasAudioConfig()) {
        mergeAudioConfig(other.getAudioConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.texttospeech.v1.SynthesisInput input_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.texttospeech.v1.SynthesisInput, com.google.cloud.texttospeech.v1.SynthesisInput.Builder, com.google.cloud.texttospeech.v1.SynthesisInputOrBuilder> inputBuilder_;
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public boolean hasInput() {
      return inputBuilder_ != null || input_ != null;
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.SynthesisInput getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? com.google.cloud.texttospeech.v1.SynthesisInput.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public Builder setInput(com.google.cloud.texttospeech.v1.SynthesisInput value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
        onChanged();
      } else {
        inputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public Builder setInput(
        com.google.cloud.texttospeech.v1.SynthesisInput.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
        onChanged();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public Builder mergeInput(com.google.cloud.texttospeech.v1.SynthesisInput value) {
      if (inputBuilder_ == null) {
        if (input_ != null) {
          input_ =
            com.google.cloud.texttospeech.v1.SynthesisInput.newBuilder(input_).mergeFrom(value).buildPartial();
        } else {
          input_ = value;
        }
        onChanged();
      } else {
        inputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public Builder clearInput() {
      if (inputBuilder_ == null) {
        input_ = null;
        onChanged();
      } else {
        input_ = null;
        inputBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.SynthesisInput.Builder getInputBuilder() {
      
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.SynthesisInputOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            com.google.cloud.texttospeech.v1.SynthesisInput.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * Required. The Synthesizer requires either plain text or SSML as input.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SynthesisInput input = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.texttospeech.v1.SynthesisInput, com.google.cloud.texttospeech.v1.SynthesisInput.Builder, com.google.cloud.texttospeech.v1.SynthesisInputOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.texttospeech.v1.SynthesisInput, com.google.cloud.texttospeech.v1.SynthesisInput.Builder, com.google.cloud.texttospeech.v1.SynthesisInputOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private com.google.cloud.texttospeech.v1.VoiceSelectionParams voice_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.texttospeech.v1.VoiceSelectionParams, com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder, com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder> voiceBuilder_;
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public boolean hasVoice() {
      return voiceBuilder_ != null || voice_ != null;
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public com.google.cloud.texttospeech.v1.VoiceSelectionParams getVoice() {
      if (voiceBuilder_ == null) {
        return voice_ == null ? com.google.cloud.texttospeech.v1.VoiceSelectionParams.getDefaultInstance() : voice_;
      } else {
        return voiceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public Builder setVoice(com.google.cloud.texttospeech.v1.VoiceSelectionParams value) {
      if (voiceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        voice_ = value;
        onChanged();
      } else {
        voiceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public Builder setVoice(
        com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder builderForValue) {
      if (voiceBuilder_ == null) {
        voice_ = builderForValue.build();
        onChanged();
      } else {
        voiceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public Builder mergeVoice(com.google.cloud.texttospeech.v1.VoiceSelectionParams value) {
      if (voiceBuilder_ == null) {
        if (voice_ != null) {
          voice_ =
            com.google.cloud.texttospeech.v1.VoiceSelectionParams.newBuilder(voice_).mergeFrom(value).buildPartial();
        } else {
          voice_ = value;
        }
        onChanged();
      } else {
        voiceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public Builder clearVoice() {
      if (voiceBuilder_ == null) {
        voice_ = null;
        onChanged();
      } else {
        voice_ = null;
        voiceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder getVoiceBuilder() {
      
      onChanged();
      return getVoiceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    public com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder getVoiceOrBuilder() {
      if (voiceBuilder_ != null) {
        return voiceBuilder_.getMessageOrBuilder();
      } else {
        return voice_ == null ?
            com.google.cloud.texttospeech.v1.VoiceSelectionParams.getDefaultInstance() : voice_;
      }
    }
    /**
     * <pre>
     * Required. The desired voice of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.VoiceSelectionParams voice = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.texttospeech.v1.VoiceSelectionParams, com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder, com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder> 
        getVoiceFieldBuilder() {
      if (voiceBuilder_ == null) {
        voiceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.texttospeech.v1.VoiceSelectionParams, com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder, com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder>(
                getVoice(),
                getParentForChildren(),
                isClean());
        voice_ = null;
      }
      return voiceBuilder_;
    }

    private com.google.cloud.texttospeech.v1.AudioConfig audioConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.texttospeech.v1.AudioConfig, com.google.cloud.texttospeech.v1.AudioConfig.Builder, com.google.cloud.texttospeech.v1.AudioConfigOrBuilder> audioConfigBuilder_;
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public boolean hasAudioConfig() {
      return audioConfigBuilder_ != null || audioConfig_ != null;
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public com.google.cloud.texttospeech.v1.AudioConfig getAudioConfig() {
      if (audioConfigBuilder_ == null) {
        return audioConfig_ == null ? com.google.cloud.texttospeech.v1.AudioConfig.getDefaultInstance() : audioConfig_;
      } else {
        return audioConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public Builder setAudioConfig(com.google.cloud.texttospeech.v1.AudioConfig value) {
      if (audioConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioConfig_ = value;
        onChanged();
      } else {
        audioConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public Builder setAudioConfig(
        com.google.cloud.texttospeech.v1.AudioConfig.Builder builderForValue) {
      if (audioConfigBuilder_ == null) {
        audioConfig_ = builderForValue.build();
        onChanged();
      } else {
        audioConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public Builder mergeAudioConfig(com.google.cloud.texttospeech.v1.AudioConfig value) {
      if (audioConfigBuilder_ == null) {
        if (audioConfig_ != null) {
          audioConfig_ =
            com.google.cloud.texttospeech.v1.AudioConfig.newBuilder(audioConfig_).mergeFrom(value).buildPartial();
        } else {
          audioConfig_ = value;
        }
        onChanged();
      } else {
        audioConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public Builder clearAudioConfig() {
      if (audioConfigBuilder_ == null) {
        audioConfig_ = null;
        onChanged();
      } else {
        audioConfig_ = null;
        audioConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public com.google.cloud.texttospeech.v1.AudioConfig.Builder getAudioConfigBuilder() {
      
      onChanged();
      return getAudioConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    public com.google.cloud.texttospeech.v1.AudioConfigOrBuilder getAudioConfigOrBuilder() {
      if (audioConfigBuilder_ != null) {
        return audioConfigBuilder_.getMessageOrBuilder();
      } else {
        return audioConfig_ == null ?
            com.google.cloud.texttospeech.v1.AudioConfig.getDefaultInstance() : audioConfig_;
      }
    }
    /**
     * <pre>
     * Required. The configuration of the synthesized audio.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.AudioConfig audio_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.texttospeech.v1.AudioConfig, com.google.cloud.texttospeech.v1.AudioConfig.Builder, com.google.cloud.texttospeech.v1.AudioConfigOrBuilder> 
        getAudioConfigFieldBuilder() {
      if (audioConfigBuilder_ == null) {
        audioConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.texttospeech.v1.AudioConfig, com.google.cloud.texttospeech.v1.AudioConfig.Builder, com.google.cloud.texttospeech.v1.AudioConfigOrBuilder>(
                getAudioConfig(),
                getParentForChildren(),
                isClean());
        audioConfig_ = null;
      }
      return audioConfigBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1.SynthesizeSpeechRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1.SynthesizeSpeechRequest)
  private static final com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest();
  }

  public static com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynthesizeSpeechRequest>
      PARSER = new com.google.protobuf.AbstractParser<SynthesizeSpeechRequest>() {
    public SynthesizeSpeechRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SynthesizeSpeechRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SynthesizeSpeechRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynthesizeSpeechRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.texttospeech.v1.SynthesizeSpeechRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

