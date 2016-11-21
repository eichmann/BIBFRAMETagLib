package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Cartography extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Cartography currentInstance = null;
	private static final Log log = LogFactory.getLog(Cartography.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String cartographicEasternmostLongitude = null;
	String cartographicWesternmostLongitude = null;
	String cartographicZone = null;
	String cartographicNorthernmostLatitude = null;
	String cartographicSouthernmostLatitude = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CartographyIterator theCartographyIterator = (CartographyIterator) findAncestorWithClass(this, CartographyIterator.class);

			if (theCartographyIterator != null) {
				subjectURI = theCartographyIterator.getSubjectURI();
				label = theCartographyIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator theDatasetIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator.class);

			if (subjectURI == null && theDatasetIsPartOfIterator != null) {
				subjectURI = theDatasetIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator theThreeDimensionalObjectIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectIsPartOfIterator != null) {
				subjectURI = theThreeDimensionalObjectIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator theIntegratingResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator.class);

			if (subjectURI == null && theIntegratingResourceIsPartOfIterator != null) {
				subjectURI = theIntegratingResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator theNonSortElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator.class);

			if (subjectURI == null && theNonSortElementIsPartOfIterator != null) {
				subjectURI = theNonSortElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator theCollectionIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator.class);

			if (subjectURI == null && theCollectionIsPartOfIterator != null) {
				subjectURI = theCollectionIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator theMainTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theMainTitleElementIsPartOfIterator != null) {
				subjectURI = theMainTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator thePartNameElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator.class);

			if (subjectURI == null && thePartNameElementIsPartOfIterator != null) {
				subjectURI = thePartNameElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator theSubTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theSubTitleElementIsPartOfIterator != null) {
				subjectURI = theSubTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator thePartNumberElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator.class);

			if (subjectURI == null && thePartNumberElementIsPartOfIterator != null) {
				subjectURI = thePartNumberElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator theMultimediaIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator.class);

			if (subjectURI == null && theMultimediaIsPartOfIterator != null) {
				subjectURI = theMultimediaIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator theFamilyIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator.class);

			if (subjectURI == null && theFamilyIsPartOfIterator != null) {
				subjectURI = theFamilyIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator theThreeDimensionalObjectPrecedesIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectPrecedesIterator != null) {
				subjectURI = theThreeDimensionalObjectPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator theNonSortElementPrecedesIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator.class);

			if (subjectURI == null && theNonSortElementPrecedesIterator != null) {
				subjectURI = theNonSortElementPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator theThreeDimensionalObjectIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectIsSubjectOfIterator != null) {
				subjectURI = theThreeDimensionalObjectIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator theAuthorityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator.class);

			if (subjectURI == null && theAuthorityIsSubjectOfIterator != null) {
				subjectURI = theAuthorityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator.class);

			if (subjectURI == null && theTopicIsSubjectOfIterator != null) {
				subjectURI = theTopicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator theMeetingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator.class);

			if (subjectURI == null && theMeetingIsSubjectOfIterator != null) {
				subjectURI = theMeetingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator theStillImageIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator.class);

			if (subjectURI == null && theStillImageIsSubjectOfIterator != null) {
				subjectURI = theStillImageIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator theTemporalEntityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator.class);

			if (subjectURI == null && theTemporalEntityIsSubjectOfIterator != null) {
				subjectURI = theTemporalEntityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator theConferenceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator.class);

			if (subjectURI == null && theConferenceIsSubjectOfIterator != null) {
				subjectURI = theConferenceIsSubjectOfIterator.getIsSubjectOf();
			}

			if (theCartographyIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?cartographicEasternmostLongitude ?cartographicWesternmostLongitude ?cartographicZone ?cartographicNorthernmostLatitude ?cartographicSouthernmostLatitude where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicEasternmostLongitude> ?cartographicEasternmostLongitude } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicWesternmostLongitude> ?cartographicWesternmostLongitude } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicZone> ?cartographicZone } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicNorthernmostLatitude> ?cartographicNorthernmostLatitude } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicSouthernmostLatitude> ?cartographicSouthernmostLatitude } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					cartographicEasternmostLongitude = sol.get("?cartographicEasternmostLongitude") == null ? null : sol.get("?cartographicEasternmostLongitude").toString();
					cartographicWesternmostLongitude = sol.get("?cartographicWesternmostLongitude") == null ? null : sol.get("?cartographicWesternmostLongitude").toString();
					cartographicZone = sol.get("?cartographicZone") == null ? null : sol.get("?cartographicZone").toString();
					cartographicNorthernmostLatitude = sol.get("?cartographicNorthernmostLatitude") == null ? null : sol.get("?cartographicNorthernmostLatitude").toString();
					cartographicSouthernmostLatitude = sol.get("?cartographicSouthernmostLatitude") == null ? null : sol.get("?cartographicSouthernmostLatitude").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Cartography doStartTag", e);
			throw new JspTagException("Exception raised in Cartography doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Cartography doEndTag", e);
			throw new JspTagException("Exception raised in Cartography doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setCartographicEasternmostLongitude(String cartographicEasternmostLongitude) {
		this.cartographicEasternmostLongitude = cartographicEasternmostLongitude;
	}

	public String getCartographicEasternmostLongitude() {
		return cartographicEasternmostLongitude;
	}

	public void setCartographicWesternmostLongitude(String cartographicWesternmostLongitude) {
		this.cartographicWesternmostLongitude = cartographicWesternmostLongitude;
	}

	public String getCartographicWesternmostLongitude() {
		return cartographicWesternmostLongitude;
	}

	public void setCartographicZone(String cartographicZone) {
		this.cartographicZone = cartographicZone;
	}

	public String getCartographicZone() {
		return cartographicZone;
	}

	public void setCartographicNorthernmostLatitude(String cartographicNorthernmostLatitude) {
		this.cartographicNorthernmostLatitude = cartographicNorthernmostLatitude;
	}

	public String getCartographicNorthernmostLatitude() {
		return cartographicNorthernmostLatitude;
	}

	public void setCartographicSouthernmostLatitude(String cartographicSouthernmostLatitude) {
		this.cartographicSouthernmostLatitude = cartographicSouthernmostLatitude;
	}

	public String getCartographicSouthernmostLatitude() {
		return cartographicSouthernmostLatitude;
	}

}
