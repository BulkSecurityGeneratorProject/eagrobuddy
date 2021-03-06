package com.eagro.service.dto;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A DTO for the Section entity.
 */
public class SectionDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long sectionId;

    private String sectionName;

    private String sectionDesc;

    private Double startX;

    private Double startY;

    private Double endX;

    private Double endY;

    private boolean activeFlag;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime updatedDate;

    private String updatedBy;

    private Long layoutId;


    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionDesc() {
        return sectionDesc;
    }

    public void setSectionDesc(String sectionDesc) {
        this.sectionDesc = sectionDesc;
    }

    public Double getStartX() {
        return startX;
    }

    public void setStartX(Double startX) {
        this.startX = startX;
    }

    public Double getStartY() {
        return startY;
    }

    public void setStartY(Double startY) {
        this.startY = startY;
    }

    public Double getEndX() {
        return endX;
    }

    public void setEndX(Double endX) {
        this.endX = endX;
    }

    public Double getEndY() {
        return endY;
    }

    public void setEndY(Double endY) {
        this.endY = endY;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SectionDTO sectionDTO = (SectionDTO) o;
        if(sectionDTO.getSectionId() == null || getSectionId() == null) {
            return false;
        }
        return Objects.equals(getSectionId(), sectionDTO.getSectionId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSectionId());
    }

    @Override
    public String toString() {
        return "SectionDTO{" +
            ", sectionId=" + getSectionId() +
            ", sectionName='" + getSectionName() + "'" +
            ", sectionDesc='" + getSectionDesc() + "'" +
            ", startX=" + getStartX() +
            ", startY=" + getStartY() +
            ", endX=" + getEndX() +
            ", endY=" + getEndY() +
            ", activeFlag='" + isActiveFlag() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            "}";
    }

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
}
