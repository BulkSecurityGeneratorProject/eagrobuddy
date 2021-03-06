package com.eagro.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Segments entity.
 */
@Entity
@Table(name = "segment")
public class Segment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_segment")
    @SequenceGenerator(name = "sequence_segment", sequenceName = "sequence_segment", allocationSize = 1)
    private Long segmentId;

    @Column(name = "segment_name")
    private String segmentName;

    @Column(name = "segment_desc")
    private String segmentDesc;

    @Column(name = "start_x")
    private Double startX;

    @Column(name = "start_y")
    private Double startY;

    @Column(name = "end_x")
    private Double endX;

    @Column(name = "end_y")
    private Double endY;

    @Column(name = "active_flag")
    private boolean activeFlag;
    
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "created_date", columnDefinition = "TIMESTAMP(3)")
    private LocalDateTime createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @ManyToOne
    @JoinColumn(name = "layout_id")
    private Layout layout;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;


    public Long getSegmentId() {
        return segmentId;
    }

    public Segment segmentId(Long segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public Segment segmentName(String segmentName) {
        this.segmentName = segmentName;
        return this;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getSegmentDesc() {
        return segmentDesc;
    }

    public Segment segmentDesc(String segmentDesc) {
        this.segmentDesc = segmentDesc;
        return this;
    }

    public void setSegmentDesc(String segmentDesc) {
        this.segmentDesc = segmentDesc;
    }

    public Double getStartX() {
        return startX;
    }

    public Segment startX(Double startX) {
        this.startX = startX;
        return this;
    }

    public void setStartX(Double startX) {
        this.startX = startX;
    }

    public Double getStartY() {
        return startY;
    }

    public Segment startY(Double startY) {
        this.startY = startY;
        return this;
    }

    public void setStartY(Double startY) {
        this.startY = startY;
    }

    public Double getEndX() {
        return endX;
    }

    public Segment endX(Double endX) {
        this.endX = endX;
        return this;
    }

    public void setEndX(Double endX) {
        this.endX = endX;
    }

    public Double getEndY() {
        return endY;
    }

    public Segment endY(Double endY) {
        this.endY = endY;
        return this;
    }

    public void setEndY(Double endY) {
        this.endY = endY;
    }

   

    public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	

    public String getCreatedBy() {
        return createdBy;
    }

    public Segment createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }



    public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
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

    public Segment updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Layout getLayout() {
        return layout;
    }

    public Segment layout(Layout layout) {
        this.layout = layout;
        return this;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Section getSection() {
        return section;
    }

    public Segment section(Section section) {
        this.section = section;
        return this;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Segment segment = (Segment) o;
        if (segment.getSegmentId() == null || getSegmentId() == null) {
            return false;
        }
        return Objects.equals(getSegmentId(), segment.getSegmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSegmentId());
    }

    @Override
    public String toString() {
        return "Segment{" +
            ", segmentId=" + getSegmentId() +
            ", segmentName='" + getSegmentName() + "'" +
            ", segmentDesc='" + getSegmentDesc() + "'" +
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
}
