package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Overdraft fees and charges details
 */
@Schema(description = "Overdraft fees and charges details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-15T21:20:29.836Z[GMT]")


public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1   {
  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail>();

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 overdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 addOverdraftFeeChargeCapItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
   **/
  @Schema(description = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 overdraftFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeDetail
   * @return overdraftFeeChargeDetail
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1) o;
    return Objects.equals(this.overdraftFeeChargeCap, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 {\n");
    
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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
