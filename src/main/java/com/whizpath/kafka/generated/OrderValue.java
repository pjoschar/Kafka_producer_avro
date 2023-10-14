/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.whizpath.kafka.generated;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Order Value */
@org.apache.avro.specific.AvroGenerated
public class OrderValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6688619392209087241L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderValue\",\"namespace\":\"com.whizpath.kafka.generated\",\"doc\":\"Order Value\",\"fields\":[{\"name\":\"orderID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"orderType\",\"type\":{\"type\":\"enum\",\"name\":\"OrderType\",\"symbols\":[\"STANDARD_ORDER\",\"LONG_LEAD_TIME_ORDER\",\"PRE_ORDER\",\"BACK_ORDER\"],\"default\":\"STANDARD_ORDER\"}},{\"name\":\"orderDate\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"orderStatus\",\"type\":{\"type\":\"enum\",\"name\":\"OrderStatus\",\"symbols\":[\"PENDING\",\"UNSHIPPED\",\"PARTIALLY_SHIPPED\",\"SHIPPED\",\"CANCELLED\",\"PENDING_AVAILABILITY\"],\"default\":\"PENDING\"}},{\"name\":\"isOrderPaid\",\"type\":\"boolean\"},{\"name\":\"totalCost\",\"type\":\"double\"},{\"name\":\"orderItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderItem\",\"fields\":[{\"name\":\"itemName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"itemPrice\",\"type\":\"double\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderValue> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderValue> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String orderID;
  private com.whizpath.kafka.generated.OrderType orderType;
  private java.lang.String orderDate;
  private com.whizpath.kafka.generated.OrderStatus orderStatus;
  private boolean isOrderPaid;
  private double totalCost;
  private java.util.List<com.whizpath.kafka.generated.OrderItem> orderItems;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderValue() {}

  /**
   * All-args constructor.
   * @param orderID The new value for orderID
   * @param orderType The new value for orderType
   * @param orderDate The new value for orderDate
   * @param orderStatus The new value for orderStatus
   * @param isOrderPaid The new value for isOrderPaid
   * @param totalCost The new value for totalCost
   * @param orderItems The new value for orderItems
   */
  public OrderValue(java.lang.String orderID, com.whizpath.kafka.generated.OrderType orderType, java.lang.String orderDate, com.whizpath.kafka.generated.OrderStatus orderStatus, java.lang.Boolean isOrderPaid, java.lang.Double totalCost, java.util.List<com.whizpath.kafka.generated.OrderItem> orderItems) {
    this.orderID = orderID;
    this.orderType = orderType;
    this.orderDate = orderDate;
    this.orderStatus = orderStatus;
    this.isOrderPaid = isOrderPaid;
    this.totalCost = totalCost;
    this.orderItems = orderItems;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderID;
    case 1: return orderType;
    case 2: return orderDate;
    case 3: return orderStatus;
    case 4: return isOrderPaid;
    case 5: return totalCost;
    case 6: return orderItems;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderID = value$ != null ? value$.toString() : null; break;
    case 1: orderType = (com.whizpath.kafka.generated.OrderType)value$; break;
    case 2: orderDate = value$ != null ? value$.toString() : null; break;
    case 3: orderStatus = (com.whizpath.kafka.generated.OrderStatus)value$; break;
    case 4: isOrderPaid = (java.lang.Boolean)value$; break;
    case 5: totalCost = (java.lang.Double)value$; break;
    case 6: orderItems = (java.util.List<com.whizpath.kafka.generated.OrderItem>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderID' field.
   * @return The value of the 'orderID' field.
   */
  public java.lang.String getOrderID() {
    return orderID;
  }


  /**
   * Sets the value of the 'orderID' field.
   * @param value the value to set.
   */
  public void setOrderID(java.lang.String value) {
    this.orderID = value;
  }

  /**
   * Gets the value of the 'orderType' field.
   * @return The value of the 'orderType' field.
   */
  public com.whizpath.kafka.generated.OrderType getOrderType() {
    return orderType;
  }


  /**
   * Sets the value of the 'orderType' field.
   * @param value the value to set.
   */
  public void setOrderType(com.whizpath.kafka.generated.OrderType value) {
    this.orderType = value;
  }

  /**
   * Gets the value of the 'orderDate' field.
   * @return The value of the 'orderDate' field.
   */
  public java.lang.String getOrderDate() {
    return orderDate;
  }


  /**
   * Sets the value of the 'orderDate' field.
   * @param value the value to set.
   */
  public void setOrderDate(java.lang.String value) {
    this.orderDate = value;
  }

  /**
   * Gets the value of the 'orderStatus' field.
   * @return The value of the 'orderStatus' field.
   */
  public com.whizpath.kafka.generated.OrderStatus getOrderStatus() {
    return orderStatus;
  }


  /**
   * Sets the value of the 'orderStatus' field.
   * @param value the value to set.
   */
  public void setOrderStatus(com.whizpath.kafka.generated.OrderStatus value) {
    this.orderStatus = value;
  }

  /**
   * Gets the value of the 'isOrderPaid' field.
   * @return The value of the 'isOrderPaid' field.
   */
  public boolean getIsOrderPaid() {
    return isOrderPaid;
  }


  /**
   * Sets the value of the 'isOrderPaid' field.
   * @param value the value to set.
   */
  public void setIsOrderPaid(boolean value) {
    this.isOrderPaid = value;
  }

  /**
   * Gets the value of the 'totalCost' field.
   * @return The value of the 'totalCost' field.
   */
  public double getTotalCost() {
    return totalCost;
  }


  /**
   * Sets the value of the 'totalCost' field.
   * @param value the value to set.
   */
  public void setTotalCost(double value) {
    this.totalCost = value;
  }

  /**
   * Gets the value of the 'orderItems' field.
   * @return The value of the 'orderItems' field.
   */
  public java.util.List<com.whizpath.kafka.generated.OrderItem> getOrderItems() {
    return orderItems;
  }


  /**
   * Sets the value of the 'orderItems' field.
   * @param value the value to set.
   */
  public void setOrderItems(java.util.List<com.whizpath.kafka.generated.OrderItem> value) {
    this.orderItems = value;
  }

  /**
   * Creates a new OrderValue RecordBuilder.
   * @return A new OrderValue RecordBuilder
   */
  public static com.whizpath.kafka.generated.OrderValue.Builder newBuilder() {
    return new com.whizpath.kafka.generated.OrderValue.Builder();
  }

  /**
   * Creates a new OrderValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderValue RecordBuilder
   */
  public static com.whizpath.kafka.generated.OrderValue.Builder newBuilder(com.whizpath.kafka.generated.OrderValue.Builder other) {
    if (other == null) {
      return new com.whizpath.kafka.generated.OrderValue.Builder();
    } else {
      return new com.whizpath.kafka.generated.OrderValue.Builder(other);
    }
  }

  /**
   * Creates a new OrderValue RecordBuilder by copying an existing OrderValue instance.
   * @param other The existing instance to copy.
   * @return A new OrderValue RecordBuilder
   */
  public static com.whizpath.kafka.generated.OrderValue.Builder newBuilder(com.whizpath.kafka.generated.OrderValue other) {
    if (other == null) {
      return new com.whizpath.kafka.generated.OrderValue.Builder();
    } else {
      return new com.whizpath.kafka.generated.OrderValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderValue>
    implements org.apache.avro.data.RecordBuilder<OrderValue> {

    private java.lang.String orderID;
    private com.whizpath.kafka.generated.OrderType orderType;
    private java.lang.String orderDate;
    private com.whizpath.kafka.generated.OrderStatus orderStatus;
    private boolean isOrderPaid;
    private double totalCost;
    private java.util.List<com.whizpath.kafka.generated.OrderItem> orderItems;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.whizpath.kafka.generated.OrderValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.orderType)) {
        this.orderType = data().deepCopy(fields()[1].schema(), other.orderType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.orderDate)) {
        this.orderDate = data().deepCopy(fields()[2].schema(), other.orderDate);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.orderStatus)) {
        this.orderStatus = data().deepCopy(fields()[3].schema(), other.orderStatus);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.isOrderPaid)) {
        this.isOrderPaid = data().deepCopy(fields()[4].schema(), other.isOrderPaid);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.totalCost)) {
        this.totalCost = data().deepCopy(fields()[5].schema(), other.totalCost);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.orderItems)) {
        this.orderItems = data().deepCopy(fields()[6].schema(), other.orderItems);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.whizpath.kafka.generated.OrderValue other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderType)) {
        this.orderType = data().deepCopy(fields()[1].schema(), other.orderType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orderDate)) {
        this.orderDate = data().deepCopy(fields()[2].schema(), other.orderDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orderStatus)) {
        this.orderStatus = data().deepCopy(fields()[3].schema(), other.orderStatus);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isOrderPaid)) {
        this.isOrderPaid = data().deepCopy(fields()[4].schema(), other.isOrderPaid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.totalCost)) {
        this.totalCost = data().deepCopy(fields()[5].schema(), other.totalCost);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.orderItems)) {
        this.orderItems = data().deepCopy(fields()[6].schema(), other.orderItems);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'orderID' field.
      * @return The value.
      */
    public java.lang.String getOrderID() {
      return orderID;
    }


    /**
      * Sets the value of the 'orderID' field.
      * @param value The value of 'orderID'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setOrderID(java.lang.String value) {
      validate(fields()[0], value);
      this.orderID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderID' field has been set.
      * @return True if the 'orderID' field has been set, false otherwise.
      */
    public boolean hasOrderID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderID' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearOrderID() {
      orderID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderType' field.
      * @return The value.
      */
    public com.whizpath.kafka.generated.OrderType getOrderType() {
      return orderType;
    }


    /**
      * Sets the value of the 'orderType' field.
      * @param value The value of 'orderType'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setOrderType(com.whizpath.kafka.generated.OrderType value) {
      validate(fields()[1], value);
      this.orderType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orderType' field has been set.
      * @return True if the 'orderType' field has been set, false otherwise.
      */
    public boolean hasOrderType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orderType' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearOrderType() {
      orderType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderDate' field.
      * @return The value.
      */
    public java.lang.String getOrderDate() {
      return orderDate;
    }


    /**
      * Sets the value of the 'orderDate' field.
      * @param value The value of 'orderDate'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setOrderDate(java.lang.String value) {
      validate(fields()[2], value);
      this.orderDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'orderDate' field has been set.
      * @return True if the 'orderDate' field has been set, false otherwise.
      */
    public boolean hasOrderDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'orderDate' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearOrderDate() {
      orderDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderStatus' field.
      * @return The value.
      */
    public com.whizpath.kafka.generated.OrderStatus getOrderStatus() {
      return orderStatus;
    }


    /**
      * Sets the value of the 'orderStatus' field.
      * @param value The value of 'orderStatus'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setOrderStatus(com.whizpath.kafka.generated.OrderStatus value) {
      validate(fields()[3], value);
      this.orderStatus = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'orderStatus' field has been set.
      * @return True if the 'orderStatus' field has been set, false otherwise.
      */
    public boolean hasOrderStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'orderStatus' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearOrderStatus() {
      orderStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'isOrderPaid' field.
      * @return The value.
      */
    public boolean getIsOrderPaid() {
      return isOrderPaid;
    }


    /**
      * Sets the value of the 'isOrderPaid' field.
      * @param value The value of 'isOrderPaid'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setIsOrderPaid(boolean value) {
      validate(fields()[4], value);
      this.isOrderPaid = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'isOrderPaid' field has been set.
      * @return True if the 'isOrderPaid' field has been set, false otherwise.
      */
    public boolean hasIsOrderPaid() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'isOrderPaid' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearIsOrderPaid() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalCost' field.
      * @return The value.
      */
    public double getTotalCost() {
      return totalCost;
    }


    /**
      * Sets the value of the 'totalCost' field.
      * @param value The value of 'totalCost'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setTotalCost(double value) {
      validate(fields()[5], value);
      this.totalCost = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'totalCost' field has been set.
      * @return True if the 'totalCost' field has been set, false otherwise.
      */
    public boolean hasTotalCost() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'totalCost' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearTotalCost() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderItems' field.
      * @return The value.
      */
    public java.util.List<com.whizpath.kafka.generated.OrderItem> getOrderItems() {
      return orderItems;
    }


    /**
      * Sets the value of the 'orderItems' field.
      * @param value The value of 'orderItems'.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder setOrderItems(java.util.List<com.whizpath.kafka.generated.OrderItem> value) {
      validate(fields()[6], value);
      this.orderItems = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'orderItems' field has been set.
      * @return True if the 'orderItems' field has been set, false otherwise.
      */
    public boolean hasOrderItems() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'orderItems' field.
      * @return This builder.
      */
    public com.whizpath.kafka.generated.OrderValue.Builder clearOrderItems() {
      orderItems = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderValue build() {
      try {
        OrderValue record = new OrderValue();
        record.orderID = fieldSetFlags()[0] ? this.orderID : (java.lang.String) defaultValue(fields()[0]);
        record.orderType = fieldSetFlags()[1] ? this.orderType : (com.whizpath.kafka.generated.OrderType) defaultValue(fields()[1]);
        record.orderDate = fieldSetFlags()[2] ? this.orderDate : (java.lang.String) defaultValue(fields()[2]);
        record.orderStatus = fieldSetFlags()[3] ? this.orderStatus : (com.whizpath.kafka.generated.OrderStatus) defaultValue(fields()[3]);
        record.isOrderPaid = fieldSetFlags()[4] ? this.isOrderPaid : (java.lang.Boolean) defaultValue(fields()[4]);
        record.totalCost = fieldSetFlags()[5] ? this.totalCost : (java.lang.Double) defaultValue(fields()[5]);
        record.orderItems = fieldSetFlags()[6] ? this.orderItems : (java.util.List<com.whizpath.kafka.generated.OrderItem>) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderValue>
    READER$ = (org.apache.avro.io.DatumReader<OrderValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.orderID);

    out.writeEnum(this.orderType.ordinal());

    out.writeString(this.orderDate);

    out.writeEnum(this.orderStatus.ordinal());

    out.writeBoolean(this.isOrderPaid);

    out.writeDouble(this.totalCost);

    long size0 = this.orderItems.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.whizpath.kafka.generated.OrderItem e0: this.orderItems) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.orderID = in.readString();

      this.orderType = com.whizpath.kafka.generated.OrderType.values()[in.readEnum()];

      this.orderDate = in.readString();

      this.orderStatus = com.whizpath.kafka.generated.OrderStatus.values()[in.readEnum()];

      this.isOrderPaid = in.readBoolean();

      this.totalCost = in.readDouble();

      long size0 = in.readArrayStart();
      java.util.List<com.whizpath.kafka.generated.OrderItem> a0 = this.orderItems;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.whizpath.kafka.generated.OrderItem>((int)size0, SCHEMA$.getField("orderItems").schema());
        this.orderItems = a0;
      } else a0.clear();
      SpecificData.Array<com.whizpath.kafka.generated.OrderItem> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.whizpath.kafka.generated.OrderItem>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.whizpath.kafka.generated.OrderItem e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.whizpath.kafka.generated.OrderItem();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.orderID = in.readString();
          break;

        case 1:
          this.orderType = com.whizpath.kafka.generated.OrderType.values()[in.readEnum()];
          break;

        case 2:
          this.orderDate = in.readString();
          break;

        case 3:
          this.orderStatus = com.whizpath.kafka.generated.OrderStatus.values()[in.readEnum()];
          break;

        case 4:
          this.isOrderPaid = in.readBoolean();
          break;

        case 5:
          this.totalCost = in.readDouble();
          break;

        case 6:
          long size0 = in.readArrayStart();
          java.util.List<com.whizpath.kafka.generated.OrderItem> a0 = this.orderItems;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.whizpath.kafka.generated.OrderItem>((int)size0, SCHEMA$.getField("orderItems").schema());
            this.orderItems = a0;
          } else a0.clear();
          SpecificData.Array<com.whizpath.kafka.generated.OrderItem> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.whizpath.kafka.generated.OrderItem>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.whizpath.kafka.generated.OrderItem e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.whizpath.kafka.generated.OrderItem();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










