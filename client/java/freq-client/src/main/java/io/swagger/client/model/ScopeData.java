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
import io.swagger.client.model.ScopeElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScopeData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T08:14:07.511-07:00")
public class ScopeData {
  @SerializedName("ScopeElement")
  private List<ScopeElement> scopeElement = new ArrayList<ScopeElement>();

  public ScopeData scopeElement(List<ScopeElement> scopeElement) {
    this.scopeElement = scopeElement;
    return this;
  }

  public ScopeData addScopeElementItem(ScopeElement scopeElementItem) {
    this.scopeElement.add(scopeElementItem);
    return this;
  }

   /**
   * Additional Information on genotype
   * @return scopeElement
  **/
  @ApiModelProperty(required = true, value = "Additional Information on genotype")
  public List<ScopeElement> getScopeElement() {
    return scopeElement;
  }

  public void setScopeElement(List<ScopeElement> scopeElement) {
    this.scopeElement = scopeElement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeData scopeData = (ScopeData) o;
    return Objects.equals(this.scopeElement, scopeData.scopeElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeElement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeData {\n");
    
    sb.append("    scopeElement: ").append(toIndentedString(scopeElement)).append("\n");
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

