package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Thing extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Thing currentInstance = null;
	private static final Log log = LogFactory.getLog(Thing.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ThingIterator theThingIterator = (ThingIterator) findAncestorWithClass(this, ThingIterator.class);

			if (theThingIterator != null) {
				subjectURI = theThingIterator.getSubjectURI();
				label = theThingIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator)this.getParent()).getSourceIndividual();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingSameAsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingSameAsIterator)this.getParent()).getSameAs();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingDifferentFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingDifferentFromIterator)this.getParent()).getDifferentFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator)this.getParent()).getTargetIndividual();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingTopObjectPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingTopObjectPropertyIterator)this.getParent()).getTopObjectProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingBottomObjectPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingBottomObjectPropertyIterator)this.getParent()).getBottomObjectProperty();
			}

			edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator theNegativePropertyAssertionSourceIndividualIterator = (edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator.class);

			if (subjectURI == null && theNegativePropertyAssertionSourceIndividualIterator != null) {
				subjectURI = theNegativePropertyAssertionSourceIndividualIterator.getSourceIndividual();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator theMonographSubjectIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator.class);

			if (subjectURI == null && theMonographSubjectIterator != null) {
				subjectURI = theMonographSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator theTextSubjectIterator = (edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator.class);

			if (subjectURI == null && theTextSubjectIterator != null) {
				subjectURI = theTextSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator.class);

			if (subjectURI == null && theNotatedMusicSubjectIterator != null) {
				subjectURI = theNotatedMusicSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator theSerialSubjectIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator.class);

			if (subjectURI == null && theSerialSubjectIterator != null) {
				subjectURI = theSerialSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator theInstanceSubjectIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator.class);

			if (subjectURI == null && theInstanceSubjectIterator != null) {
				subjectURI = theInstanceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator theRWOSubjectIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator.class);

			if (subjectURI == null && theRWOSubjectIterator != null) {
				subjectURI = theRWOSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator theCartographySubjectIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator.class);

			if (subjectURI == null && theCartographySubjectIterator != null) {
				subjectURI = theCartographySubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingSameAsIterator theThingSameAsIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingSameAsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingSameAsIterator.class);

			if (subjectURI == null && theThingSameAsIterator != null) {
				subjectURI = theThingSameAsIterator.getSameAs();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingDifferentFromIterator theThingDifferentFromIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingDifferentFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingDifferentFromIterator.class);

			if (subjectURI == null && theThingDifferentFromIterator != null) {
				subjectURI = theThingDifferentFromIterator.getDifferentFrom();
			}

			edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator theNegativePropertyAssertionTargetIndividualIterator = (edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator.class);

			if (subjectURI == null && theNegativePropertyAssertionTargetIndividualIterator != null) {
				subjectURI = theNegativePropertyAssertionTargetIndividualIterator.getTargetIndividual();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingTopObjectPropertyIterator theThingTopObjectPropertyIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingTopObjectPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingTopObjectPropertyIterator.class);

			if (subjectURI == null && theThingTopObjectPropertyIterator != null) {
				subjectURI = theThingTopObjectPropertyIterator.getTopObjectProperty();
			}

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingBottomObjectPropertyIterator theThingBottomObjectPropertyIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingBottomObjectPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingBottomObjectPropertyIterator.class);

			if (subjectURI == null && theThingBottomObjectPropertyIterator != null) {
				subjectURI = theThingBottomObjectPropertyIterator.getBottomObjectProperty();
			}

			if (theThingIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
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
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Thing doStartTag", e);
			throw new JspTagException("Exception raised in Thing doStartTag");
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
			log.error("Exception raised in Thing doEndTag", e);
			throw new JspTagException("Exception raised in Thing doEndTag");
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

}
