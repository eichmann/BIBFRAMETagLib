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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator theRWOIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator.class);

			if (subjectURI == null && theRWOIsSubjectOfIterator != null) {
				subjectURI = theRWOIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator.class);

			if (subjectURI == null && theTopicIsSubjectOfIterator != null) {
				subjectURI = theTopicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator theAuthorityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator.class);

			if (subjectURI == null && theAuthorityIsSubjectOfIterator != null) {
				subjectURI = theAuthorityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator thePersonIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator.class);

			if (subjectURI == null && thePersonIsSubjectOfIterator != null) {
				subjectURI = thePersonIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator theThingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator.class);

			if (subjectURI == null && theThingIsSubjectOfIterator != null) {
				subjectURI = theThingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator theOrganizationIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator.class);

			if (subjectURI == null && theOrganizationIsSubjectOfIterator != null) {
				subjectURI = theOrganizationIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator theWorkIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator.class);

			if (subjectURI == null && theWorkIsSubjectOfIterator != null) {
				subjectURI = theWorkIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator theConferenceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator.class);

			if (subjectURI == null && theConferenceIsSubjectOfIterator != null) {
				subjectURI = theConferenceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator theMonographIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator.class);

			if (subjectURI == null && theMonographIsSubjectOfIterator != null) {
				subjectURI = theMonographIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator theTemporalEntityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator.class);

			if (subjectURI == null && theTemporalEntityIsSubjectOfIterator != null) {
				subjectURI = theTemporalEntityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator theTextIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator.class);

			if (subjectURI == null && theTextIsSubjectOfIterator != null) {
				subjectURI = theTextIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator theMeetingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator.class);

			if (subjectURI == null && theMeetingIsSubjectOfIterator != null) {
				subjectURI = theMeetingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator theNotatedMusicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator.class);

			if (subjectURI == null && theNotatedMusicIsSubjectOfIterator != null) {
				subjectURI = theNotatedMusicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator theLocationIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator.class);

			if (subjectURI == null && theLocationIsSubjectOfIterator != null) {
				subjectURI = theLocationIsSubjectOfIterator.getIsSubjectOf();
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
