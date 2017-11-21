/*
 * Statistics Service
 * Statistics Service
 *
 * OpenAPI spec version: 9.0.000.00.367
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.statistics.model;

import java.util.Objects;
import com.genesys.internal.statistics.model.ApiResponseStatus;
import com.genesys.internal.statistics.model.ModelApiResponse;
import com.genesys.internal.statistics.model.StatisticData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatisticDataResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-21T12:04:42.064Z")
public class StatisticDataResponse {
  @SerializedName("data")
  private StatisticData data = null;

  @SerializedName("errors")
  private List<ModelApiResponse> errors = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("status")
  private ApiResponseStatus status = null;

  public StatisticDataResponse data(StatisticData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public StatisticData getData() {
    return data;
  }

  public void setData(StatisticData data) {
    this.data = data;
  }

  public StatisticDataResponse errors(List<ModelApiResponse> errors) {
    this.errors = errors;
    return this;
  }

  public StatisticDataResponse addErrorsItem(ModelApiResponse errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ModelApiResponse>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<ModelApiResponse> getErrors() {
    return errors;
  }

  public void setErrors(List<ModelApiResponse> errors) {
    this.errors = errors;
  }

  public StatisticDataResponse path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public StatisticDataResponse status(ApiResponseStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public ApiResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticDataResponse statisticDataResponse = (StatisticDataResponse) o;
    return Objects.equals(this.data, statisticDataResponse.data) &&
        Objects.equals(this.errors, statisticDataResponse.errors) &&
        Objects.equals(this.path, statisticDataResponse.path) &&
        Objects.equals(this.status, statisticDataResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, path, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticDataResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

