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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator)this.getParent()).getIsAnnotatorOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Motivation.MotivationMotivatedByInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Motivation.MotivationMotivatedByInverseIterator)this.getParent()).getMotivatedByInverse();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator theAgentIsAnnotatorOfIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator.class);

			if (subjectURI == null && theAgentIsAnnotatorOfIterator != null) {
				subjectURI = theAgentIsAnnotatorOfIterator.getIsAnnotatorOf();
			}

			if (theAnnotationIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?annotatedAt where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/ns/oa#annotatedAt> ?annotatedAt } "
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
