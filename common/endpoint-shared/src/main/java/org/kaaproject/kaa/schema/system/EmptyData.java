/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.schema.system;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmptyData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmptyData\",\"namespace\":\"org.kaaproject.kaa.schema.system\",\"fields\":[],\"version\":1,\"dependencies\":[],\"displayName\":\"Empty Data\",\"description\":\"Auto generated\"}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new EmptyData RecordBuilder
   */
  public static org.kaaproject.kaa.schema.system.EmptyData.Builder newBuilder() {
    return new org.kaaproject.kaa.schema.system.EmptyData.Builder();
  }

  /**
   * Creates a new EmptyData RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.schema.system.EmptyData.Builder newBuilder(org.kaaproject.kaa.schema.system.EmptyData.Builder other) {
    return new org.kaaproject.kaa.schema.system.EmptyData.Builder(other);
  }

  /**
   * Creates a new EmptyData RecordBuilder by copying an existing EmptyData instance
   */
  public static org.kaaproject.kaa.schema.system.EmptyData.Builder newBuilder(org.kaaproject.kaa.schema.system.EmptyData other) {
    return new org.kaaproject.kaa.schema.system.EmptyData.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * RecordBuilder for EmptyData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmptyData>
      implements org.apache.avro.data.RecordBuilder<EmptyData> {


    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.schema.system.EmptyData.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.schema.system.EmptyData.Builder other) {
      super(other);
    }

    /**
     * Creates a Builder by copying an existing EmptyData instance
     */
    private Builder(org.kaaproject.kaa.schema.system.EmptyData other) {
      super(org.kaaproject.kaa.schema.system.EmptyData.SCHEMA$);
    }

    @Override
    public EmptyData build() {
      try {
        EmptyData record = new EmptyData();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}