/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

public final class TextToSpeechProto {
  private TextToSpeechProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_Voice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_Voice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesisInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesisInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_AudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_AudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ",google/cloud/texttospeech/v1/cloud_tts"
          + ".proto\022\034google.cloud.texttospeech.v1\032\034google/api/annotations.proto\032\027google/api/client.proto\032\037google/api/field_behavior.proto\032\031google/api/resource.proto\"/\n"
          + "\021ListVoicesRequest\022\032\n\r"
          + "language_code\030\001 \001(\tB\003\340A\001\"I\n"
          + "\022ListVoicesResponse\0223\n"
          + "\006voices\030\001 \003(\0132#.google.cloud.texttospeech.v1.Voice\"\224\001\n"
          + "\005Voice\022\026\n"
          + "\016language_codes\030\001 \003(\t\022\014\n"
          + "\004name\030\002 \001(\t\022B\n"
          + "\013ssml_gender\030\003"
          + " \001(\0162-.google.cloud.texttospeech.v1.SsmlVoiceGender\022!\n"
          + "\031natural_sample_rate_hertz\030\004 \001(\005\"\351\001\n"
          + "\027SynthesizeSpeechRequest\022@\n"
          + "\005input\030\001"
          + " \001(\0132,.google.cloud.texttospeech.v1.SynthesisInputB\003\340A\002\022F\n"
          + "\005voice\030\002"
          + " \001(\01322.google.cloud.texttospeech.v1.VoiceSelectionParamsB\003\340A\002\022D\n"
          + "\014audio_config\030\003"
          + " \001(\0132).google.cloud.texttospeech.v1.AudioConfigB\003\340A\002\"@\n"
          + "\016SynthesisInput\022\016\n"
          + "\004text\030\001 \001(\tH\000\022\016\n"
          + "\004ssml\030\002 \001(\tH\000B\016\n"
          + "\014input_source\"\204\001\n"
          + "\024VoiceSelectionParams\022\032\n\r"
          + "language_code\030\001 \001(\tB\003\340A\002\022\014\n"
          + "\004name\030\002 \001(\t\022B\n"
          + "\013ssml_gender\030\003"
          + " \001(\0162-.google.cloud.texttospeech.v1.SsmlVoiceGender\"\361\001\n"
          + "\013AudioConfig\022H\n"
          + "\016audio_encoding\030\001"
          + " \001(\0162+.google.cloud.texttospeech.v1.AudioEncodingB\003\340A\002\022\035\n\r"
          + "speaking_rate\030\002 \001(\001B\006\340A\004\340A\001\022\025\n"
          + "\005pitch\030\003 \001(\001B\006\340A\004\340A\001\022\036\n"
          + "\016volume_gain_db\030\004 \001(\001B\006\340A\004\340A\001\022\036\n"
          + "\021sample_rate_hertz\030\005 \001(\005B\003\340A\001\022\"\n"
          + "\022effects_profile_id\030\006 \003(\tB\006\340A\004\340A\001\"1\n"
          + "\030SynthesizeSpeechResponse\022\025\n\r"
          + "audio_content\030\001 \001(\014*W\n"
          + "\017SsmlVoiceGender\022!\n"
          + "\035SSML_VOICE_GENDER_UNSPECIFIED\020\000\022\010\n"
          + "\004MALE\020\001\022\n\n"
          + "\006FEMALE\020\002\022\013\n"
          + "\007NEUTRAL\020\003*i\n\r"
          + "AudioEncoding\022\036\n"
          + "\032AUDIO_ENCODING_UNSPECIFIED\020\000\022\014\n"
          + "\010LINEAR16\020\001\022\007\n"
          + "\003MP3\020\002\022\014\n"
          + "\010OGG_OPUS\020\003\022\t\n"
          + "\005MULAW\020\005\022\010\n"
          + "\004ALAW\020\0062\264\003\n"
          + "\014TextToSpeech\022\223\001\n\n"
          + "ListVoices\022/.google.cloud.texttospeech.v1.ListVoicesRequest\0320.google.cloud.texttospeech.v1.ListVoicesResponse\"\"\202\323\344\223\002\014\022\n"
          + "/v1/voices\332A\r"
          + "language_code\022\274\001\n"
          + "\020SynthesizeSpeech\0225.google.cloud.texttospeech.v1.SynthesizeSpeechRequest\0326."
          + "google.cloud.texttospeech.v1.SynthesizeS"
          + "peechResponse\"9\202\323\344\223\002\030\"\023/v1/text:synthesize:\001*\332A\030input,voice,audio_config\032O\312A\033texttospeech.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\274\002\n"
          + " com.google.cloud.texttospeech.v1B\021TextToSp"
          + "eechProtoP\001ZHgoogle.golang.org/genproto/googleapis/cloud/texttospeech/v1;texttospeech\370\001\001\252\002\034Google.Cloud.TextToSpeech.V1\312\002\034Google\\Cloud\\TextToSpeech\\V1\352\002\037Google::Cloud::TextToSpeech::V1\352AU\n"
          + "\033automl.googleapis.com/Model\0226projects/{project}/loc"
          + "ations/{location}/models/{model}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor,
            new java.lang.String[] {
              "LanguageCode",
            });
    internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor,
            new java.lang.String[] {
              "Voices",
            });
    internal_static_google_cloud_texttospeech_v1_Voice_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_texttospeech_v1_Voice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_Voice_descriptor,
            new java.lang.String[] {
              "LanguageCodes", "Name", "SsmlGender", "NaturalSampleRateHertz",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechRequest_descriptor,
            new java.lang.String[] {
              "Input", "Voice", "AudioConfig",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesisInput_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_texttospeech_v1_SynthesisInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesisInput_descriptor,
            new java.lang.String[] {
              "Text", "Ssml", "InputSource",
            });
    internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "LanguageCode", "Name", "SsmlGender",
            });
    internal_static_google_cloud_texttospeech_v1_AudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_texttospeech_v1_AudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_AudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SpeakingRate",
              "Pitch",
              "VolumeGainDb",
              "SampleRateHertz",
              "EffectsProfileId",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeSpeechResponse_descriptor,
            new java.lang.String[] {
              "AudioContent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
