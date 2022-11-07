/*
 * kabuステーションAPI
 * # 定義情報   REST APIのコード一覧、エンドポイントは下記リンク参照     - [REST APIコード一覧](../ptal/error.html)
 *
 * OpenAPI spec version: 1.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * 逆指値条件&lt;br&gt; ※FrontOrderTypeで逆指値を指定した場合のみ必須。
 */
@Schema(description = "逆指値条件<br> ※FrontOrderTypeで逆指値を指定した場合のみ必須。")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T16:10:10.621Z[GMT]")
public class RequestSendOrderReverseLimitOrder {
  @SerializedName("TriggerSec")
  private Integer triggerSec = null;

  @SerializedName("TriggerPrice")
  private Double triggerPrice = null;

  @SerializedName("UnderOver")
  private Integer underOver = null;

  @SerializedName("AfterHitOrderType")
  private Integer afterHitOrderType = null;

  @SerializedName("AfterHitPrice")
  private Double afterHitPrice = null;

  public RequestSendOrderReverseLimitOrder triggerSec(Integer triggerSec) {
    this.triggerSec = triggerSec;
    return this;
  }

   /**
   * トリガ銘柄&lt;br&gt; ※未設定の場合はエラーになります。 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;1&lt;/td&gt;       &lt;td&gt;発注銘柄&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;2&lt;/td&gt;       &lt;td&gt;NK225指数&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;3&lt;/td&gt;       &lt;td&gt;TOPIX指数&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return triggerSec
  **/
  @Schema(required = true, description = "トリガ銘柄<br> ※未設定の場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>発注銘柄</td>     </tr>     <tr>       <td>2</td>       <td>NK225指数</td>     </tr>     <tr>       <td>3</td>       <td>TOPIX指数</td>     </tr>   </tbody> </table>")
  public Integer getTriggerSec() {
    return triggerSec;
  }

  public void setTriggerSec(Integer triggerSec) {
    this.triggerSec = triggerSec;
  }

  public RequestSendOrderReverseLimitOrder triggerPrice(Double triggerPrice) {
    this.triggerPrice = triggerPrice;
    return this;
  }

   /**
   * トリガ価格&lt;br&gt; ※未設定の場合はエラーになります。&lt;br&gt; ※数字以外が設定された場合はエラーになります。
   * @return triggerPrice
  **/
  @Schema(required = true, description = "トリガ価格<br> ※未設定の場合はエラーになります。<br> ※数字以外が設定された場合はエラーになります。")
  public Double getTriggerPrice() {
    return triggerPrice;
  }

  public void setTriggerPrice(Double triggerPrice) {
    this.triggerPrice = triggerPrice;
  }

  public RequestSendOrderReverseLimitOrder underOver(Integer underOver) {
    this.underOver = underOver;
    return this;
  }

   /**
   * 以上／以下&lt;br&gt; ※未設定の場合はエラーになります。&lt;br&gt; ※1、2以外が指定された場合はエラーになります。 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;1&lt;/td&gt;       &lt;td&gt;以下&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;2&lt;/td&gt;       &lt;td&gt;以上&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return underOver
  **/
  @Schema(required = true, description = "以上／以下<br> ※未設定の場合はエラーになります。<br> ※1、2以外が指定された場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>以下</td>     </tr>     <tr>       <td>2</td>       <td>以上</td>     </tr>   </tbody> </table>")
  public Integer getUnderOver() {
    return underOver;
  }

  public void setUnderOver(Integer underOver) {
    this.underOver = underOver;
  }

  public RequestSendOrderReverseLimitOrder afterHitOrderType(Integer afterHitOrderType) {
    this.afterHitOrderType = afterHitOrderType;
    return this;
  }

   /**
   * ヒット後執行条件&lt;br&gt; ※未設定の場合はエラーになります。&lt;br&gt; ※1、2、3以外が指定された場合はエラーになります。 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;1&lt;/td&gt;       &lt;td&gt;成行&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;2&lt;/td&gt;       &lt;td&gt;指値&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;3&lt;/td&gt;       &lt;td&gt;不成&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return afterHitOrderType
  **/
  @Schema(required = true, description = "ヒット後執行条件<br> ※未設定の場合はエラーになります。<br> ※1、2、3以外が指定された場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>成行</td>     </tr>     <tr>       <td>2</td>       <td>指値</td>     </tr>     <tr>       <td>3</td>       <td>不成</td>     </tr>   </tbody> </table>")
  public Integer getAfterHitOrderType() {
    return afterHitOrderType;
  }

  public void setAfterHitOrderType(Integer afterHitOrderType) {
    this.afterHitOrderType = afterHitOrderType;
  }

  public RequestSendOrderReverseLimitOrder afterHitPrice(Double afterHitPrice) {
    this.afterHitPrice = afterHitPrice;
    return this;
  }

   /**
   * ヒット後注文価格&lt;br&gt; ※未設定の場合はエラーになります。&lt;br&gt; ※数字以外が設定された場合はエラーになります。&lt;br&gt;&lt;br&gt; ヒット後執行条件に従い、下記のようにヒット後注文価格を設定してください。  &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;ヒット後執行条件&lt;/th&gt;           &lt;th&gt;設定価格&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;成行&lt;/td&gt;       &lt;td&gt;0&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;指値&lt;/td&gt;       &lt;td&gt;指値の単価&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;不成&lt;/td&gt;       &lt;td&gt;不成の単価&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return afterHitPrice
  **/
  @Schema(required = true, description = "ヒット後注文価格<br> ※未設定の場合はエラーになります。<br> ※数字以外が設定された場合はエラーになります。<br><br> ヒット後執行条件に従い、下記のようにヒット後注文価格を設定してください。  <table>   <thead>       <tr>           <th>ヒット後執行条件</th>           <th>設定価格</th>       </tr>   </thead>   <tbody>     <tr>       <td>成行</td>       <td>0</td>     </tr>     <tr>       <td>指値</td>       <td>指値の単価</td>     </tr>     <tr>       <td>不成</td>       <td>不成の単価</td>     </tr>   </tbody> </table>")
  public Double getAfterHitPrice() {
    return afterHitPrice;
  }

  public void setAfterHitPrice(Double afterHitPrice) {
    this.afterHitPrice = afterHitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSendOrderReverseLimitOrder requestSendOrderReverseLimitOrder = (RequestSendOrderReverseLimitOrder) o;
    return Objects.equals(this.triggerSec, requestSendOrderReverseLimitOrder.triggerSec) &&
        Objects.equals(this.triggerPrice, requestSendOrderReverseLimitOrder.triggerPrice) &&
        Objects.equals(this.underOver, requestSendOrderReverseLimitOrder.underOver) &&
        Objects.equals(this.afterHitOrderType, requestSendOrderReverseLimitOrder.afterHitOrderType) &&
        Objects.equals(this.afterHitPrice, requestSendOrderReverseLimitOrder.afterHitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSendOrderReverseLimitOrder {\n");
    
    sb.append("    triggerSec: ").append(toIndentedString(triggerSec)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
    sb.append("    underOver: ").append(toIndentedString(underOver)).append("\n");
    sb.append("    afterHitOrderType: ").append(toIndentedString(afterHitOrderType)).append("\n");
    sb.append("    afterHitPrice: ").append(toIndentedString(afterHitPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}