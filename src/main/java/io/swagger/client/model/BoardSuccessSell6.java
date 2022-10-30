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
 * 売気配数量6本目
 */
@Schema(description = "売気配数量6本目")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T16:10:10.621Z[GMT]")
public class BoardSuccessSell6 {
  @SerializedName("Price")
  private Double price = null;

  @SerializedName("Qty")
  private Double qty = null;

  public BoardSuccessSell6 price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * 値段&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return price
  **/
  @Schema(description = "値段<br>※株式・先物・オプション銘柄の場合のみ")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public BoardSuccessSell6 qty(Double qty) {
    this.qty = qty;
    return this;
  }

   /**
   * 数量&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return qty
  **/
  @Schema(description = "数量<br>※株式・先物・オプション銘柄の場合のみ")
  public Double getQty() {
    return qty;
  }

  public void setQty(Double qty) {
    this.qty = qty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardSuccessSell6 boardSuccessSell6 = (BoardSuccessSell6) o;
    return Objects.equals(this.price, boardSuccessSell6.price) &&
        Objects.equals(this.qty, boardSuccessSell6.qty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, qty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSuccessSell6 {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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
