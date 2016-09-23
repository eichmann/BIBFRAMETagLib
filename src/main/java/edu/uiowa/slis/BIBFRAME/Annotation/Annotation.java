package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Annotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Annotation currentInstance = null;
	private static final Log log = LogFactory.getLog(Annotation.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String annotatedAt = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AnnotationIterator theAnnotationIterator = (AnnotationIterator) findAncestorWithClass(this, AnnotationIterator.class);

			if (theAnnotationIterator != null) {
				subjectURI = theAnnotationIterator.getSubjectURI();
				label = theAnnotationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator)this.getParent()).getIsBodyOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator)this.getParent()).getIsAnnotatorOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Motivation.MotivationMotivatedByInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Motivation.MotivationMotivatedByInverseIterator)this.getParent()).getMotivatedByInverse();
			}

			edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator theContentAsTextIsBodyOfIterator = (edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator.class);

			if (subjectURI == null && theContentAsTextIsBodyOfIterator != null) {
				subjectURI = theContentAsTextIsBodyOfIterator.getIsBodyOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator theMonographHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator.class);

			if (subjectURI == null && theMonographHasAnnotationIterator != null) {
				subjectURI = theMonographHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator theTextHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator.class);

			if (subjectURI == null && theTextHasAnnotationIterator != null) {
				subjectURI = theTextHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator theAudioHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator.class);

			if (subjectURI == null && theAudioHasAnnotationIterator != null) {
				subjectURI = theAudioHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator theNotatedMusicHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator.class);

			if (subjectURI == null && theNotatedMusicHasAnnotationIterator != null) {
				subjectURI = theNotatedMusicHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator theSerialHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator.class);

			if (subjectURI == null && theSerialHasAnnotationIterator != null) {
				subjectURI = theSerialHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator theInstanceHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator.class);

			if (subjectURI == null && theInstanceHasAnnotationIterator != null) {
				subjectURI = theInstanceHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator theCollectionHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator.class);

			if (subjectURI == null && theCollectionHasAnnotationIterator != null) {
				subjectURI = theCollectionHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator theRWOHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator.class);

			if (subjectURI == null && theRWOHasAnnotationIterator != null) {
				subjectURI = theRWOHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator theCartographyHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator.class);

			if (subjectURI == null && theCartographyHasAnnotationIterator != null) {
				subjectURI = theCartographyHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator theStillImageHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator.class);

			if (subjectURI == null && theStillImageHasAnnotationIterator != null) {
				subjectURI = theStillImageHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator theAgentIsAnnotatorOfIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator.class);

			if (subjectURI == null && theAgentIsAnnotatorOfIterator != null) {
				subjectURI = theAgentIsAnnotatorOfIterator.getIsAnnotatorOf();
			}

			if (theAnnotationIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  ?annotatedAt where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/ns/oa#annotatedAt> ?annotatedAt } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					annotatedAt = sol.get("?annotatedAt") == null ? null : sol.get("?annotatedAt").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Annotation doStartTag", e);
			throw new JspTagException("Exception raised in Annotation doStartTag");
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
			log.error("Exception raised in Annotation doEndTag", e);
			throw new JspTagException("Exception raised in Annotation doEndTag");
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

	public void setAnnotatedAt(String annotatedAt) {
		this.annotatedAt = annotatedAt;
	}

	public String getAnnotatedAt() {
		return annotatedAt;
	}

}
