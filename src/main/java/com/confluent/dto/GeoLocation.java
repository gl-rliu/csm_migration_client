/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.confluent.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GeoLocation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6965031617619426426L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeoLocation\",\"namespace\":\"com.confluent.dto\",\"fields\":[{\"name\":\"latitude\",\"type\":\"string\",\"default\":\"\",\"confluent:tags\":[\"PII\"]},{\"name\":\"longitude\",\"type\":\"string\",\"default\":\"\",\"confluent:tags\":[\"PII\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeoLocation> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeoLocation> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GeoLocation> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GeoLocation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GeoLocation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GeoLocation to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GeoLocation from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GeoLocation instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GeoLocation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence latitude;
  private java.lang.CharSequence longitude;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeoLocation() {}

  /**
   * All-args constructor.
   * @param latitude The new value for latitude
   * @param longitude The new value for longitude
   */
  public GeoLocation(java.lang.CharSequence latitude, java.lang.CharSequence longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return latitude;
    case 1: return longitude;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: latitude = (java.lang.CharSequence)value$; break;
    case 1: longitude = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'latitude' field.
   * @return The value of the 'latitude' field.
   */
  public java.lang.CharSequence getLatitude() {
    return latitude;
  }


  /**
   * Sets the value of the 'latitude' field.
   * @param value the value to set.
   */
  public void setLatitude(java.lang.CharSequence value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   * @return The value of the 'longitude' field.
   */
  public java.lang.CharSequence getLongitude() {
    return longitude;
  }


  /**
   * Sets the value of the 'longitude' field.
   * @param value the value to set.
   */
  public void setLongitude(java.lang.CharSequence value) {
    this.longitude = value;
  }

  /**
   * Creates a new GeoLocation RecordBuilder.
   * @return A new GeoLocation RecordBuilder
   */
  public static com.confluent.dto.GeoLocation.Builder newBuilder() {
    return new com.confluent.dto.GeoLocation.Builder();
  }

  /**
   * Creates a new GeoLocation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeoLocation RecordBuilder
   */
  public static com.confluent.dto.GeoLocation.Builder newBuilder(com.confluent.dto.GeoLocation.Builder other) {
    if (other == null) {
      return new com.confluent.dto.GeoLocation.Builder();
    } else {
      return new com.confluent.dto.GeoLocation.Builder(other);
    }
  }

  /**
   * Creates a new GeoLocation RecordBuilder by copying an existing GeoLocation instance.
   * @param other The existing instance to copy.
   * @return A new GeoLocation RecordBuilder
   */
  public static com.confluent.dto.GeoLocation.Builder newBuilder(com.confluent.dto.GeoLocation other) {
    if (other == null) {
      return new com.confluent.dto.GeoLocation.Builder();
    } else {
      return new com.confluent.dto.GeoLocation.Builder(other);
    }
  }

  /**
   * RecordBuilder for GeoLocation instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeoLocation>
    implements org.apache.avro.data.RecordBuilder<GeoLocation> {

    private java.lang.CharSequence latitude;
    private java.lang.CharSequence longitude;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.confluent.dto.GeoLocation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.latitude)) {
        this.latitude = data().deepCopy(fields()[0].schema(), other.latitude);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.longitude)) {
        this.longitude = data().deepCopy(fields()[1].schema(), other.longitude);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GeoLocation instance
     * @param other The existing instance to copy.
     */
    private Builder(com.confluent.dto.GeoLocation other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.latitude)) {
        this.latitude = data().deepCopy(fields()[0].schema(), other.latitude);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.longitude)) {
        this.longitude = data().deepCopy(fields()[1].schema(), other.longitude);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'latitude' field.
      * @return The value.
      */
    public java.lang.CharSequence getLatitude() {
      return latitude;
    }


    /**
      * Sets the value of the 'latitude' field.
      * @param value The value of 'latitude'.
      * @return This builder.
      */
    public com.confluent.dto.GeoLocation.Builder setLatitude(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.latitude = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'latitude' field has been set.
      * @return True if the 'latitude' field has been set, false otherwise.
      */
    public boolean hasLatitude() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'latitude' field.
      * @return This builder.
      */
    public com.confluent.dto.GeoLocation.Builder clearLatitude() {
      latitude = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'longitude' field.
      * @return The value.
      */
    public java.lang.CharSequence getLongitude() {
      return longitude;
    }


    /**
      * Sets the value of the 'longitude' field.
      * @param value The value of 'longitude'.
      * @return This builder.
      */
    public com.confluent.dto.GeoLocation.Builder setLongitude(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.longitude = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'longitude' field has been set.
      * @return True if the 'longitude' field has been set, false otherwise.
      */
    public boolean hasLongitude() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'longitude' field.
      * @return This builder.
      */
    public com.confluent.dto.GeoLocation.Builder clearLongitude() {
      longitude = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeoLocation build() {
      try {
        GeoLocation record = new GeoLocation();
        record.latitude = fieldSetFlags()[0] ? this.latitude : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.longitude = fieldSetFlags()[1] ? this.longitude : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeoLocation>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeoLocation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeoLocation>
    READER$ = (org.apache.avro.io.DatumReader<GeoLocation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.latitude);

    out.writeString(this.longitude);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.latitude = in.readString(this.latitude instanceof Utf8 ? (Utf8)this.latitude : null);

      this.longitude = in.readString(this.longitude instanceof Utf8 ? (Utf8)this.longitude : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.latitude = in.readString(this.latitude instanceof Utf8 ? (Utf8)this.latitude : null);
          break;

        case 1:
          this.longitude = in.readString(this.longitude instanceof Utf8 ? (Utf8)this.longitude : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










