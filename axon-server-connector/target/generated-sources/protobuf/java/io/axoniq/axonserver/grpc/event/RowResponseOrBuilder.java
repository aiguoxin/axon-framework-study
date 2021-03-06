// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event.proto

package io.axoniq.axonserver.grpc.event;

public interface RowResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.axoniq.axonserver.grpc.event.RowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The values which, when combined, uniquely update this row. Any previously received values with the same identifiers should be replaced with this value 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue id_values = 1;</code>
   */
  java.util.List<io.axoniq.axonserver.grpc.event.QueryValue> 
      getIdValuesList();
  /**
   * <pre>
   * The values which, when combined, uniquely update this row. Any previously received values with the same identifiers should be replaced with this value 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue id_values = 1;</code>
   */
  io.axoniq.axonserver.grpc.event.QueryValue getIdValues(int index);
  /**
   * <pre>
   * The values which, when combined, uniquely update this row. Any previously received values with the same identifiers should be replaced with this value 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue id_values = 1;</code>
   */
  int getIdValuesCount();
  /**
   * <pre>
   * The values which, when combined, uniquely update this row. Any previously received values with the same identifiers should be replaced with this value 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue id_values = 1;</code>
   */
  java.util.List<? extends io.axoniq.axonserver.grpc.event.QueryValueOrBuilder> 
      getIdValuesOrBuilderList();
  /**
   * <pre>
   * The values which, when combined, uniquely update this row. Any previously received values with the same identifiers should be replaced with this value 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue id_values = 1;</code>
   */
  io.axoniq.axonserver.grpc.event.QueryValueOrBuilder getIdValuesOrBuilder(
      int index);

  /**
   * <pre>
   * The sorting values to use when sorting this response compared to the others. 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue sort_values = 2;</code>
   */
  java.util.List<io.axoniq.axonserver.grpc.event.QueryValue> 
      getSortValuesList();
  /**
   * <pre>
   * The sorting values to use when sorting this response compared to the others. 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue sort_values = 2;</code>
   */
  io.axoniq.axonserver.grpc.event.QueryValue getSortValues(int index);
  /**
   * <pre>
   * The sorting values to use when sorting this response compared to the others. 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue sort_values = 2;</code>
   */
  int getSortValuesCount();
  /**
   * <pre>
   * The sorting values to use when sorting this response compared to the others. 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue sort_values = 2;</code>
   */
  java.util.List<? extends io.axoniq.axonserver.grpc.event.QueryValueOrBuilder> 
      getSortValuesOrBuilderList();
  /**
   * <pre>
   * The sorting values to use when sorting this response compared to the others. 
   * </pre>
   *
   * <code>repeated .io.axoniq.axonserver.grpc.event.QueryValue sort_values = 2;</code>
   */
  io.axoniq.axonserver.grpc.event.QueryValueOrBuilder getSortValuesOrBuilder(
      int index);

  /**
   * <pre>
   * The actual data values for each of the columns, as a column name -&gt; value mapping 
   * </pre>
   *
   * <code>map&lt;string, .io.axoniq.axonserver.grpc.event.QueryValue&gt; values = 3;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * The actual data values for each of the columns, as a column name -&gt; value mapping 
   * </pre>
   *
   * <code>map&lt;string, .io.axoniq.axonserver.grpc.event.QueryValue&gt; values = 3;</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.axoniq.axonserver.grpc.event.QueryValue>
  getValues();
  /**
   * <pre>
   * The actual data values for each of the columns, as a column name -&gt; value mapping 
   * </pre>
   *
   * <code>map&lt;string, .io.axoniq.axonserver.grpc.event.QueryValue&gt; values = 3;</code>
   */
  java.util.Map<java.lang.String, io.axoniq.axonserver.grpc.event.QueryValue>
  getValuesMap();
  /**
   * <pre>
   * The actual data values for each of the columns, as a column name -&gt; value mapping 
   * </pre>
   *
   * <code>map&lt;string, .io.axoniq.axonserver.grpc.event.QueryValue&gt; values = 3;</code>
   */

  io.axoniq.axonserver.grpc.event.QueryValue getValuesOrDefault(
      java.lang.String key,
      io.axoniq.axonserver.grpc.event.QueryValue defaultValue);
  /**
   * <pre>
   * The actual data values for each of the columns, as a column name -&gt; value mapping 
   * </pre>
   *
   * <code>map&lt;string, .io.axoniq.axonserver.grpc.event.QueryValue&gt; values = 3;</code>
   */

  io.axoniq.axonserver.grpc.event.QueryValue getValuesOrThrow(
      java.lang.String key);
}
