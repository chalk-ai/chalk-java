// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chalk/graph/v1/sources.proto

// Protobuf Java Version: 4.26.1
package ai.chalk.protos.chalk.graph.v1;

/**
 * Protobuf enum {@code chalk.graph.v1.DatabaseSourceType}
 */
public enum DatabaseSourceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DATABASE_SOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  DATABASE_SOURCE_TYPE_UNSPECIFIED(0),
  /**
   * <code>DATABASE_SOURCE_TYPE_BIGQUERY = 1;</code>
   */
  DATABASE_SOURCE_TYPE_BIGQUERY(1),
  /**
   * <code>DATABASE_SOURCE_TYPE_CLOUDSQL = 2;</code>
   */
  DATABASE_SOURCE_TYPE_CLOUDSQL(2),
  /**
   * <code>DATABASE_SOURCE_TYPE_DATABRICKS = 3;</code>
   */
  DATABASE_SOURCE_TYPE_DATABRICKS(3),
  /**
   * <code>DATABASE_SOURCE_TYPE_MYSQL = 4;</code>
   */
  DATABASE_SOURCE_TYPE_MYSQL(4),
  /**
   * <code>DATABASE_SOURCE_TYPE_POSTGRES = 5;</code>
   */
  DATABASE_SOURCE_TYPE_POSTGRES(5),
  /**
   * <code>DATABASE_SOURCE_TYPE_REDSHIFT = 6;</code>
   */
  DATABASE_SOURCE_TYPE_REDSHIFT(6),
  /**
   * <code>DATABASE_SOURCE_TYPE_SNOWFLAKE = 7;</code>
   */
  DATABASE_SOURCE_TYPE_SNOWFLAKE(7),
  /**
   * <code>DATABASE_SOURCE_TYPE_SQLITE = 8;</code>
   */
  DATABASE_SOURCE_TYPE_SQLITE(8),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      DatabaseSourceType.class.getName());
  }
  /**
   * <code>DATABASE_SOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DATABASE_SOURCE_TYPE_BIGQUERY = 1;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_BIGQUERY_VALUE = 1;
  /**
   * <code>DATABASE_SOURCE_TYPE_CLOUDSQL = 2;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_CLOUDSQL_VALUE = 2;
  /**
   * <code>DATABASE_SOURCE_TYPE_DATABRICKS = 3;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_DATABRICKS_VALUE = 3;
  /**
   * <code>DATABASE_SOURCE_TYPE_MYSQL = 4;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_MYSQL_VALUE = 4;
  /**
   * <code>DATABASE_SOURCE_TYPE_POSTGRES = 5;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_POSTGRES_VALUE = 5;
  /**
   * <code>DATABASE_SOURCE_TYPE_REDSHIFT = 6;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_REDSHIFT_VALUE = 6;
  /**
   * <code>DATABASE_SOURCE_TYPE_SNOWFLAKE = 7;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_SNOWFLAKE_VALUE = 7;
  /**
   * <code>DATABASE_SOURCE_TYPE_SQLITE = 8;</code>
   */
  public static final int DATABASE_SOURCE_TYPE_SQLITE_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DatabaseSourceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatabaseSourceType forNumber(int value) {
    switch (value) {
      case 0: return DATABASE_SOURCE_TYPE_UNSPECIFIED;
      case 1: return DATABASE_SOURCE_TYPE_BIGQUERY;
      case 2: return DATABASE_SOURCE_TYPE_CLOUDSQL;
      case 3: return DATABASE_SOURCE_TYPE_DATABRICKS;
      case 4: return DATABASE_SOURCE_TYPE_MYSQL;
      case 5: return DATABASE_SOURCE_TYPE_POSTGRES;
      case 6: return DATABASE_SOURCE_TYPE_REDSHIFT;
      case 7: return DATABASE_SOURCE_TYPE_SNOWFLAKE;
      case 8: return DATABASE_SOURCE_TYPE_SQLITE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatabaseSourceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DatabaseSourceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DatabaseSourceType>() {
          public DatabaseSourceType findValueByNumber(int number) {
            return DatabaseSourceType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return ai.chalk.protos.chalk.graph.v1.SourcesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DatabaseSourceType[] VALUES = values();

  public static DatabaseSourceType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DatabaseSourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:chalk.graph.v1.DatabaseSourceType)
}
