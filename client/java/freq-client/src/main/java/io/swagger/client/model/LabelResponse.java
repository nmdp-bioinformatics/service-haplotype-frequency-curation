/*
 * Haplotype Frequency Curation Service
 * Allows to store and return haplotype frequency data
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LabelData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LabelResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T08:14:07.511-07:00")
public class LabelResponse {
  @SerializedName("LabelsList")
  private List<LabelData> labelsList = null;

  public LabelResponse labelsList(List<LabelData> labelsList) {
    this.labelsList = labelsList;
    return this;
  }

  public LabelResponse addLabelsListItem(LabelData labelsListItem) {
    if (this.labelsList == null) {
      this.labelsList = new ArrayList<LabelData>();
    }
    this.labelsList.add(labelsListItem);
    return this;
  }

   /**
   * List of labels
   * @return labelsList
  **/
  @ApiModelProperty(value = "List of labels")
  public List<LabelData> getLabelsList() {
    return labelsList;
  }

  public void setLabelsList(List<LabelData> labelsList) {
    this.labelsList = labelsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelResponse labelResponse = (LabelResponse) o;
    return Objects.equals(this.labelsList, labelResponse.labelsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelResponse {\n");
    
    sb.append("    labelsList: ").append(toIndentedString(labelsList)).append("\n");
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

