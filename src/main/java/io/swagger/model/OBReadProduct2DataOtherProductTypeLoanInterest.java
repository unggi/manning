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
 * Details about the interest that may be payable to the SME Loan holders
 */
@Schema(description = "Details about the interest that may be payable to the SME Loan holders")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-15T21:20:29.836Z[GMT]")


public class OBReadProduct2DataOtherProductTypeLoanInterest   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("LoanInterestTierBandSet")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet>();

  public OBReadProduct2DataOtherProductTypeLoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest loanInterestTierBandSet(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

  /**
   * Get loanInterestTierBandSet
   * @return loanInterestTierBandSet
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeLoanInterest obReadProduct2DataOtherProductTypeLoanInterest = (OBReadProduct2DataOtherProductTypeLoanInterest) o;
    return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterest.notes) &&
        Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataOtherProductTypeLoanInterest.loanInterestTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, loanInterestTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterest {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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
